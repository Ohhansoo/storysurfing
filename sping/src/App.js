import './styles/App.css';
import React from "react";
import Footer from "./Footer";
import Section1 from "./pages/sections/Section1";
import Section2 from "./pages/sections/Section2";
import Section3 from "./pages/sections/Section3";
import Section4 from "./pages/sections/Section4";
import Navibar from "./pages/Navibar";
function App() {
    return (
    <body>
    <Navibar/>
    <header className="masthead">
        <div className="container position-relative">
            <div className="row justify-content-center">
                <div className="col-xl-6">
                    <div className="text-center text-white">
                        <h1 className="mb-5">Generate more leads with a professional landing page!</h1>

                        <form className="form-subscribe" id="contactForm" data-sb-form-api-token="API_TOKEN">
                            <div className="row">
                                <div className="col">
                                    <input className="form-control form-control-lg" id="emailAddress" type="email"
                                           placeholder="Email Address" data-sb-validations="required,email"/>
                                    <div className="invalid-feedback text-white"
                                         data-sb-feedback="emailAddress:required">Email Address is required.
                                    </div>
                                    <div className="invalid-feedback text-white"
                                         data-sb-feedback="emailAddress:email">Email Address Email is not valid.
                                    </div>
                                </div>
                                <div className="col-auto">
                                    <button className="btn btn-primary btn-lg disabled" id="submitButton"
                                            type="submit">Submit
                                    </button>
                                </div>
                            </div>

                            <div className="d-none" id="submitSuccessMessage">
                                <div className="text-center mb-3">
                                    <div className="fw-bolder">Form submission successful!</div>
                                    <p>To activate this form, sign up at</p>
                                    <a className="text-white"
                                       href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
                                </div>
                            </div>

                            <div className="d-none" id="submitErrorMessage">
                                <div className="text-center text-danger mb-3">Error sending message!</div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <Section1/>
    <Section2/>
    <Section3/>
    <Section4/>
    <Footer/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
    );
}
export default App;
