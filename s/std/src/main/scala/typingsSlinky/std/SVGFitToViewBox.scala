package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFitToViewBox extends js.Object {
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = js.native
  val viewBox: org.scalajs.dom.raw.SVGAnimatedRect = js.native
}

object SVGFitToViewBox {
  @scala.inline
  def apply(
    preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.raw.SVGAnimatedRect
  ): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  @scala.inline
  implicit class SVGFitToViewBoxOps[Self <: org.scalajs.dom.raw.SVGFitToViewBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveAspectRatio(value: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewBox(value: org.scalajs.dom.raw.SVGAnimatedRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

