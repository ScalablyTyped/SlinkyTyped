package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDataTrackOptions extends js.Object {
  var maxPacketLifeTime: js.UndefOr[Double | Null] = js.native
  var maxRetransmits: js.UndefOr[Double | Null] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
}

object LocalDataTrackOptions {
  @scala.inline
  def apply(): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
  @scala.inline
  implicit class LocalDataTrackOptionsOps[Self <: LocalDataTrackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPacketLifeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketLifeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPacketLifeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketLifeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPacketLifeTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketLifeTime")(null)
        ret
    }
    @scala.inline
    def withMaxRetransmits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetransmits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetransmits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetransmits")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetransmitsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetransmits")(null)
        ret
    }
    @scala.inline
    def withOrdered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(js.undefined)
        ret
    }
  }
  
}

