package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends StObject {
  
  def addRange(range: org.scalajs.dom.raw.Range): Unit = js.native
  
  val anchorNode: org.scalajs.dom.raw.Node | Null = js.native
  
  val anchorOffset: Double = js.native
  
  def collapse(): Unit = js.native
  def collapse(node: org.scalajs.dom.raw.Node): Unit = js.native
  def collapse(node: org.scalajs.dom.raw.Node, offset: Double): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  
  def collapseToEnd(): Unit = js.native
  
  def collapseToStart(): Unit = js.native
  
  def containsNode(node: org.scalajs.dom.raw.Node): scala.Boolean = js.native
  def containsNode(node: org.scalajs.dom.raw.Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  
  def deleteFromDocument(): Unit = js.native
  
  def empty(): Unit = js.native
  
  def extend(node: org.scalajs.dom.raw.Node): Unit = js.native
  def extend(node: org.scalajs.dom.raw.Node, offset: Double): Unit = js.native
  
  val focusNode: org.scalajs.dom.raw.Node | Null = js.native
  
  val focusOffset: Double = js.native
  
  def getRangeAt(index: Double): org.scalajs.dom.raw.Range = js.native
  
  val isCollapsed: scala.Boolean = js.native
  
  val rangeCount: Double = js.native
  
  def removeAllRanges(): Unit = js.native
  
  def removeRange(range: org.scalajs.dom.raw.Range): Unit = js.native
  
  def selectAllChildren(node: org.scalajs.dom.raw.Node): Unit = js.native
  
  def setBaseAndExtent(
    anchorNode: org.scalajs.dom.raw.Node,
    anchorOffset: Double,
    focusNode: org.scalajs.dom.raw.Node,
    focusOffset: Double
  ): Unit = js.native
  
  def setPosition(): Unit = js.native
  def setPosition(node: org.scalajs.dom.raw.Node): Unit = js.native
  def setPosition(node: org.scalajs.dom.raw.Node, offset: Double): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  
  val `type`: java.lang.String = js.native
}
