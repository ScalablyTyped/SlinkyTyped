package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends js.Object {
  val filter: org.scalajs.dom.raw.NodeFilter | Null
  val pointerBeforeReferenceNode: scala.Boolean
  val referenceNode: org.scalajs.dom.raw.Node
  val root: org.scalajs.dom.raw.Node
  val whatToShow: Double
  def detach(): Unit
  def nextNode(): org.scalajs.dom.raw.Node | Null
  def previousNode(): org.scalajs.dom.raw.Node | Null
}

@JSGlobal("NodeIterator")
@js.native
object NodeIterator extends Instantiable0[NodeIterator]

