package typingsSlinky.winrt.Windows.Web.AtomPub

import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Web.Syndication.RetrievalProgress
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationItem
import typingsSlinky.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtomPubClient extends IAtomPubClient
object AtomPubClient {
  
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    cancelAsyncOperations: () => Unit,
    createMediaResourceAsync: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    createResourceAsync: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    deleteResourceAsync: Uri => IAsyncActionWithProgress[TransferProgress],
    deleteResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress],
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    retrieveMediaResourceAsync: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress],
    retrieveResourceAsync: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
    retrieveServiceDocumentAsync: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double,
    updateMediaResourceAsync: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress],
    updateResourceAsync: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress],
    updateResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress]
  ): AtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
    __obj.asInstanceOf[AtomPubClient]
  }
}
