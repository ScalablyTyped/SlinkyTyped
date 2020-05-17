package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sign out account operation made by a web account provider. */
@js.native
trait WebAccountProviderSignOutAccountOperation extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the client Id. */
  var clientId: String = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to sign out. */
  var webAccount: WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

object WebAccountProviderSignOutAccountOperation {
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    clientId: String,
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    webAccount: WebAccount
  ): WebAccountProviderSignOutAccountOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderSignOutAccountOperation]
  }
  @scala.inline
  implicit class WebAccountProviderSignOutAccountOperationOps[Self <: WebAccountProviderSignOutAccountOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCallbackUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCallbackUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: WebAccountProviderOperationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportCompleted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReportError(value: WebProviderError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWebAccount(value: WebAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

