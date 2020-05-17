package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
@js.native
trait WebAccountClientView extends js.Object {
  /** Gets the account pairwise Id. */
  var accountPairwiseId: String = js.native
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the type of web account client view. */
  var `type`: WebAccountClientViewType = js.native
}

object WebAccountClientView {
  @scala.inline
  def apply(accountPairwiseId: String, applicationCallbackUri: Uri, `type`: WebAccountClientViewType): WebAccountClientView = {
    val __obj = js.Dynamic.literal(accountPairwiseId = accountPairwiseId.asInstanceOf[js.Any], applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountClientView]
  }
  @scala.inline
  implicit class WebAccountClientViewOps[Self <: WebAccountClientView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPairwiseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPairwiseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationCallbackUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCallbackUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WebAccountClientViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

