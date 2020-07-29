package com.example.noactivity

fun checkPalindrome(string: String): Boolean{
    //Check if input is an empty string
    if(string =="") return false
    //convert the string to lower case and trim white space
    var word = string.trim().toLowerCase()

    //Remove spaces and special characters(e.g "$",",","'", etc)
    var newWord = word.replace("""[^a-z0-9]""".toRegex(),"")

    //Divide the word into two and compare corresponding halves
    var num: Int = newWord.length/2
    for(i in 0..num){
        if (newWord[i]!=newWord[newWord.length-1-i])return false
    }
    return true
}

