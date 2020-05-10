package typingsSlinky.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypography extends js.Object {
  var typography: AnonFonts = js.native
}

object AnonTypography {
  @scala.inline
  def apply(typography: AnonFonts): AnonTypography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypography]
  }
  @scala.inline
  implicit class AnonTypographyOps[Self <: AnonTypography] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypography(value: AnonFonts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typography")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

