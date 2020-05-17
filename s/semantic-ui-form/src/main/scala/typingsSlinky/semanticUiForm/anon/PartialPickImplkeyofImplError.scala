package typingsSlinky.semanticUiForm.anon

import typingsSlinky.semanticUiForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplError extends js.Object {
  var error: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.native
  var prompt: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.native
}

object PartialPickImplkeyofImplError {
  @scala.inline
  def apply(): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplErrorOps[Self <: PartialPickImplkeyofImplError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* errors */ js.Array[String] => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: /* errors */ js.Array[String] => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
  }
  
}

