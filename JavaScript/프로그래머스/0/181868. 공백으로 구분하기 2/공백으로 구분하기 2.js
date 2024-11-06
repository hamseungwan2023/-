function solution(my_string) {
    var answer = [];
    const a = my_string.split(" ")
    for(let i = 0; i<a.length; i++){
        if(a[i] != ""){
            answer.push(a[i]);
        }
    }
    return answer;
}