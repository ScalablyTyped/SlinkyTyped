package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterOptions extends js.Object {
  var newLine: js.UndefOr[NewLineKind] = js.native
  var noEmitHelpers: js.UndefOr[Boolean] = js.native
  var omitTrailingSemicolon: js.UndefOr[Boolean] = js.native
  var removeComments: js.UndefOr[Boolean] = js.native
}

object PrinterOptions {
  @scala.inline
  def apply(): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterOptions]
  }
  @scala.inline
  implicit class PrinterOptionsOps[Self <: PrinterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewLine(value: NewLineKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmitHelpers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmitHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitHelpers")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitTrailingSemicolon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitTrailingSemicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitTrailingSemicolon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitTrailingSemicolon")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(js.undefined)
        ret
    }
  }
  
}

