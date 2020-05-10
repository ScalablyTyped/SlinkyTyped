package typingsSlinky.systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRx extends js.Object {
  var rx: Double = js.native
  var wx: Double = js.native
}

object AnonRx {
  @scala.inline
  def apply(rx: Double, wx: Double): AnonRx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRx]
  }
  @scala.inline
  implicit class AnonRxOps[Self <: AnonRx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

