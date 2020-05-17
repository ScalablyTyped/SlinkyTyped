package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellAddress extends RangeSpec {
  /** Column number */
  var c: Double = js.native
  /** Row number */
  var r: Double = js.native
}

object CellAddress {
  @scala.inline
  def apply(c: Double, r: Double): CellAddress = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
  @scala.inline
  implicit class CellAddressOps[Self <: CellAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

