package typingsSlinky.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateStructStaticReturns extends js.Object {
  var H: Double = js.native
  var YYYYMMDD: Double = js.native
}

object IDateStructStaticReturns {
  @scala.inline
  def apply(H: Double, YYYYMMDD: Double): IDateStructStaticReturns = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], YYYYMMDD = YYYYMMDD.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateStructStaticReturns]
  }
  @scala.inline
  implicit class IDateStructStaticReturnsOps[Self <: IDateStructStaticReturns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYYYYMMDD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YYYYMMDD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

