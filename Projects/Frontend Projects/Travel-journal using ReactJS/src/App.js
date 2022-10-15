import './App.css';
import location from './location.png'
import data from "./data.js"
import japan from './japan.jpg'
import Card from './Card';
function App() {
  const cards = data.map((element) => {
    return (
      <Card
        location={element.location}
        locationImg={element.locationImg}
        title={element.title}
        startDate={element.startDate}
        endDate={element.endDate}
        description={element.description}
        url={element.url}
        iconImg={element.iconImg}
      />
    )
  })
  console.log(data)
  return (
    <div className='outer-container'>
      <nav>
        my travel journal.
      </nav>
      {cards}
    </div>
  );
}

export default App;
