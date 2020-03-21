package typingsSlinky.selectorSet.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.selectorSet.AnonData
import typingsSlinky.selectorSet.AnonElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorSet[T] extends js.Object {
  var indexes: js.Array[ISelectorSetIndex] = js.native
  var size: Double = js.native
  def add(selector: String, data: T): Unit = js.native
  def logDefaultIndexUsed(hasSelectorData: AnonData[T]): Unit = js.native
  def matches(el: Element): js.Array[AnonData[T]] = js.native
  def matchesSelector(el: Element, selector: String): Boolean = js.native
  def queryAll(context: Element): js.Array[AnonElements[T]] = js.native
  def querySelectorAll(selectors: String, context: Element): js.Array[Element] = js.native
  def remove(selector: String): Unit = js.native
  def remove(selector: String, data: T): Unit = js.native
}

