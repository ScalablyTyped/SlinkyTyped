package typingsSlinky.storybookTheming.typesMod

import typingsSlinky.storybookTheming.anon.Base
import typingsSlinky.storybookTheming.anon.Black
import typingsSlinky.storybookTheming.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typography extends js.Object {
  var fonts: Base = js.native
  var size: Code = js.native
  var weight: Black = js.native
}

object Typography {
  @scala.inline
  def apply(fonts: Base, size: Code, weight: Black): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFonts(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Black): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

