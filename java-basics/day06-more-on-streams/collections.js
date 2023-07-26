let languages = ["JavaScript", "Java", "Scala", "Ruby"];

//Find any language that starts with J and print it in Uppercase
let result = languages
    .filter(lang => {
        console.log("*****Inside filter " + lang);
        return lang.startsWith("J");
    })
    .map(lang => {
        console.log("=====Inside map " + lang);
        return lang.toUpperCase();
    })
    .pop();
console.log(result);



//Find the languages that start with J and print them in Uppercase
// languages
//     .filter(lang => {
//         console.log("*****Inside filter " + lang);
//         return lang.startsWith("J");
//     })
//     .map(lang => {
//         console.log("=====Inside map " + lang);
//         return lang.toUpperCase();
//     })
//     .forEach(lang => console.log(lang));