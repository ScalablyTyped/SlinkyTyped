package typingsSlinky.spdy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoSpdy31 extends js.Object {
  var autoSpdy31: js.UndefOr[Boolean] = js.native
  var windowSize: js.UndefOr[Double] = js.native
}

object AnonAutoSpdy31 {
  @scala.inline
  def apply(): AnonAutoSpdy31 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoSpdy31]
  }
  @scala.inline
  implicit class AnonAutoSpdy31Ops[Self <: AnonAutoSpdy31] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSpdy31(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSpdy31")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSpdy31: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSpdy31")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(js.undefined)
        ret
    }
  }
  
}

