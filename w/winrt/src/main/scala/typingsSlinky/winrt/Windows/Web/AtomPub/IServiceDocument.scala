package typingsSlinky.winrt.Windows.Web.AtomPub

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Web.Syndication.ISyndicationNode
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationAttribute
import typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServiceDocument extends ISyndicationNode {
  
  var workspaces: IVectorView[Workspace] = js.native
}
object IServiceDocument {
  
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
    workspaces: IVectorView[Workspace]
  ): IServiceDocument = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceDocument]
  }
  
  @scala.inline
  implicit class IServiceDocumentOps[Self <: IServiceDocument] (val x: Self) extends AnyVal {
    
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
    def setWorkspaces(value: IVectorView[Workspace]): Self = this.set("workspaces", value.asInstanceOf[js.Any])
  }
}
