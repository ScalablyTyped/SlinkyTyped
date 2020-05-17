package typingsSlinky.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paused extends js.Object {
  var paused: Boolean = js.native
  var scid: Double | String = js.native
}

object Paused {
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): Paused = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], scid = scid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paused]
  }
  @scala.inline
  implicit class PausedOps[Self <: Paused] (val x: Self) extends AnyVal {
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

