package typingsSlinky.winrtUwp.Windows.Web.AtomPub

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Web.Syndication.ISyndicationNode
import typingsSlinky.winrtUwp.Windows.Web.Syndication.ISyndicationText
import typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationAttribute
import typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationCategory
import typingsSlinky.winrtUwp.Windows.Web.Syndication.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates one or more collections within a workspace. */
@js.native
trait ResourceCollection extends js.Object {
  /** Gets or sets the collection of app:accept elements. */
  var accepts: IVectorView[String] = js.native
  /** Gets the list of attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets the collection of atom:category elements within the app:categories element. */
  var categories: IVectorView[SyndicationCategory] = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
  var nodeValue: String = js.native
  /** Gets the atom:title element under the app:collection element. */
  var title: ISyndicationText = js.native
  /** Gets the Uniform Resource Identifier (URI) representing the href attribute of the app:collection element. This is the absolute URI resolved against the xml:base attribute when it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property will be Null. */
  var uri: Uri = js.native
  /**
    * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
    * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @return The XML document.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

object ResourceCollection {
  @scala.inline
  def apply(
    accepts: IVectorView[String],
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    categories: IVectorView[SyndicationCategory],
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    title: ISyndicationText,
    uri: Uri
  ): ResourceCollection = {
    val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCollection]
  }
  @scala.inline
  implicit class ResourceCollectionOps[Self <: ResourceCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCategories(value: IVectorView[SyndicationCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
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
    def withTitle(value: ISyndicationText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

