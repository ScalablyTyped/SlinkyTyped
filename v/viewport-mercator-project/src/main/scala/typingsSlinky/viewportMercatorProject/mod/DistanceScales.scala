package typingsSlinky.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceScales extends js.Object {
  var degreesPerPixel: js.Tuple3[Double, Double, Double] = js.native
  var metersPerPixel: js.Tuple3[Double, Double, Double] = js.native
  var pixelsPerDegree: js.Tuple3[Double, Double, Double] = js.native
  var pixelsPerMeter: js.Tuple3[Double, Double, Double] = js.native
}

object DistanceScales {
  @scala.inline
  def apply(
    degreesPerPixel: js.Tuple3[Double, Double, Double],
    metersPerPixel: js.Tuple3[Double, Double, Double],
    pixelsPerDegree: js.Tuple3[Double, Double, Double],
    pixelsPerMeter: js.Tuple3[Double, Double, Double]
  ): DistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel.asInstanceOf[js.Any], metersPerPixel = metersPerPixel.asInstanceOf[js.Any], pixelsPerDegree = pixelsPerDegree.asInstanceOf[js.Any], pixelsPerMeter = pixelsPerMeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceScales]
  }
  @scala.inline
  implicit class DistanceScalesOps[Self <: DistanceScales] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegreesPerPixel(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreesPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetersPerPixel(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metersPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelsPerDegree(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerDegree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelsPerMeter(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerMeter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

