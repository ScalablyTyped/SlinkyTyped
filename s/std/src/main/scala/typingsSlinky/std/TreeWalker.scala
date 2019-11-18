package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends js.Object {
  var currentNode: org.scalajs.dom.raw.Node
  val filter: org.scalajs.dom.raw.NodeFilter | Null
  val root: org.scalajs.dom.raw.Node
  val whatToShow: Double
  def firstChild(): org.scalajs.dom.raw.Node | Null
  def lastChild(): org.scalajs.dom.raw.Node | Null
  def nextNode(): org.scalajs.dom.raw.Node | Null
  def nextSibling(): org.scalajs.dom.raw.Node | Null
  def parentNode(): org.scalajs.dom.raw.Node | Null
  def previousNode(): org.scalajs.dom.raw.Node | Null
  def previousSibling(): org.scalajs.dom.raw.Node | Null
}

@JSGlobal("TreeWalker")
@js.native
object TreeWalker extends Instantiable0[TreeWalker]

