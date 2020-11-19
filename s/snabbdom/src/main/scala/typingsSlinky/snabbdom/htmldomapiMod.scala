package typingsSlinky.snabbdom

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/htmldomapi", JSImport.Namespace)
@js.native
object htmldomapiMod extends js.Object {
  
  val htmlDomApi: DOMAPI = js.native
  
  @js.native
  trait DOMAPI extends js.Object {
    
    def appendChild(node: Node, child: Node): Unit = js.native
    
    def createComment(text: String): Comment = js.native
    
    def createElement(tagName: js.Any): HTMLElement = js.native
    
    def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native
    
    def createTextNode(text: String): Text = js.native
    
    def getTextContent(node: Node): String | Null = js.native
    
    def insertBefore(parentNode: Node, newNode: Node): Unit = js.native
    def insertBefore(parentNode: Node, newNode: Node, referenceNode: Node): Unit = js.native
    
    def isComment(node: Node): /* is std.Comment */ Boolean = js.native
    
    def isElement(node: Node): /* is std.Element */ Boolean = js.native
    
    def isText(node: Node): /* is std.Text */ Boolean = js.native
    
    def nextSibling(node: Node): Node | Null = js.native
    
    def parentNode(node: Node): Node | Null = js.native
    
    def removeChild(node: Node, child: Node): Unit = js.native
    
    def setTextContent(node: Node): Unit = js.native
    def setTextContent(node: Node, text: String): Unit = js.native
    
    def tagName(elm: Element): String = js.native
  }
}
