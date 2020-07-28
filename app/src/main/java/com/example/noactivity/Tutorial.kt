package com.example.noactivity

fun checkPalindrome(string: String): Boolean{
    var word = string.trim().toLowerCase()
    var newWord = word.replace("""[^a-z0-9]""".toRegex(),"")
    var num: Int = newWord.length/2
    for(i in 0..num){
        if (newWord[i]!=newWord[newWord.length-1-i])return false
    }
    return true
}

