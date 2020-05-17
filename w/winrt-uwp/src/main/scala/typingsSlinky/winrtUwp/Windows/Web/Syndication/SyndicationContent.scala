package typingsSlinky.winrtUwp.Windows.Web.Syndication

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents feed content including Text, HTML, XHTML, URL, and XML. This object encapsulates the atom:content element in Atom 1.0 and can contain a link to external content. */
@js.native
trait SyndicationContent extends js.Object {
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String = js.native
  /** Gets or sets the URI to the content. This property represents the src attribute on atom:content. */
  var sourceUri: Uri = js.native
  /** Gets the syndication content. */
  var text: String = js.native
  /** Gets or sets the type of the content. */
  var `type`: String = js.native
  /** Gets or sets the XML content. */
  var xml: XmlDocument = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

object SyndicationContent {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    sourceUri: Uri,
    text: String,
    `type`: String,
    xml: XmlDocument
  ): SyndicationContent = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationContent]
  }
  @scala.inline
  implicit class SyndicationContentOps[Self <: SyndicationContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeExtensions(value: IVector[SyndicationAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementExtensions(value: IVector[ISyndicationNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXmlDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

