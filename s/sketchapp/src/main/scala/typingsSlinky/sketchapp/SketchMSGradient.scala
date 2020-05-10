package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.gradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSGradient extends js.Object {
  var _class: gradient = js.native
  var elipseLength: Double = js.native
  var from: AnonX = js.native
  var gradientType: Double = js.native
  var shouldSmoothenOpacity: Boolean = js.native
  var stops: js.Array[SketchMSGradientStop] = js.native
  var to: AnonX = js.native
}

object SketchMSGradient {
  @scala.inline
  def apply(
    _class: gradient,
    elipseLength: Double,
    from: AnonX,
    gradientType: Double,
    shouldSmoothenOpacity: Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: AnonX
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], shouldSmoothenOpacity = shouldSmoothenOpacity.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGradient]
  }
  @scala.inline
  implicit class SketchMSGradientOps[Self <: SketchMSGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElipseLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elipseLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldSmoothenOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSmoothenOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStops(value: js.Array[SketchMSGradientStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

