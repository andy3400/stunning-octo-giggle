import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bulko.flower.R
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.r73l14ppafke))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.r109mowmdk7h))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.r2oe4buoyt9u))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.rkdqt6xnrnwn))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.r16acwe7h8mp))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.rjrxfjdhb7gs))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
            .into(findViewById(R.id.rfjrb50zf12))
    }
}