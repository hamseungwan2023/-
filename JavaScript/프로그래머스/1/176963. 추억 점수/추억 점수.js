function solution(name, yearning, photo) {
    var answer = [];

for (let i = 0; i < photo.length; i++) {
    let a = 0;
    for (let ii = 0; ii < photo[i].length; ii++) {
        for (let iii = 0; iii < name.length; iii++) {
            if (photo[i][ii] == name[iii]) {
                a += yearning[iii];
            }
        }
    }

    answer.push(a);
    a = 0;
}
    
    return answer;
}