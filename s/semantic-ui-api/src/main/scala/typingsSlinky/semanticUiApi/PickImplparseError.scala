package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'parseError'> */
@js.native
trait PickImplparseError extends js.Object {
  var parseError: String = js.native
}

object PickImplparseError {
  @scala.inline
  def apply(parseError: String): PickImplparseError = {
    val __obj = js.Dynamic.literal(parseError = parseError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparseError]
  }
  @scala.inline
  implicit class PickImplparseErrorOps[Self <: PickImplparseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

