package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushData extends js.Object {
  /** payload for APNs messages */
  var apns: js.UndefOr[js.Any] = js.native
  /** payload for GCM messages */
  var gcm: js.UndefOr[js.Any] = js.native
}

object PushData {
  @scala.inline
  def apply(): PushData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushData]
  }
  @scala.inline
  implicit class PushDataOps[Self <: PushData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(js.undefined)
        ret
    }
    @scala.inline
    def withGcm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(js.undefined)
        ret
    }
  }
  
}

