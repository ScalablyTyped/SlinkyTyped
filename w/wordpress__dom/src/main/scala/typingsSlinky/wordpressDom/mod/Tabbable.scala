package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tabbable extends Focusable {
  /**
    * Returns `true` if the specified element is tabbable, or `false` otherwise.
    *
    * @param element - Element to test.
    */
  def isTabbableIndex(element: Element): Boolean
}

object Tabbable {
  @scala.inline
  def apply(find: ParentNode => js.Array[Element], isTabbableIndex: Element => Boolean): Tabbable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
    __obj.asInstanceOf[Tabbable]
  }
}

