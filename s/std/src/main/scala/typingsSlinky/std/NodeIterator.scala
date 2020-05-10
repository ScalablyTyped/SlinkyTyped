package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
@js.native
trait NodeIterator extends js.Object {
  val filter: org.scalajs.dom.raw.NodeFilter | Null = js.native
  val pointerBeforeReferenceNode: scala.Boolean = js.native
  val referenceNode: org.scalajs.dom.raw.Node = js.native
  val root: org.scalajs.dom.raw.Node = js.native
  val whatToShow: Double = js.native
  def detach(): Unit = js.native
  def nextNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousNode(): org.scalajs.dom.raw.Node | Null = js.native
}

@JSGlobal("NodeIterator")
@js.native
object NodeIterator
  extends Instantiable0[org.scalajs.dom.raw.NodeIterator]

