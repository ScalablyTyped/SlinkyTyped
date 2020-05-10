package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.shortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEventListener extends js.Object {
  var tagName: String = js.native
  def addEventListener(): Unit = js.native
  def dispatchEvent(event: Event): Boolean = js.native
  def getAttribute(attr: String): String | Null = js.native
  def removeEventListener(): Boolean = js.native
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: () => Unit,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: () => Boolean,
    tagName: String
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddEventListener]
  }
  @scala.inline
  implicit class AnonAddEventListenerOps[Self <: AnonAddEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: Event => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttribute(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

