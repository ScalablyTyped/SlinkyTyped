package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request token operation. */
@js.native
trait WebAccountProviderRequestTokenOperation extends js.Object {
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: js.Date = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse] = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): Unit = js.native
}

object WebAccountProviderRequestTokenOperation {
  @scala.inline
  def apply(
    cacheExpirationTime: js.Date,
    kind: WebAccountProviderOperationKind,
    providerRequest: WebProviderTokenRequest,
    providerResponses: IVector[WebProviderTokenResponse],
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    reportUserCanceled: () => Unit
  ): WebAccountProviderRequestTokenOperation = {
    val __obj = js.Dynamic.literal(cacheExpirationTime = cacheExpirationTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], providerRequest = providerRequest.asInstanceOf[js.Any], providerResponses = providerResponses.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), reportUserCanceled = js.Any.fromFunction0(reportUserCanceled))
    __obj.asInstanceOf[WebAccountProviderRequestTokenOperation]
  }
  @scala.inline
  implicit class WebAccountProviderRequestTokenOperationOps[Self <: WebAccountProviderRequestTokenOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: WebAccountProviderOperationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderRequest(value: WebProviderTokenRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderResponses(value: IVector[WebProviderTokenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerResponses")(value.asInstanceOf[js.Any])
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
    def withReportUserCanceled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUserCanceled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

