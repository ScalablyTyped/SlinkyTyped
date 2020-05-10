package typingsSlinky.storybookAddonBackgrounds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackground extends js.Object {
  var background: String = js.native
}

object AnonBackground {
  @scala.inline
  def apply(background: String): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
  @scala.inline
  implicit class AnonBackgroundOps[Self <: AnonBackground] (val x: Self) extends AnyVal {
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
  }
  
}

