let arr = [2,1,6,3,5,9,7]

sortDesc(arr)

function sortDesc(arr){
    let res = arr.sort((a,b)=>{
        return b-a;
    })
    console.log(res)
}