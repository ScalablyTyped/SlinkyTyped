package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionChangingEvent extends js.Object {
  var changeType: AuditAction = js.native
  var newDefinition: BuildDefinition = js.native
  var originalDefinition: BuildDefinition = js.native
}

object BuildDefinitionChangingEvent {
  @scala.inline
  def apply(changeType: AuditAction, newDefinition: BuildDefinition, originalDefinition: BuildDefinition): BuildDefinitionChangingEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], newDefinition = newDefinition.asInstanceOf[js.Any], originalDefinition = originalDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangingEvent]
  }
  @scala.inline
  implicit class BuildDefinitionChangingEventOps[Self <: BuildDefinitionChangingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: AuditAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewDefinition(value: BuildDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalDefinition(value: BuildDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

