package hr.algebra.leagueapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import hr.algebra.leagueapp.databinding.ActivitySplashScreenBinding
import hr.algebra.nasaapp.framework.applyAnimation
import hr.algebra.nasaapp.framework.startActivity

private const val DELAY = 3000L

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startAnimations()
        redirect()
    }

    private fun startAnimations() {
        binding.ivSplashIcon.applyAnimation(R.anim.spin)
    }

    private fun redirect() {
        Handler(Looper.getMainLooper()).postDelayed( //main thread
            {   startActivity<HostActivity>()},

            DELAY// with this much delay
        )
    }
}