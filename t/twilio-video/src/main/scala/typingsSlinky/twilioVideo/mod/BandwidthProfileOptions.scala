package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandwidthProfileOptions extends js.Object {
  var video: js.UndefOr[VideoBandwidthProfileOptions] = js.native
}

object BandwidthProfileOptions {
  @scala.inline
  def apply(): BandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandwidthProfileOptions]
  }
  @scala.inline
  implicit class BandwidthProfileOptionsOps[Self <: BandwidthProfileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideo(value: VideoBandwidthProfileOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

