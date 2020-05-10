package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPlaybackInstance extends js.Object {
  var device_id: String = js.native
}

object WebPlaybackInstance {
  @scala.inline
  def apply(device_id: String): WebPlaybackInstance = {
    val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPlaybackInstance]
  }
  @scala.inline
  implicit class WebPlaybackInstanceOps[Self <: WebPlaybackInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

