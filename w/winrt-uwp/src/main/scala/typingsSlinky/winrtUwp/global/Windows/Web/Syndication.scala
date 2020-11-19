package typingsSlinky.winrtUwp.global.Windows.Web

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus
import typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationTextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages syndication feeds. */
@JSGlobal("Windows.Web.Syndication")
@js.native
object Syndication extends js.Object {
  
  /** Represents a custom attribute not defined in the specification. */
  @js.native
  /** Creates a new SyndicationAttribute object. */
  class SyndicationAttribute ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationAttribute {
    /**
      * Creates a new SyndicationAttribute object with the specified Name, Namespace, and Value property values.
      * @param attributeName The name of the attribute.
      * @param attributeNamespace The namespace of the attribute.
      * @param attributeValue The value of the attribute.
      */
    def this(attributeName: String, attributeNamespace: String, attributeValue: String) = this()
  }
  
  /** Represents the category of a feed or an item. This class encapsulates information in the /rss/channel/item/category element in RSS 2.0 or the atom:category element in Atom 1.0. */
  @js.native
  /** Creates a SyndicationCategory object. */
  class SyndicationCategory ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationCategory {
    /**
      * Creates a SyndicationCategory object with the specified term property.
      * @param term A string that identifies the category. This parameter represents the required term attribute on atom:category or the text content of the category element in RSS 2.0.
      */
    def this(term: String) = this()
    /**
      * Creates SyndicationCategory object with the specified property values.
      * @param term A string that identifies the category.
      * @param scheme The scheme of the category.
      * @param label A label for display in end-user applications.
      */
    def this(term: String, scheme: String, label: String) = this()
  }
  
  /** Implements the ISyndicationClient interface which retrieves feeds from a URI asynchronously. */
  @js.native
  /** Creates a new SyndicationClient object. */
  class SyndicationClient ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationClient {
    /**
      * Creates a new SyndicationClient object with authentication credentials.
      * @param serverCredential Credentials for user authentication.
      */
    def this(serverCredential: PasswordCredential) = this()
  }
  
  /** Represents feed content including Text, HTML, XHTML, URL, and XML. This object encapsulates the atom:content element in Atom 1.0 and can contain a link to external content. */
  @js.native
  /** Creates a new SyndicationContent object. */
  class SyndicationContent ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationContent {
    /**
      * Creates a new SyndicationContent object with the specified Uri property value.
      * @param sourceUri The Uri value.
      */
    def this(sourceUri: Uri) = this()
    /**
      * Creates a new SyndicationContent object with the specified Text and Type property values.
      * @param text The text of the content.
      * @param type The type of the content.
      */
    def this(text: String, `type`: SyndicationTextType) = this()
  }
  
  /** Represents an error encountered during a Syndication operation. */
  @js.native
  abstract class SyndicationError ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationError
  /* static members */
  @js.native
  object SyndicationError extends js.Object {
    
    /**
      * Gets the specific error using the returned HRESULT value. Possible values are defined by SyndicationErrorStatus .
      * @param hresult An HRESULT returned during the operation.
      * @return The error encountered.
      */
    def getStatus(hresult: Double): SyndicationErrorStatus = js.native
  }
  
