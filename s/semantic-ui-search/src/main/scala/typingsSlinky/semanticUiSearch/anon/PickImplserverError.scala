package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'serverError'> */
@js.native
trait PickImplserverError extends js.Object {
  var serverError: String = js.native
}

object PickImplserverError {
  @scala.inline
  def apply(serverError: String): PickImplserverError = {
    val __obj = js.Dynamic.literal(serverError = serverError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplserverError]
  }
  @scala.inline
  implicit class PickImplserverErrorOps[Self <: PickImplserverError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

