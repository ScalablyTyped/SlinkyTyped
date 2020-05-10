package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutPoint extends js.Object {
  /** The transformed input point. */ var outPoint: Point = js.native
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonOutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): AnonOutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutPoint]
  }
  @scala.inline
  implicit class AnonOutPointOps[Self <: AnonOutPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

