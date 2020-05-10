package typingsSlinky.wonderJs.customEventRegisterMod

import typingsSlinky.wonderJs.entityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventRegisterData extends js.Object {
  var domHandler: js.Function = js.native
  var handler: js.Function = js.native
  var originHandler: js.Function = js.native
  var priority: Double = js.native
  var target: EntityObject = js.native
}

object CustomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    handler: js.Function,
    originHandler: js.Function,
    priority: Double,
    target: EntityObject
  ): CustomEventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEventRegisterData]
  }
  @scala.inline
  implicit class CustomEventRegisterDataOps[Self <: CustomEventRegisterData] (val x: Self) extends AnyVal {
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
    def withTarget(value: EntityObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

