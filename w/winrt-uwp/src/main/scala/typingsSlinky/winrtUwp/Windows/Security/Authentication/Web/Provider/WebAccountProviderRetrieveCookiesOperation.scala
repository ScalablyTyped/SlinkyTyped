package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsSlinky.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a retrieve cookies operation made by a web account provider. */
@js.native
trait WebAccountProviderRetrieveCookiesOperation extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri = js.native
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie] = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

object WebAccountProviderRetrieveCookiesOperation {
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    context: Uri,
    cookies: IVector[HttpCookie],
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    uri: Uri
  ): WebAccountProviderRetrieveCookiesOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderRetrieveCookiesOperation]
  }
  @scala.inline
  implicit class WebAccountProviderRetrieveCookiesOperationOps[Self <: WebAccountProviderRetrieveCookiesOperation] (val x: Self) extends AnyVal {
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
    def withContext(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: IVector[HttpCookie]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
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
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

