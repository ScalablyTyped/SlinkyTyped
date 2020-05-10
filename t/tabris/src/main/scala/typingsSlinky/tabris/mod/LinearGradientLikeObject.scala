package typingsSlinky.tabris.mod

import typingsSlinky.tabris.tabrisStrings.bottom
import typingsSlinky.tabris.tabrisStrings.left
import typingsSlinky.tabris.tabrisStrings.right
import typingsSlinky.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGradientLikeObject extends _LinearGradientValue {
  var colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])] = js.native
  var direction: js.UndefOr[Double | left | top | right | bottom] = js.native
}

object LinearGradientLikeObject {
  @scala.inline
  def apply(colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]): LinearGradientLikeObject = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientLikeObject]
  }
  @scala.inline
  implicit class LinearGradientLikeObjectOps[Self <: LinearGradientLikeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorStops(value: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Double | left | top | right | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

