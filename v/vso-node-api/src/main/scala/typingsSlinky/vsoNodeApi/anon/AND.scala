package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AND extends js.Object {
  var aND: scala.Double = js.native
  var nONE: scala.Double = js.native
  var oR: scala.Double = js.native
}

object AND {
  @scala.inline
  def apply(aND: scala.Double, nONE: scala.Double, oR: scala.Double): AND = {
    val __obj = js.Dynamic.literal(aND = aND.asInstanceOf[js.Any], nONE = nONE.asInstanceOf[js.Any], oR = oR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  @scala.inline
  implicit class ANDOps[Self <: AND] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAND(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOR(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

