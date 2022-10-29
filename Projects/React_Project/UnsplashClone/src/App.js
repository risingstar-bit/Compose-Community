import {BrowserRouter , Routes , Route} from "react-router-dom"
import Home from "./pages/Home"
import NavPages  from "./pages/NavPages";
function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/Editorials"   element={<NavPages name={"Editorials"}/>}/>
          <Route path="/Events"   element={<NavPages name={"Current Events"}/>}/>
          <Route path="/Wallpapers"   element={<NavPages name={"Wallpapers"}/>}/>
          <Route path="/Renders"  element={<NavPages name={"3D Renders"}/>}/>
          <Route path="/Patterns"   element={<NavPages name={"Texture & Patterns"}/>}/>
          <Route path="/Experimental"   element={<NavPages name={"Experimental"}/>}/>
          <Route path="/Architecture"   element={<NavPages name={"Architecture"}/>}/>
          <Route path="/Nature"   element={<NavPages name={"Nature"}/>}/>
          <Route path="/Business"   element={<NavPages name={"Business & Work"}/>}/>
          <Route path="/Fashion"  element={<NavPages name={"Fashion"}/>}/>
          <Route path="/Film"   element={<NavPages name={"Film"}/>}/>
          <Route path="/Drink"  element={<NavPages name={"Food & Drink"}/>}/>
          <Route path="/Wellness"   element={<NavPages name={"Health & Wellness"}/>}/>
          <Route path="/People"   element={<NavPages name={"People"}/>}/>
          <Route path="/Interiors"  element={<NavPages name={"Interiors"}/>}/>
          <Route path="/Photography"  element={<NavPages name={"Street Photography"}/>}/>
          <Route path="/Travel"   element={<NavPages name={"Travel"}/>}/>
          <Route path="/Animals"  element={<NavPages name={"Animals"}/>}/>
          <Route path="/Spirtuality"  element={<NavPages name={"Spirtuality"}/>}/>
          <Route path="/Culture"  element={<NavPages name={"Arts & Culture"}/>}/>
          <Route path="/History"  element={<NavPages name={"History"}/>}/>
          <Route path="/Athelitics"   element={<NavPages name={"Athelitics"}/>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
}
export default App;