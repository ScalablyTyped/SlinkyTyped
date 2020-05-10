package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationClient extends js.Object {
  var bypassCacheOnRetrieve: Boolean = js.native
  var maxResponseBufferSize: Double = js.native
  var proxyCredential: PasswordCredential = js.native
  var serverCredential: PasswordCredential = js.native
  var timeout: Double = js.native
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  def setRequestHeader(name: String, value: String): Unit = js.native
}

object ISyndicationClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double
  ): ISyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationClient]
  }
  @scala.inline
  implicit class ISyndicationClientOps[Self <: ISyndicationClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBypassCacheOnRetrieve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassCacheOnRetrieve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResponseBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResponseBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrieveFeedAsync(value: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveFeedAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withServerCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRequestHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

