package typingsSlinky.viewportMercatorProject.mod

import typingsSlinky.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseHighPrecisionDistanceScalesInput extends BaseDistanceScalesInput {
  var highPrecision: `true` = js.native
}

object BaseHighPrecisionDistanceScalesInput {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double): BaseHighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceScalesInput]
  }
  @scala.inline
  implicit class BaseHighPrecisionDistanceScalesInputOps[Self <: BaseHighPrecisionDistanceScalesInput] (val x: Self) extends AnyVal {
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
  }
  
}

