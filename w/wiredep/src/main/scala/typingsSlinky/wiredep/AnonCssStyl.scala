package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCssStyl extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var css: String = js.native
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var styl: String = js.native
}

object AnonCssStyl {
  @scala.inline
  def apply(css: String, styl: String): AnonCssStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCssStyl]
  }
  @scala.inline
  implicit class AnonCssStylOps[Self <: AnonCssStyl] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStyl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

