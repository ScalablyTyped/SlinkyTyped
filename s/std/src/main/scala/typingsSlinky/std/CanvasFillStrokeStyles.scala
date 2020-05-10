package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern = js.native
  var strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.raw.CanvasGradient = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.raw.CanvasPattern | Null = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.raw.CanvasGradient = js.native
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
  @scala.inline
  implicit class CanvasFillStrokeStylesOps[Self <: CanvasFillStrokeStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateLinearGradient(value: (Double, Double, Double, Double) => org.scalajs.dom.raw.CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinearGradient")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreatePattern(value: (CanvasImageSource, java.lang.String) => org.scalajs.dom.raw.CanvasPattern | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPattern")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateRadialGradient(value: (Double, Double, Double, Double, Double, Double) => org.scalajs.dom.raw.CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRadialGradient")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withFillStyleCanvasPattern(value: org.scalajs.dom.raw.CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyleCanvasGradient(value: org.scalajs.dom.raw.CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyle(value: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyleCanvasPattern(value: org.scalajs.dom.raw.CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyleCanvasGradient(value: org.scalajs.dom.raw.CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyle(value: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

