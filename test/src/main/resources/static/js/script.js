
const events = [
    {
      "id": 1,
      "image": "https://picsum.photos/id/1015/300/200",
      "destination": "Paris, France",
      "time": "2023-04-12T12:00:00Z",
      "price": 150
    },
    {
      "id": 2,
      "image": "https://picsum.photos/id/1016/300/200",
      "destination": "Tokyo, Japan",
      "time": "2023-05-12T12:00:00Z",
      "price": 250
    },
    {
      "id": 3,
      "image": "https://picsum.photos/id/1011/300/200",
      "destination": "New York, USA",
      "time": "2023-06-12T12:00:00Z",
      "price": 350
    }
  ];

  const eventList = document.getElementById("eventList");

  events.forEach(event => {
    const eventDiv = document.createElement("div");
    eventDiv.classList.add("event-item");

    const image = document.createElement("img");
    image.src = event.image;
    image.alt = event.destination;
    eventDiv.appendChild(image);

    const destination = document.createElement("p");
    destination.textContent = event.destination;
    eventDiv.appendChild(destination);

    const time = document.createElement("p");
    time.textContent = new Date(event.time).toLocaleDateString();
    eventDiv.appendChild(time);

    const price = document.createElement("p");
    price.textContent = `$${event.price}`;
    eventDiv.appendChild(price);

    eventList.appendChild(eventDiv);});
