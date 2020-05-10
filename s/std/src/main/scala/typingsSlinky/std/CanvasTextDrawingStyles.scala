package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTextDrawingStyles extends js.Object {
  var direction: CanvasDirection = js.native
  var font: java.lang.String = js.native
  var textAlign: CanvasTextAlign = js.native
  var textBaseline: CanvasTextBaseline = js.native
}

object CanvasTextDrawingStyles {
  @scala.inline
  def apply(
    direction: CanvasDirection,
    font: java.lang.String,
    textAlign: CanvasTextAlign,
    textBaseline: CanvasTextBaseline
  ): CanvasTextDrawingStyles = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
  @scala.inline
  implicit class CanvasTextDrawingStylesOps[Self <: CanvasTextDrawingStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: CanvasDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: CanvasTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBaseline(value: CanvasTextBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

