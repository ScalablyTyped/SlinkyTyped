package typingsSlinky.uglifyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManglePropertiesOptions extends js.Object {
  /** Use true to allow the mangling of builtin DOM properties. Not recommended to override this setting. */
  var builtins: js.UndefOr[Boolean] = js.native
  /** Mangle names with the original name still present. Pass an empty string "" to enable, or a non-empty string to set the debug suffix. */
  var debug: js.UndefOr[Boolean] = js.native
  /** Only mangle unquoted property names */
  var keep_quoted: js.UndefOr[Boolean] = js.native
  /** Pass a RegExp literal to only mangle property names matching the regular expression. */
  var regex: js.UndefOr[js.RegExp] = js.native
  /** Do not mangle property names listed in the reserved array */
  var reserved: js.UndefOr[js.Array[String]] = js.native
}

object ManglePropertiesOptions {
  @scala.inline
  def apply(): ManglePropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManglePropertiesOptions]
  }
  @scala.inline
  implicit class ManglePropertiesOptionsOps[Self <: ManglePropertiesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtins")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_quoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_quoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_quoted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_quoted")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(js.undefined)
        ret
    }
  }
  
}

