package typingsSlinky.wonderJs.domEventRegisterMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonderJs.entityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomEventRegisterData extends js.Object {
  var dom: js.UndefOr[HTMLElement] = js.native
  var domHandler: js.Function = js.native
  var eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any = js.native
  var handler: js.Function = js.native
  var originHandler: js.Function = js.native
  var priority: Double = js.native
  var target: js.UndefOr[EntityObject] = js.native
}

object DomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
    handler: js.Function,
    originHandler: js.Function,
    priority: Double
  ): DomEventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], eventData = eventData.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventRegisterData]
  }
  @scala.inline
  implicit class DomEventRegisterDataOps[Self <: DomEventRegisterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDom(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EntityObject): Self = {
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

