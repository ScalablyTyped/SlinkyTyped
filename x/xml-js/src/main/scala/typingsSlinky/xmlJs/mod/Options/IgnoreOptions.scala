package typingsSlinky.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreOptions extends js.Object {
  var ignoreAttributes: js.UndefOr[Boolean] = js.native
  var ignoreCdata: js.UndefOr[Boolean] = js.native
  var ignoreComment: js.UndefOr[Boolean] = js.native
  var ignoreDeclaration: js.UndefOr[Boolean] = js.native
  var ignoreDoctype: js.UndefOr[Boolean] = js.native
  var ignoreInstruction: js.UndefOr[Boolean] = js.native
  var ignoreText: js.UndefOr[Boolean] = js.native
}

object IgnoreOptions {
  @scala.inline
  def apply(): IgnoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreOptions]
  }
  @scala.inline
  implicit class IgnoreOptionsOps[Self <: IgnoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCdata")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComment")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDoctype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDoctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDoctype")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInstruction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreText")(js.undefined)
        ret
    }
  }
  
}

