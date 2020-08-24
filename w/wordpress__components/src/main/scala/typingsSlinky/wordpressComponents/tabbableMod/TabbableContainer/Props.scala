package typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  @JSName("children")
  var children_Props: ReactElement = js.native
  /**
    * A boolean which tells the component whether or not to cycle from the
    * end back to the beginning and vice versa.
    * @defaultValue true
    */
  var cycle: js.UndefOr[Boolean] = js.native
  /**
    * A callback invoked when the menu navigates to one of its children
    * passing the index and child as an argument.
    */
  var onNavigate: js.UndefOr[js.Function2[/* nextIndex */ Double, /* focusedElement */ HTMLElement, Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    @scala.inline
    def setOnNavigate(value: (/* nextIndex */ Double, /* focusedElement */ HTMLElement) => Unit): Self = this.set("onNavigate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNavigate: Self = this.set("onNavigate", js.undefined)
  }
  
}

