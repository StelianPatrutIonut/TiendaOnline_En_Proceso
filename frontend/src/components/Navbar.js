import React from "react";
import { Link } from "react-router-dom";

const NavBar = () => {
    return(
        <nav>
            <div className="navBar">
                <h1>NAUTICA CEMTRAMAR</h1>
                <ul>
                    <li>
                        <Link to="/">Inicio</Link>
                    </li>
                    <li>
                        <Link to="/">Productos</Link>
                    </li>
                    <li>
                        <Link to="/">Contacto</Link>
                    </li>
                </ul>
            </div>
        </nav>
    );
};

export default NavBar;
