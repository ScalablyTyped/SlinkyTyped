package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainPoint2DParameters extends js.Object {
  var exact: js.Array[Point2D] = js.native
  var ideal: js.Array[Point2D] = js.native
}

object ConstrainPoint2DParameters {
  @scala.inline
  def apply(exact: js.Array[Point2D], ideal: js.Array[Point2D]): ConstrainPoint2DParameters = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
  @scala.inline
  implicit class ConstrainPoint2DParametersOps[Self <: ConstrainPoint2DParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: js.Array[Point2D]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdeal(value: js.Array[Point2D]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

