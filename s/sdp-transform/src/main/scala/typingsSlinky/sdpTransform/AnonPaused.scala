package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaused extends js.Object {
  var paused: Boolean = js.native
  var scid: Double | String = js.native
}

object AnonPaused {
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): AnonPaused = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], scid = scid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaused]
  }
  @scala.inline
  implicit class AnonPausedOps[Self <: AnonPaused] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScid(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

