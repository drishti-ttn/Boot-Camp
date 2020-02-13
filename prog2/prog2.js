function palindrome(myString){
    var removeChar = myString.replace(/[^A-Z0-9]/ig, "").toLowerCase();
    var isPalindrome = removeChar.split('').reverse().join('');
        if(removeChar === isPalindrome){
            document.write("<div>"+ myString + " is a Palindrome <div>");
        }else{    
            document.write("<div>" + myString + " is not a Palindrome </div>");
        }
}
palindrome('"STAR WARS"')
palindrome('"Madam"')


