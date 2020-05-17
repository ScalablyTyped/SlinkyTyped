package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styl extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp = js.native
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: js.RegExp = js.native
}

object Styl {
  @scala.inline
  def apply(css: js.RegExp, styl: js.RegExp): Styl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styl]
  }
  @scala.inline
  implicit class StylOps[Self <: Styl] (val x: Self) extends AnyVal {
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
    def withStyl(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

