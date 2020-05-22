package typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  @JSName("children")
  var children_Props: TagMod[Any]
  /**
    * A boolean which tells the component whether or not to cycle from the
    * end back to the beginning and vice versa.
    * @defaultValue true
    */
  var cycle: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback invoked when the menu navigates to one of its children
    * passing the index and child as an argument.
    */
  var onNavigate: js.UndefOr[js.Function2[/* nextIndex */ Double, /* focusedElement */ HTMLElement, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    children: TagMod[Any] = null,
    cycle: js.UndefOr[Boolean] = js.undefined,
    onNavigate: (/* nextIndex */ Double, /* focusedElement */ HTMLElement) => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.get.asInstanceOf[js.Any])
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction2(onNavigate))
    __obj.asInstanceOf[Props]
  }
}

