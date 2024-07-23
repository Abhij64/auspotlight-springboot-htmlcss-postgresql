document.addEventListener('DOMContentLoaded', function() {
    // Sample event data (replace this with actual event data)
    const eventsData = [
        {
            id: 1,
            title: 'GDSC',
            type: 'Technical',
            venue: 'H-Block',
            date: '24-04-24',
            time: '10:00 AM',
            price: '0',
            imagePath: 'https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/205a1c82598731.5d22ec536ba04.jpg' // Add image path
        }
    ];

    // Function to display events
    function displayEvents() {
        const eventList = document.querySelector('.event-list');

        // Clear existing events
        eventList.innerHTML = '';

        eventsData.forEach(event => {
            const eventElement = `
                <div class="event">
                    <img src="${event.imagePath}" alt="${event.title}" class="event-image">
                    <h3>${event.title}</h3>
                    <p>Type: ${event.type}</p>
                    <p>Venue: ${event.venue}</p>
                    <p>Date: ${event.date}</p>
                    <p>Time: ${event.time}</p>
                    <p>Price: ${event.price}</p>
                </div>
            `;

            eventList.innerHTML += eventElement;
        });
    }

    // Call displayEvents function to initially display events
    displayEvents();

    // Sample function to register an event (replace with actual registration logic)
    window.registerEvent = function(eventId) {
        alert(`Event with ID ${eventId} registered successfully!`);
    };

    // Sample function to show "My Events" (replace with actual logic if needed)
    window.showMyEvents = function() {
        alert('Showing My Events');
    };

    // Sample function to go back (replace with actual go back logic)
    window.goBack = function() {
        alert('Going back');
    };
});
