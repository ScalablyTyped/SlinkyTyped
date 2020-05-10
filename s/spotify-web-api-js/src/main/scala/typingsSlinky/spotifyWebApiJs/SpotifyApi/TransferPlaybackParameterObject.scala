package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferPlaybackParameterObject extends js.Object {
  var play: js.UndefOr[Boolean] = js.native
}

object TransferPlaybackParameterObject {
  @scala.inline
  def apply(): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
  @scala.inline
  implicit class TransferPlaybackParameterObjectOps[Self <: TransferPlaybackParameterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
  }
  
}

