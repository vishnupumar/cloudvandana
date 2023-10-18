let formData = document.getElementsByTagName('form')[0];
let fname = document.getElementById('firstName')
let lname = document.getElementById('lastName')
let dt = document.getElementById('date')
let country = document.getElementById('country')
let male = document.getElementById('male')
let female = document.getElementById('female')
let profession = document.getElementById('profession')
let email = document.getElementById('email')
let number = document.getElementById('number')

formData.addEventListener('submit',displayData)

function displayData(e){
    e.preventDefault();
    let result = confirm(`
        Full Name : ${fname.value} ${lname.value}
        Date of Birth : ${dt.value}
        Country : ${country.value}
        Gender : ${male.checked ? male.value : female.value}
        Profession : ${profession.value}
        Email : ${email.value}
        Mobile Number : ${number.value}
    `)
    if(result){
        fname.value = "";
        lname.value=""
        dt.value=""
        country.value=""
        male.checked=false
        female.checked=false
        profession.value=""
        email.value=''
        number.value=''
    }

}