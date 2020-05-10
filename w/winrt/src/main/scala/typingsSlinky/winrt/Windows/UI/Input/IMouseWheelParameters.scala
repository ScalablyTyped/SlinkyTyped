package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseWheelParameters extends js.Object {
  var charTranslation: Point = js.native
  var deltaRotationAngle: Double = js.native
  var deltaScale: Double = js.native
  var pageTranslation: Point = js.native
}

object IMouseWheelParameters {
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseWheelParameters]
  }
  @scala.inline
  implicit class IMouseWheelParametersOps[Self <: IMouseWheelParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharTranslation(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTranslation(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTranslation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

