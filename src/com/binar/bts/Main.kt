package com.binar.bts

import java.util.*

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val input = Scanner(System.`in`)
            println("Masukkan nama kamu : ")
            val nama = input.next()
            val number = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
            var scorePemain = 0
            var scoreComputer = 0

            for (i in 1..3){
                println("Ronde ke : $i")
                println("Silahkan masukkan tebakanmu :")
                val angka = input.nextInt()
                val random = number.random()
                if (angka == random){
                    scorePemain += 5
                    println("Tebakanmu BENAR")
                    println("angka yang muncul adalah : $random")
                    println()
                } else {
                    scoreComputer += 5
                    println("Tebakanmu SALAH")
                    println("angka yang muncul adalah : $random")
                    println()
                }
            }
            println("Permainan selesai!")
            println("==================================")
            println("Total score $nama adalah : $scorePemain")
            println("Total score Computer adalah : $scoreComputer")
            println("==================================")
            println("Terima kasih")
        }
    }
}