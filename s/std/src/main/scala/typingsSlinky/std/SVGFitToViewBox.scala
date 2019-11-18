package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGFitToViewBox extends js.Object {
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio
  val viewBox: org.scalajs.dom.raw.SVGAnimatedRect
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
}

