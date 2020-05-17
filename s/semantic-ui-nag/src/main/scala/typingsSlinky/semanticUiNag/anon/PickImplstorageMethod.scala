package typingsSlinky.semanticUiNag.anon

import typingsSlinky.semanticUiNag.semanticUiNagStrings.cookie
import typingsSlinky.semanticUiNag.semanticUiNagStrings.localstorage
import typingsSlinky.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'storageMethod'> */
@js.native
trait PickImplstorageMethod extends js.Object {
  var storageMethod: cookie | localstorage | sessionstorage = js.native
}

object PickImplstorageMethod {
  @scala.inline
  def apply(storageMethod: cookie | localstorage | sessionstorage): PickImplstorageMethod = {
    val __obj = js.Dynamic.literal(storageMethod = storageMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstorageMethod]
  }
  @scala.inline
  implicit class PickImplstorageMethodOps[Self <: PickImplstorageMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageMethod(value: cookie | localstorage | sessionstorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMethod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

