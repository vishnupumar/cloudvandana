let str = "This is a sunny day";

reverseStr(str)

function reverseStr(string){
    let words = string.split(" ")
    let strArr = words.map((ele)=>{
        return [...ele].reverse().join("");
    })
    console.log(strArr.join(" "))
}