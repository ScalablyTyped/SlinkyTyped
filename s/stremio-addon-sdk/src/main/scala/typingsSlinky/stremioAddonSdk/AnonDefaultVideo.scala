package typingsSlinky.stremioAddonSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultVideo extends js.Object {
  /**
    * Set to a Video Object id in order to open the Detail page directly to that video's streams.
    */
  var defaultVideo: js.UndefOr[Boolean | String] = js.native
}

object AnonDefaultVideo {
  @scala.inline
  def apply(): AnonDefaultVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultVideo]
  }
  @scala.inline
  implicit class AnonDefaultVideoOps[Self <: AnonDefaultVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVideo(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVideo")(js.undefined)
        ret
    }
  }
  
}

