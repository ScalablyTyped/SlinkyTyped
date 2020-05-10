package typingsSlinky.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIe extends js.Object {
      // number or boolean
  var ie: Boolean = js.native
  var mac: Boolean = js.native
  var pv: js.Array[Double] = js.native
  var w3: Boolean = js.native
  var win: Boolean = js.native
  var wk: js.Any = js.native
}

object AnonIe {
  @scala.inline
  def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: js.Any): AnonIe = {
    val __obj = js.Dynamic.literal(ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], w3 = w3.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], wk = wk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIe]
  }
  @scala.inline
  implicit class AnonIeOps[Self <: AnonIe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPv(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWk(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

