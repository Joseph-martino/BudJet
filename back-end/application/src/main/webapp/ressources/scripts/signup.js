const submitButton = document.getElementById('validation-input');
const passwordInput =document.getElementById('password');
const passwordConfirmationInput = document.getElementById('password-confirmation');

passwordConfirmationInput.addEventListener("change", function() {
    console.log(passwordInput.value);
    console.log(passwordConfirmationInput.value);

    if(passwordConfirmationInput.value === passwordInput.value){
        submitButton.classList.remove('disabled');
        submitButton.classList.add('activated');
        submitButton.disabled = false;
    }
})