package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationNode extends StObject {
  
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  
  var baseUri: Uri = js.native
  
  var elementExtensions: IVector[ISyndicationNode] = js.native
  
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  
  var language: String = js.native
  
  var nodeName: String = js.native
  
  var nodeNamespace: String = js.native
  
  var nodeValue: String = js.native
}
object ISyndicationNode {
  
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String
  ): ISyndicationNode = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationNode]
  }
  
  @scala.inline
  implicit class ISyndicationNodeMutableBuilder[Self <: ISyndicationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
  }
}
