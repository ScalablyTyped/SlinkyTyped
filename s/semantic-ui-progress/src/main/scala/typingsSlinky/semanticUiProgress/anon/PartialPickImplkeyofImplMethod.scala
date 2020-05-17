package typingsSlinky.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.native
  var nonNumeric: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplMethodOps[Self <: PartialPickImplkeyofImplMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNonNumeric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonNumeric")(js.undefined)
        ret
    }
  }
  
}

