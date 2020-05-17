package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delete account operation. */
@js.native
trait WebAccountProviderDeleteAccountOperation extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to delete. */
  var webAccount: WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

object WebAccountProviderDeleteAccountOperation {
  @scala.inline
  def apply(
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    webAccount: WebAccount
  ): WebAccountProviderDeleteAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderDeleteAccountOperation]
  }
  @scala.inline
  implicit class WebAccountProviderDeleteAccountOperationOps[Self <: WebAccountProviderDeleteAccountOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

