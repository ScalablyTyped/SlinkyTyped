package typingsSlinky.semanticUiReactEventStack

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.semanticUiReactEventStack.typesMod.InputEventListener
import typingsSlinky.semanticUiReactEventStack.typesMod.InputTargetElement
import typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@semantic-ui-react/event-stack.@semantic-ui-react/event-stack/lib/types/EventStack.EventStackProps> */
@js.native
trait ReadonlyEventStackProps extends js.Object {
  val name: String = js.native
  val on: InputEventListener = js.native
  val pool: js.UndefOr[String] = js.native
  val target: js.UndefOr[InputTargetElement] = js.native
}

object ReadonlyEventStackProps {
  @scala.inline
  def apply(name: String, on: InputEventListener): ReadonlyEventStackProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEventStackProps]
  }
  @scala.inline
  implicit class ReadonlyEventStackPropsOps[Self <: ReadonlyEventStackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFunction1(value: /* evt */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: InputEventListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRefObject(value: ReactRef[TargetElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: InputTargetElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

