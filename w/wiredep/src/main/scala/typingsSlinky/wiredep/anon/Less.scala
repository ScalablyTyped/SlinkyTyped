package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Less extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp = js.native
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: js.RegExp = js.native
}

object Less {
  @scala.inline
  def apply(css: js.RegExp, less: js.RegExp): Less = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  @scala.inline
  implicit class LessOps[Self <: Less] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLess(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