  /** Defines errors encountered during a Syndication operation. */
  @js.native
  object SyndicationErrorStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus with Double
      ] = js.native
    
    /* 3 */ val invalidXml: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml with Double = js.native
    
    /* 2 */ val missingRequiredAttribute: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute with Double = js.native
    
    /* 1 */ val missingRequiredElement: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement with Double = js.native
    
    /* 4 */ val unexpectedContent: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unknown with Double = js.native
    
    /* 5 */ val unsupportedFormat: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat with Double = js.native
  }
  
  /** Contains information about a feed. This class encapsulates the information in the /rss/channel element in RSS 2.0 or the atom:feed element in Atom 1.0. */
  @js.native
  /** Creates a new SyndicationFeed object. */
  class SyndicationFeed ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFeed {
    /**
      * Creates a new SyndicationFeed object with a Title, Subtitle, and Uri.
      * @param title The Title of the syndication feed.
      * @param subtitle The Subtitle of the syndication feed.
      * @param uri The Uri value.
      */
    def this(title: String, subtitle: String, uri: Uri) = this()
  }
  
  /** Specifies the syndication formats supported by the API. */
  @js.native
  object SyndicationFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat with Double] = js.native
    
    /* 5 */ val atom03: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.atom03 with Double = js.native
    
    /* 0 */ val atom10: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.atom10 with Double = js.native
    
    /* 4 */ val rss091: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss091 with Double = js.native
    
    /* 3 */ val rss092: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss092 with Double = js.native
    
    /* 2 */ val rss10: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss10 with Double = js.native
    
    /* 1 */ val rss20: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss20 with Double = js.native
  }
  
  /** Describes the agent or the tool used to generate the feed. This class encapsulates information in the /rss/channel/generator element in RSS 2.0 or the /atom:feed/atom:generator element in Atom 1.0. */
  @js.native
  /** Creates a new SyndicationGenerator object. */
  class SyndicationGenerator ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationGenerator {
    /**
      * Creates a new SyndicationGenerator object with the specified Text property value.
      * @param text Identifies the generator. This parameter represents the text content in the atom:generator element or the generator element in RSS 2.0.
      */
    def this(text: String) = this()
  }
  
  /** Represents an item in the feed. This class encapsulates information in the /rss/channel/item element in RSS 2.0 or the atom:entry element in Atom 1.0. */
  @js.native
  /** Creates a new SyndicationItem object. */
  class SyndicationItem ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationItem {
    /**
      * Creates a new SyndicationItem object with a title, content, and URI.
      * @param title Title of the new item.
      * @param content The content for this feed item.
      * @param uri The URI associated with this item.
      */
    def this(
      title: String,
      content: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationContent,
      uri: Uri
    ) = this()
  }
  
  /** Represents a link within a syndication feed or item. This class encapsulates information in the /rss/channel/link or / rss/channel/item/link element in RSS 2.0 or the atom:link element in Atom 1.0. */
  @js.native
  /** Creates a new SyndicationLink object. */
  class SyndicationLink ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationLink {
    /**
      * Creates a new SyndicationLink with a Uri.
      * @param uri The Uri value.
      */
    def this(uri: Uri) = this()
    /**
      * Creates a new SyndicationLink object with a Uri, Relationship, Title, MediaType, and Length.
      * @param uri The Uri value.
      * @param relationship The relationship type.
      * @param title The title of the syndication link.
      * @param mediaType The MediaType of the syndication link.
      * @param length The length, in bytes, of the syndication link.
      */
    def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
  }
  
  /** Implements the ISyndicationNode interface which represents a generic XML syndication element. */
  @js.native
  /** Creates a new SyndicationNode object. */
  class SyndicationNode ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationNode {
    /**
      * Creates a new SyndicationNode object with the specified NodeName, NodeNamespace, and NodeValue property values.
      * @param nodeName The local name of the element. It must be valid according to XML 1.0.
      * @param nodeNamespace The namespace of the element.
      * @param nodeValue The text content of the element. If the element contains only child elements, this parameter is NULL.
      */
    def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
  }
  
  /** Represents an author or contributor of syndication content. */
  @js.native
  /** Creates a SyndicationPerson object. */
  class SyndicationPerson ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationPerson {
    /**
      * Creates a SyndicationPerson object with the specified Name property value.
      * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
      */
    def this(name: String) = this()
    /**
      * Creates a SyndicationPerson object with the specified Name, Email, and Uri property values.
      * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
      * @param email Gets or sets the email address of the person. This property represents the atom:email element.
      * @param uri Gets or sets the URI of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because relative URI is not supported by the runtime URI class.
      */
    def this(name: String, email: String, uri: Uri) = this()
  }
  
  /** Implements the ISyndicationText interface that encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML. In Atom 1.0, this object maps to an atomTextConstruct in the schema, which can be atom:title, atom:subtitle, atom:rights, or atom:summary elements. */
  @js.native
  /** Creates a new SyndicationText object. */
  class SyndicationText ()
    extends typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationText {
    /**
      * Creates a new SyndicationText object with the specified Text property value.
      * @param text The content of a text content construct like atom:title.
      */
    def this(text: String) = this()
    /**
      * Creates a new SyndicationText object with the specified Text and Type property values.
      * @param text The content of a text content construct like atom:title.
      * @param type The type of the content. This value can be "text", "html", and "xhtml".
      */
    def this(text: String, `type`: SyndicationTextType) = this()
  }
  
  /** Specifies the text types supported for syndication content. */
  @js.native
  object SyndicationTextType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationTextType with Double] = js.native
    
    /* 1 */ val html: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationTextType.html with Double = js.native
    
    /* 0 */ val text: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationTextType.text with Double = js.native
    
    /* 2 */ val xhtml: typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationTextType.xhtml with Double = js.native
  }
}
