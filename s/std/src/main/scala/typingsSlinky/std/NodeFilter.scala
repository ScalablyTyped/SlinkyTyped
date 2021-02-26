package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object used to filter the nodes in a NodeIterator or TreeWalker. They don't know anything about the DOM or how to traverse nodes; they just know how to evaluate a single node against the provided filter. */
@js.native
trait NodeFilter extends StObject {
  
  def acceptNode(node: org.scalajs.dom.raw.Node): Double = js.native
}
object NodeFilter {
  
  @scala.inline
  def apply(acceptNode: org.scalajs.dom.raw.Node => Double): org.scalajs.dom.raw.NodeFilter = {
    val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
    __obj.asInstanceOf[org.scalajs.dom.raw.NodeFilter]
  }
  
  @scala.inline
  implicit class NodeFilterMutableBuilder[Self <: org.scalajs.dom.raw.NodeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptNode(value: org.scalajs.dom.raw.Node => Double): Self = StObject.set(x, "acceptNode", js.Any.fromFunction1(value))
  }
}
