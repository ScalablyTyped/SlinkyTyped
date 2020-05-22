package typingsSlinky.winrt.global.Windows.Web

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Web.Syndication.ISyndicationNode
import typingsSlinky.winrt.Windows.Web.Syndication.ISyndicationText
import typingsSlinky.winrt.Windows.Web.Syndication.RetrievalProgress
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationCategory
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationItem
import typingsSlinky.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  @js.native
  class AtomPubClient ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.AtomPubClient {
    def this(serverCredential: PasswordCredential) = this()
    /* CompleteClass */
    override var bypassCacheOnRetrieve: Boolean = js.native
    /* CompleteClass */
    override var maxResponseBufferSize: Double = js.native
    /* CompleteClass */
    override var proxyCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var serverCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var timeout: Double = js.native
    /* CompleteClass */
    override def cancelAsyncOperations(): Unit = js.native
    /* CompleteClass */
    override def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    /* CompleteClass */
    override def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    /* CompleteClass */
    override def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[typingsSlinky.winrt.Windows.Web.AtomPub.ServiceDocument, RetrievalProgress] = js.native
    /* CompleteClass */
    override def setRequestHeader(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  }
  
  @js.native
  class ResourceCollection ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.ResourceCollection {
    /* CompleteClass */
    override var accepts: IVectorView[String] = js.native
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var categories: IVectorView[SyndicationCategory] = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class ServiceDocument ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.ServiceDocument {
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var workspaces: IVectorView[typingsSlinky.winrt.Windows.Web.AtomPub.Workspace] = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class Workspace ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.Workspace {
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var collections: IVectorView[typingsSlinky.winrt.Windows.Web.AtomPub.ResourceCollection] = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
}

