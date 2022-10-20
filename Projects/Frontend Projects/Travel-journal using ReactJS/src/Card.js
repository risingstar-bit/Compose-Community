function Card(props){
    console.log(props)
    return (
            <div className='card-component-box'>
                <div className='card-component'>
                    <img className="location-img" src={props.locationImg}></img>
                    <div className='location-info'>
                        <img src={props.iconImg}></img>
                        <span className='country-name'>{props.location}</span>
                        <a href={props.url}>View on Google Maps</a>
                        <h2>{props.title}</h2>
                        <p className='visit-date'>{props.startDate}-{props.endDate}</p>
                        <p className='location-text'>{props.description}</p>
                    </div>
                </div>
            </div>
    )
}
export default Card;