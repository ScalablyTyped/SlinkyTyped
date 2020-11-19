package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationClient extends js.Object {
  
  var bypassCacheOnRetrieve: Boolean = js.native
  
  var maxResponseBufferSize: Double = js.native
  
  var proxyCredential: PasswordCredential = js.native
  
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  
  var serverCredential: PasswordCredential = js.native
  
  def setRequestHeader(name: String, value: String): Unit = js.native
  
  var timeout: Double = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBypassCacheOnRetrieve(value: Boolean): Self = this.set("bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResponseBufferSize(value: Double): Self = this.set("maxResponseBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = this.set("proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveFeedAsync(value: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = this.set("retrieveFeedAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = this.set("serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = this.set("setRequestHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
