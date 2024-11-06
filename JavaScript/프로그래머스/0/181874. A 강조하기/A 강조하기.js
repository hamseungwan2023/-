function solution(myString) {
    var answer = '';
    const a = myString.toLowerCase();
    for(let i = 0; i<myString.length; i++){
        if(a[i] == "a"){
            answer += "A"
        } else{
            answer+=a[i];
        }
    }
    return answer;
}