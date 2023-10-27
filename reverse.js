function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const input = "This is a sunny day"; 
const reversedSentence = reverseWordsInSentence(input);
console.log("Reversed sentence: " + reversedSentence);