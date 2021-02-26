package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonDocumentTypeChildNode extends StObject {
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
}
object NonDocumentTypeChildNode {
  
  @scala.inline
  def apply(): org.scalajs.dom.raw.NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.raw.NonDocumentTypeChildNode]
  }
  
  @scala.inline
  implicit class NonDocumentTypeChildNodeMutableBuilder[Self <: org.scalajs.dom.raw.NonDocumentTypeChildNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextElementSibling(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
    
    @scala.inline
    def setPreviousElementSibling(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
  }
}
