package typingsSlinky.wordpressCustomizeBrowser.utilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.std.Record
import typingsSlinky.wordpressCustomizeBrowser.classMod.Class
import typingsSlinky.wordpressCustomizeBrowser.controlMod.Control
import typingsSlinky.wordpressCustomizeBrowser.panelMod.Panel
import typingsSlinky.wordpressCustomizeBrowser.sectionMod.Section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends js.Object {
  
  def areElementListsEqual(listA: js.Array[JQuery[HTMLElement]], listB: js.Array[JQuery[HTMLElement]]): Boolean = js.native
  
  def bubbleChildValueChanges(instance: Class, properties: js.Array[_]): Unit = js.native
  
  def getCurrentTimestamp(): Double = js.native
  
  def getRemainingTime(datetime: String): Double = js.native
  def getRemainingTime(datetime: Double): Double = js.native
  def getRemainingTime(datetime: js.Date): Double = js.native
  
  def highlightButton(button: JQuery[HTMLElement]): js.Function0[Unit] = js.native
  def highlightButton(button: JQuery[HTMLElement], options: HighlightButtonOptions): js.Function0[Unit] = js.native
  
  def isKeydownButNotEnterEvent(event: Event): Boolean = js.native
  
  def parseQueryString(queryString: String): Record[String, String] = js.native
  
  def prioritySort(a: Control, b: Control): Double = js.native
  def prioritySort(a: Control, b: Panel): Double = js.native
  def prioritySort(a: Control, b: Section): Double = js.native
  def prioritySort(a: Panel, b: Control): Double = js.native
   // TODO
  def prioritySort(a: Panel, b: Panel): Double = js.native
  def prioritySort(a: Panel, b: Section): Double = js.native
  def prioritySort(a: Section, b: Control): Double = js.native
  def prioritySort(a: Section, b: Panel): Double = js.native
  def prioritySort(a: Section, b: Section): Double = js.native
}
