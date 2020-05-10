package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedTrigger extends js.Object {
  /**
    * The default interval to wait between polls (only relevant when NotificationType is Polling).
    */
  var defaultPollingInterval: Double = js.native
  /**
    * How the trigger is notified of changes.
    */
  var notificationType: String = js.native
  /**
    * The capabilities supported by this trigger.
    */
  var supportedCapabilities: StringDictionary[SupportLevel] = js.native
  /**
    * The type of trigger.
    */
  var `type`: DefinitionTriggerType = js.native
}

object SupportedTrigger {
  @scala.inline
  def apply(
    defaultPollingInterval: Double,
    notificationType: String,
    supportedCapabilities: StringDictionary[SupportLevel],
    `type`: DefinitionTriggerType
  ): SupportedTrigger = {
    val __obj = js.Dynamic.literal(defaultPollingInterval = defaultPollingInterval.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], supportedCapabilities = supportedCapabilities.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedTrigger]
  }
  @scala.inline
  implicit class SupportedTriggerOps[Self <: SupportedTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedCapabilities(value: StringDictionary[SupportLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DefinitionTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

