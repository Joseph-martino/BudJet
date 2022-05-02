const submitButton = document.getElementById('validation-input');
const passwordInput = document.getElementById('password');
const passwordConfirmationInput = document.getElementById('password-confirmation');

const checkInputs = () => {
    if(passwordConfirmationInput.value === passwordInput.value){
        submitButton.disabled = false;
        passwordInput.classList.remove('error-input');
        passwordConfirmationInput.classList.remove('error-input');
    } else {
        submitButton.disabled = true;
        passwordInput.classList.add('error-input');
        passwordConfirmationInput.classList.add('error-input');
    }
}

passwordInput.addEventListener("change", checkInputs);
passwordConfirmationInput.addEventListener("change", checkInputs);