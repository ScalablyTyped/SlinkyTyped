package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISystemTrigger extends IBackgroundTrigger {
  var oneShot: Boolean = js.native
  var triggerType: SystemTriggerType = js.native
}

object ISystemTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): ISystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemTrigger]
  }
  @scala.inline
  implicit class ISystemTriggerOps[Self <: ISystemTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOneShot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneShot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerType(value: SystemTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

