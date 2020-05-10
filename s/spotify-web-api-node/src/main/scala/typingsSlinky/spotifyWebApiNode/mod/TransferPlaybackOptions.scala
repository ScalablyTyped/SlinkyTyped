package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferPlaybackOptions extends js.Object {
  var device_ids: js.Array[String] = js.native
  var play: js.UndefOr[Boolean] = js.native
}

object TransferPlaybackOptions {
  @scala.inline
  def apply(device_ids: js.Array[String]): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal(device_ids = device_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
  @scala.inline
  implicit class TransferPlaybackOptionsOps[Self <: TransferPlaybackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_ids")(value.asInstanceOf[js.Any])
        ret
    }
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

