package typingsSlinky.winrtUwp.Windows.Web.Syndication

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements the ISyndicationClient interface which retrieves feeds from a URI asynchronously. */
@js.native
trait SyndicationClient extends js.Object {
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: Boolean = js.native
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: Double = js.native
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: PasswordCredential = js.native
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: PasswordCredential = js.native
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: Double = js.native
  /**
    * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
    * @param uri The URI from which the feed is downloaded.
    * @return Contains the results of the operation.
    */
  def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /**
    * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
    * @param name The name of the header.
    * @param value The value of the header.
    */
  def setRequestHeader(name: String, value: String): Unit = js.native
}

object SyndicationClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double
  ): SyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationClient]
  }
  @scala.inline
  implicit class SyndicationClientOps[Self <: SyndicationClient] (val x: Self) extends AnyVal {
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
    def withRetrieveFeedAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = {
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

