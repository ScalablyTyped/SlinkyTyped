package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAND extends js.Object {
  var aND: Double = js.native
  var nONE: Double = js.native
  var oR: Double = js.native
}

object AnonAND {
  @scala.inline
  def apply(aND: Double, nONE: Double, oR: Double): AnonAND = {
    val __obj = js.Dynamic.literal(aND = aND.asInstanceOf[js.Any], nONE = nONE.asInstanceOf[js.Any], oR = oR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAND]
  }
  @scala.inline
  implicit class AnonANDOps[Self <: AnonAND] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAND(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

