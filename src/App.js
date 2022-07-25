import {BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Login from './pages/login/Login';
import Cadastro from './pages/cadastro/Cadastro';

function App(){

    return(
        <Router>
            <Routes>
                <Route path="/" element={<Login />}/>
                <Route path="/Cadastrar" element={<Cadastro />}/>
            </Routes>
        </Router>
    );
}

export default App;