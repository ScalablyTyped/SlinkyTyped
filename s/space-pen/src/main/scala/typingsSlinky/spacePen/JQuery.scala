package typingsSlinky.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://atom.github.io/space-pen/
@js.native
trait JQuery extends js.Object {
  
  def command(eventName: js.Any, handler: js.Any): js.Any = js.native
  def command(eventName: js.Any, selector: js.Any, handler: js.Any): js.Any = js.native
  def command(eventName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
  
  def containsElement(element: js.Any): Boolean = js.native
  
  def disable(): JQuery = js.native
  
  def document(eventName: js.Any, docString: String): js.Any = js.native
  
  def enable(): JQuery = js.native
  
  def events(): js.Any = js.native
  
  def flashError(): Double = js.native
  
  def handlers(eventName: js.Any): js.Any = js.native
  
  def hasFocus(): Boolean = js.native
  
  def hasParent(): Boolean = js.native
  
  def iconSize(size: Double): Unit = js.native
  
  def indexOf(child: js.Any): js.Any = js.native
  
  def insertAt(index: Double, element: js.Any): JQuery = js.native
  
  def intValue(): Double = js.native
  
  def isDisabled(): Boolean = js.native
  
  def isHidden(): Boolean = js.native
  
  def isOnDom(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def pageDown(): JQuery = js.native
  
  def pageUp(): JQuery = js.native
  
  def preempt(eventName: js.Any, handler: js.Function): js.Any = js.native
  
  def removeAt(index: Double): JQuery = js.native
  
  def scrollBottom(): Double = js.native
  def scrollBottom(newValue: Double): JQuery = js.native
  
  def scrollDown(): JQuery = js.native
  
  def scrollRight(): Double = js.native
  def scrollRight(newValue: Double): JQuery = js.native
  
  def scrollToBottom(): JQuery = js.native
  
  def scrollToTop(): JQuery = js.native
  
  def scrollUp(): JQuery = js.native
  
  def trueHeight(): js.Any = js.native
  
  def trueWidth(): js.Any = js.native
  
  def view(): js.Any = js.native
  
  def views(): js.Array[_] = js.native
}
