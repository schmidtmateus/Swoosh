package com.example.mschmidt.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mschmidt.swoosh.Model.Player
import com.example.mschmidt.swoosh.R
import com.example.mschmidt.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueTxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
