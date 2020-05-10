package typingsSlinky.wonderJs.domEventListenerMapMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomEventOffData extends js.Object {
  var dom: HTMLElement = js.native
  var domHandler: js.Function = js.native
  var eventName: EEventName = js.native
}

object DomEventOffData {
  @scala.inline
  def apply(dom: HTMLElement, domHandler: js.Function, eventName: EEventName): DomEventOffData = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], domHandler = domHandler.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventOffData]
  }
  @scala.inline
  implicit class DomEventOffDataOps[Self <: DomEventOffData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventName(value: EEventName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

