package typingsSlinky.uglifyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangleOptions extends js.Object {
  /** Pass true to mangle names visible in scopes where `eval` or with are used. */
  var eval: js.UndefOr[Boolean] = js.native
  /** Pass true to not mangle function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.native
  /** Pass an array of identifiers that should be excluded from mangling. Example: `["foo", "bar"]`. */
  var reserved: js.UndefOr[js.Array[String]] = js.native
  /** Pass true to mangle names declared in the top level scope. */
  var toplevel: js.UndefOr[Boolean] = js.native
}

object MangleOptions {
  @scala.inline
  def apply(): MangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MangleOptions]
  }
  @scala.inline
  implicit class MangleOptionsOps[Self <: MangleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_fnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_fnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Boolean | ManglePropertiesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
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
    @scala.inline
    def withToplevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToplevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(js.undefined)
        ret
    }
  }
  
}

