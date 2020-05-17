package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplError extends js.Object {
  var error: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
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
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
  }
  
}

