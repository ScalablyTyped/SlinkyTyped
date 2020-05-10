package typingsSlinky.tooltipster.JQueryTooltipster

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipEvent extends js.Object {
  var event: JQueryEventObject = js.native
  var instance: ITooltipsterInstance = js.native
  var origin: HTMLElement = js.native
}

object ITooltipEvent {
  @scala.inline
  def apply(event: JQueryEventObject, instance: ITooltipsterInstance, origin: HTMLElement): ITooltipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipEvent]
  }
  @scala.inline
  implicit class ITooltipEventOps[Self <: ITooltipEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: JQueryEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: ITooltipsterInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

