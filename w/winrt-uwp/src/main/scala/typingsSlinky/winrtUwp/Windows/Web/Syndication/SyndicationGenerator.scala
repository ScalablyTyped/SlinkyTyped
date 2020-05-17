package typingsSlinky.winrtUwp.Windows.Web.Syndication

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the agent or the tool used to generate the feed. This class encapsulates information in the /rss/channel/generator element in RSS 2.0 or the /atom:feed/atom:generator element in Atom 1.0. */
@js.native
trait SyndicationGenerator extends js.Object {
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
  /** Gets or sets the text that identifies the generator. */
  var text: String = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the syndication generator. */
  var uri: Uri = js.native
  /** Gets or sets the version of the generator. */
  var version: String = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

object SyndicationGenerator {
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
    text: String,
    uri: Uri,
    version: String
  ): SyndicationGenerator = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationGenerator]
  }
  @scala.inline
  implicit class SyndicationGeneratorOps[Self <: SyndicationGenerator] (val x: Self) extends AnyVal {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

