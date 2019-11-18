package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  var strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.raw.CanvasGradient
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.raw.CanvasPattern | Null
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.raw.CanvasGradient
}

object CanvasFillStrokeStyles {
  @scala.inline
  def apply(
    createLinearGradient: (Double, Double, Double, Double) => org.scalajs.dom.raw.CanvasGradient,
    createPattern: (CanvasImageSource, java.lang.String) => org.scalajs.dom.raw.CanvasPattern | Null,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => org.scalajs.dom.raw.CanvasGradient,
    fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern,
    strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  ): CanvasFillStrokeStyles = {
    val __obj = js.Dynamic.literal(createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), fillStyle = fillStyle.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanvasFillStrokeStyles]
  }
}

