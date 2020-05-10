package typingsSlinky.uglifycss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UglifyCSSOptions extends js.Object {
  /**
    * Preserves newlines within and around preserved comments
    */
  var cuteComments: js.UndefOr[Boolean] = js.native
  /**
    * eEpands variables; by default, @variables blocks are preserved and var(x)s are not expanded
    */
  var expandVars: js.UndefOr[Boolean] = js.native
  /**
    * Adds a newline (approx.) every n characters; 0 means no newline and is the default value
    */
  var maxLineLen: js.UndefOr[Double] = js.native
  /**
    * Removes newlines within preserved comments; by default, newlines are preserved
    */
  var uglyComments: js.UndefOr[Boolean] = js.native
}

object UglifyCSSOptions {
  @scala.inline
  def apply(): UglifyCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyCSSOptions]
  }
  @scala.inline
  implicit class UglifyCSSOptionsOps[Self <: UglifyCSSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCuteComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cuteComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCuteComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cuteComments")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandVars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandVars")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLen")(js.undefined)
        ret
    }
    @scala.inline
    def withUglyComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglyComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUglyComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglyComments")(js.undefined)
        ret
    }
  }
  
}

