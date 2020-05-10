package typingsSlinky.semanticUiApi

import typingsSlinky.semanticUiApi.semanticUiApiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'hideError'> */
@js.native
trait PickImplhideError extends js.Object {
  var hideError: auto | Boolean = js.native
}

object PickImplhideError {
  @scala.inline
  def apply(hideError: auto | Boolean): PickImplhideError = {
    val __obj = js.Dynamic.literal(hideError = hideError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideError]
  }
  @scala.inline
  implicit class PickImplhideErrorOps[Self <: PickImplhideError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideError(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

