package typingsSlinky.viewportMercatorProject.anon

import typingsSlinky.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typingsSlinky.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  scale  :number} */
@js.native
trait BaseHighPrecisionDistanceHighPrecision extends HighPrecisionDistanceScalesInput {
  var highPrecision: `true` = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var scale: Double = js.native
}

object BaseHighPrecisionDistanceHighPrecision {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): BaseHighPrecisionDistanceHighPrecision = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceHighPrecision]
  }
  @scala.inline
  implicit class BaseHighPrecisionDistanceHighPrecisionOps[Self <: BaseHighPrecisionDistanceHighPrecision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighPrecision(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

