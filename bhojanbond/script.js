const form = document.getElementById("donationForm");
const status = document.getElementById("status");

form.addEventListener("submit", async function (e) {
    e.preventDefault();

    const data = {
        donorName: document.getElementById("name").value,
        foodItem: document.getElementById("food").value,
        quantity: document.getElementById("quantity").value,
        location: document.getElementById("location").value,
        phone: document.getElementById("phone").value
    };

    status.innerHTML = "Submitting...";

    try {
        const response = await fetch(
            "https://gduraiyammal.app.n8n.cloud/webhook-test/395f7ca4-b231-4b1d-b254-07ad3d5b7fe6",
            {
                method: "POST",
                mode: "cors",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(data)
            }
        );

        if (response.ok) {
            status.innerHTML = "✅ Donation Submitted Successfully!";
            form.reset();
        } else {
            status.innerHTML = "❌ Submission Failed!";
            console.log(await response.text());
        }

    } catch (error) {
        console.error(error);
        status.innerHTML = "⚠️ Cannot connect to n8n";
    }
});