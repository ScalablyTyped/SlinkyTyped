package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCss extends ByHash {
  var css: String = js.native
}

object AnonCss {
  @scala.inline
  def apply(css: String): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
  @scala.inline
  implicit class AnonCssOps[Self <: AnonCss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

