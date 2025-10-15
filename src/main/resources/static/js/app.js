
let imageFile = document.querySelector('#imageFile');

imageFile.addEventListener('change', loadFile);


function loadFile(e) {
    let output = document.getElementById('output');
    output.src = URL.createObjectURL(e.target.files[0]);
    output.onload = function() {
        URL.revokeObjectURL(output.src)
    }

};