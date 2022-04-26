const imageInputButton = document.getElementById('avatar-input');
const imageContainer = document.getElementById('avatar-container');

imageContainer.addEventListener("click", function() {
    console.log('bonjour');
    const event = new MouseEvent('click');
    imageInputButton.dispatchEvent(event);
});

imageInputButton.addEventListener("change", function(){
    const reader = new FileReader();
    reader.addEventListener("load", () => {
        const uploadedImage = reader.result;
        document.querySelector("#avatar-container").style.backgroundImage = `url(${uploadedImage})`;
    });
    reader.readAsDataURL(this.files[0]);
});



