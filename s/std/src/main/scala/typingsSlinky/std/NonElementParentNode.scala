package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonElementParentNode extends StObject {
  
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  def getElementById(elementId: java.lang.String): org.scalajs.dom.raw.Element | Null = js.native
}
object NonElementParentNode {
  
  @scala.inline
  def apply(getElementById: java.lang.String => org.scalajs.dom.raw.Element | Null): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById))
    __obj.asInstanceOf[NonElementParentNode]
  }
  
  @scala.inline
  implicit class NonElementParentNodeMutableBuilder[Self <: NonElementParentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElementById(value: java.lang.String => org.scalajs.dom.raw.Element | Null): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
  }
}
