package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainULongRange
  extends ULongRange
     with ConstrainULong {
  var exact: js.UndefOr[Double] = js.native
  var ideal: js.UndefOr[Double] = js.native
}

object ConstrainULongRange {
  @scala.inline
  def apply(): ConstrainULongRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainULongRange]
  }
  @scala.inline
  implicit class ConstrainULongRangeOps[Self <: ConstrainULongRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIdeal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
  }
  
}

