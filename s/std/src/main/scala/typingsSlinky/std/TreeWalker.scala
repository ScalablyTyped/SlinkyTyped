package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The nodes of a document subtree and a position within them. */
@js.native
trait TreeWalker extends js.Object {
  var currentNode: org.scalajs.dom.raw.Node = js.native
  val filter: org.scalajs.dom.raw.NodeFilter | Null = js.native
  val root: org.scalajs.dom.raw.Node = js.native
  val whatToShow: Double = js.native
  def firstChild(): org.scalajs.dom.raw.Node | Null = js.native
  def lastChild(): org.scalajs.dom.raw.Node | Null = js.native
  def nextNode(): org.scalajs.dom.raw.Node | Null = js.native
  def nextSibling(): org.scalajs.dom.raw.Node | Null = js.native
  def parentNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousSibling(): org.scalajs.dom.raw.Node | Null = js.native
}

@JSGlobal("TreeWalker")
@js.native
object TreeWalker
  extends Instantiable0[org.scalajs.dom.raw.TreeWalker]

