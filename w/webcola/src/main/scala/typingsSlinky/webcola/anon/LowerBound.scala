package typingsSlinky.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowerBound extends js.Object {
  var lowerBound: Double = js.native
  var newCenters: js.Array[Double] = js.native
  var upperBound: Double = js.native
}

object LowerBound {
  @scala.inline
  def apply(lowerBound: Double, newCenters: js.Array[Double], upperBound: Double): LowerBound = {
    val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], newCenters = newCenters.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowerBound]
  }
  @scala.inline
  implicit class LowerBoundOps[Self <: LowerBound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewCenters(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCenters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

