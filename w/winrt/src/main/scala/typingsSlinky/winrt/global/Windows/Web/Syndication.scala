package typingsSlinky.winrt.global.Windows.Web

import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationErrorStatus
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
  }
  
  @js.native
  class SyndicationCategory ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationCategory {
    def this(term: String) = this()
    def this(term: String, scheme: String, label: String) = this()
  }
  
  @js.native
  class SyndicationClient ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationClient {
    def this(serverCredential: PasswordCredential) = this()
  }
  
  @js.native
  class SyndicationContent ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationContent {
    def this(sourceUri: Uri) = this()
    def this(text: String, `type`: SyndicationTextType) = this()
  }
  
  @js.native
  class SyndicationError ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationError
  
  @js.native
  class SyndicationFeed ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFeed {
    def this(title: String, subtitle: String, uri: Uri) = this()
  }
  
  @js.native
  class SyndicationGenerator ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationGenerator {
    def this(text: String) = this()
  }
  
  @js.native
  class SyndicationItem ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationItem {
    def this(title: String, content: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationContent, uri: Uri) = this()
  }
  
  @js.native
  class SyndicationLink ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationLink {
    def this(uri: Uri) = this()
    def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
  }
  
  @js.native
  class SyndicationNode ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationNode {
    def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
  }
  
  @js.native
  class SyndicationPerson ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationPerson {
    def this(name: String) = this()
    def this(name: String, email: String, uri: Uri) = this()
  }
  
  @js.native
  class SyndicationText ()
    extends typingsSlinky.winrt.Windows.Web.Syndication.SyndicationText {
    def this(text: String) = this()
    def this(text: String, `type`: SyndicationTextType) = this()
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

