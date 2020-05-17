package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sass extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp = js.native
  /**
    * @example:
    *  /@import\s['"](.+sass)['"]/gi
    */
  var sass: js.RegExp = js.native
  /**
    * @example:
    *  /@import\s['"](.+scss)['"]/gi
    */
  var scss: js.RegExp = js.native
}

object Sass {
  @scala.inline
  def apply(css: js.RegExp, sass: js.RegExp, scss: js.RegExp): Sass = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sass]
  }
  @scala.inline
  implicit class SassOps[Self <: Sass] (val x: Self) extends AnyVal {
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
    def withSass(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScss(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

