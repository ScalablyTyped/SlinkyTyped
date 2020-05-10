package typingsSlinky.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundColor extends js.Object {
  var background: String = js.native
  var color: String = js.native
}

object AnonBackgroundColor {
  @scala.inline
  def apply(background: String, color: String): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
  @scala.inline
  implicit class AnonBackgroundColorOps[Self <: AnonBackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

