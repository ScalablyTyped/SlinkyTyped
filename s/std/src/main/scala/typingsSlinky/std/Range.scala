package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A fragment of a document that can contain nodes and parts of text nodes. */
@js.native
trait Range extends AbstractRange {
  
  val END_TO_END: Double = js.native
  
  val END_TO_START: Double = js.native
  
  val START_TO_END: Double = js.native
  
  val START_TO_START: Double = js.native
  
  def cloneContents(): org.scalajs.dom.raw.DocumentFragment = js.native
  
  def cloneRange(): org.scalajs.dom.raw.Range = js.native
  
  def collapse(): Unit = js.native
  def collapse(toStart: scala.Boolean): Unit = js.native
  
  /**
    * Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node.
    */
  val commonAncestorContainer: org.scalajs.dom.raw.Node = js.native
  
  def compareBoundaryPoints(how: Double, sourceRange: org.scalajs.dom.raw.Range): Double = js.native
  
  /**
    * Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range.
    */
  def comparePoint(node: org.scalajs.dom.raw.Node, offset: Double): Double = js.native
  
  def createContextualFragment(fragment: java.lang.String): org.scalajs.dom.raw.DocumentFragment = js.native
  
  def deleteContents(): Unit = js.native
  
  def detach(): Unit = js.native
  
  def extractContents(): org.scalajs.dom.raw.DocumentFragment = js.native
  
  def getBoundingClientRect(): DOMRect = js.native
  
  def getClientRects(): DOMRectList = js.native
  
  def insertNode(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  /**
    * Returns whether range intersects node.
    */
  def intersectsNode(node: org.scalajs.dom.raw.Node): scala.Boolean = js.native
  
  def isPointInRange(node: org.scalajs.dom.raw.Node, offset: Double): scala.Boolean = js.native
  
  def selectNode(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def selectNodeContents(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def setEnd(node: org.scalajs.dom.raw.Node, offset: Double): Unit = js.native
  
  def setEndAfter(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def setEndBefore(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def setStart(node: org.scalajs.dom.raw.Node, offset: Double): Unit = js.native
  
  def setStartAfter(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def setStartBefore(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def surroundContents(newParent: org.scalajs.dom.raw.Node): Unit = js.native
}
