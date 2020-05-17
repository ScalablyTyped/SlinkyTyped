package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssLess extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String = js.native
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: String = js.native
}

object CssLess {
  @scala.inline
  def apply(css: String, less: String): CssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLess]
  }
  @scala.inline
  implicit class CssLessOps[Self <: CssLess] (val x: Self) extends AnyVal {
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
    def withLess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

