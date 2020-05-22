package typingsSlinky.winrt.global.Windows.Web

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrt.Windows.Web.Syndication.ISyndicationNode
import typingsSlinky.winrt.Windows.Web.Syndication.ISyndicationText
import typingsSlinky.winrt.Windows.Web.Syndication.RetrievalProgress
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationTextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication")
@js.native
object Syndication extends js.Object {
  @js.native
  class SyndicationAttribute ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute {
    def this(attributeName: String, attributeNamespace: String, attributeValue: String) = this()
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var namespace: String = js.native
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  class SyndicationCategory ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationCategory {
    def this(term: String) = this()
    def this(term: String, scheme: String, label: String) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var label: String = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var scheme: String = js.native
    /* CompleteClass */
    override var term: String = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationClient ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationClient {
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
    override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed, RetrievalProgress] = js.native
    /* CompleteClass */
    override def setRequestHeader(name: String, value: String): Unit = js.native
  }
  
  @js.native
  class SyndicationContent ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationContent {
    def this(sourceUri: Uri) = this()
    def this(text: String, `type`: SyndicationTextType) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
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
    override var sourceUri: Uri = js.native
    /* CompleteClass */
    override var text: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override var xml: XmlDocument = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationError ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationError
  
  @js.native
  class SyndicationFeed ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed {
    def this(title: String, subtitle: String, uri: Uri) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
    /* CompleteClass */
    override var authors: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var categories: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationCategory] = js.native
    /* CompleteClass */
    override var contributors: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var firstUri: Uri = js.native
    /* CompleteClass */
    override var generator: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationGenerator = js.native
    /* CompleteClass */
    override var iconUri: Uri = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var imageUri: Uri = js.native
    /* CompleteClass */
    override var items: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationItem] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var lastUpdatedTime: js.Date = js.native
    /* CompleteClass */
    override var lastUri: Uri = js.native
    /* CompleteClass */
    override var links: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationLink] = js.native
    /* CompleteClass */
    override var nextUri: Uri = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var previousUri: Uri = js.native
    /* CompleteClass */
    override var rights: ISyndicationText = js.native
    /* CompleteClass */
    override var sourceFormat: SyndicationFormat = js.native
    /* CompleteClass */
    override var subtitle: ISyndicationText = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    /* CompleteClass */
    override def load(feed: String): Unit = js.native
    /* CompleteClass */
    override def loadFromXml(feedDocument: XmlDocument): Unit = js.native
  }
  
  @js.native
  class SyndicationGenerator ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationGenerator {
    def this(text: String) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
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
    override var text: String = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override var version: String = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationItem ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationItem {
    def this(title: String, content: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationContent, uri: Uri) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
    /* CompleteClass */
    override var authors: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var categories: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationCategory] = js.native
    /* CompleteClass */
    override var commentsUri: Uri = js.native
    /* CompleteClass */
    override var content: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationContent = js.native
    /* CompleteClass */
    override var contributors: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
    /* CompleteClass */
    override var eTag: String = js.native
    /* CompleteClass */
    override var editMediaUri: Uri = js.native
    /* CompleteClass */
    override var editUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var itemUri: Uri = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var lastUpdatedTime: js.Date = js.native
    /* CompleteClass */
    override var links: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationLink] = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var publishedDate: js.Date = js.native
    /* CompleteClass */
    override var rights: ISyndicationText = js.native
    /* CompleteClass */
    override var source: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed = js.native
    /* CompleteClass */
    override var summary: ISyndicationText = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    /* CompleteClass */
    override def load(item: String): Unit = js.native
    /* CompleteClass */
    override def loadFromXml(itemDocument: XmlDocument): Unit = js.native
  }
  
  @js.native
  class SyndicationLink ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationLink {
    def this(uri: Uri) = this()
    def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var length: Double = js.native
    /* CompleteClass */
    override var mediaType: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var relationship: String = js.native
    /* CompleteClass */
    override var resourceLanguage: String = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationNode ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationNode {
    def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
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
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationPerson ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson {
    def this(name: String) = this()
    def this(name: String, email: String, uri: Uri) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var email: String = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class SyndicationText ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationText {
    def this(text: String) = this()
    def this(text: String, `type`: SyndicationTextType) = this()
    /* CompleteClass */
    override var attributeExtensions: IVector[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
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
    override var text: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override var xml: XmlDocument = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  /* static members */
  @js.native
  object SyndicationError extends js.Object {
    def getStatus(hresult: Double): SyndicationErrorStatus = js.native
  }
  
  @js.native
  object SyndicationErrorStatus extends js.Object {
    /* 3 */ val invalidXml: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml with Double = js.native
    /* 2 */ val missingRequiredAttribute: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute with Double = js.native
    /* 1 */ val missingRequiredElement: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement with Double = js.native
    /* 4 */ val unexpectedContent: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent with Double = js.native
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unknown with Double = js.native
    /* 5 */ val unsupportedFormat: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus with Double] = js.native
  }
  
  @js.native
  object SyndicationFormat extends js.Object {
    /* 5 */ val atom03: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.atom03 with Double = js.native
    /* 0 */ val atom10: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.atom10 with Double = js.native
    /* 4 */ val rss091: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss091 with Double = js.native
    /* 3 */ val rss092: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss092 with Double = js.native
    /* 2 */ val rss10: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss10 with Double = js.native
    /* 1 */ val rss20: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss20 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat with Double] = js.native
  }
  
  @js.native
  object SyndicationTextType extends js.Object {
    /* 1 */ val html: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationTextType.html with Double = js.native
    /* 0 */ val text: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationTextType.text with Double = js.native
    /* 2 */ val xhtml: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationTextType.xhtml with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Web.Syndication.SyndicationTextType with Double] = js.native
  }
  
}

