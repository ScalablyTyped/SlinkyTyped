package typingsSlinky.sharepoint.global.SP.UI

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.UIUtility")
@js.native
object UIUtility extends js.Object {
  
  def calculateOffsetLeft(elem: HTMLElement): Double = js.native
  
  def calculateOffsetTop(elem: HTMLElement): Double = js.native
  
  def cancelEvent(evt: Event): Unit = js.native
  
  def clearChildNodes(elem: HTMLElement): Unit = js.native
  
  def createHtmlInputCheck(isChecked: Boolean): HTMLInputElement = js.native
  
  def createHtmlInputText(text: String): HTMLInputElement = js.native
  
  def focusValidOnThisNode(elem: HTMLElement): Boolean = js.native
  
  def generateRandomElementId(): String = js.native
  
  def getInnerText(elem: HTMLElement): String = js.native
  
  def hideElement(elem: HTMLElement): Unit = js.native
  
  def insertAfter(elem: HTMLElement, targetElement: HTMLElement): Unit = js.native
  
  def insertBefore(elem: HTMLElement, targetElement: HTMLElement): Unit = js.native
  
  def isNodeOfType(elem: HTMLElement, tagNames: js.Array[String]): Boolean = js.native
  
  def isSvgNode(elem: HTMLElement): Boolean = js.native
  
  def isTextNode(elem: HTMLElement): Boolean = js.native
  
  def removeNode(elem: HTMLElement): Unit = js.native
  
  def setInnerText(elem: HTMLElement, value: String): Unit = js.native
  
  def showElement(elem: HTMLElement): Unit = js.native
}
