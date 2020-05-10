package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageIntermediary extends js.Object {
  var records: UsageRecordResource = js.native
  var triggers: UsageTriggerResource = js.native
}

object UsageIntermediary {
  @scala.inline
  def apply(records: UsageRecordResource, triggers: UsageTriggerResource): UsageIntermediary = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageIntermediary]
  }
  @scala.inline
  implicit class UsageIntermediaryOps[Self <: UsageIntermediary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: UsageRecordResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: UsageTriggerResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

