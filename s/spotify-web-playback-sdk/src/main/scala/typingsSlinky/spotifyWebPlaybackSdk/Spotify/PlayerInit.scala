package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerInit extends js.Object {
  var name: String = js.native
  var volume: js.UndefOr[Double] = js.native
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit = js.native
}

object PlayerInit {
  @scala.inline
  def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Unit, name: String): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
  @scala.inline
  implicit class PlayerInitOps[Self <: PlayerInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOAuthToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

