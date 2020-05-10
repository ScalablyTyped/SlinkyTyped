package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultRetentionSettings extends js.Object {
  var automatedResultsRetentionDuration: Double = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: js.Date = js.native
  var manualResultsRetentionDuration: Double = js.native
}

object ResultRetentionSettings {
  @scala.inline
  def apply(
    automatedResultsRetentionDuration: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    manualResultsRetentionDuration: Double
  ): ResultRetentionSettings = {
    val __obj = js.Dynamic.literal(automatedResultsRetentionDuration = automatedResultsRetentionDuration.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], manualResultsRetentionDuration = manualResultsRetentionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRetentionSettings]
  }
  @scala.inline
  implicit class ResultRetentionSettingsOps[Self <: ResultRetentionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedResultsRetentionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedResultsRetentionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualResultsRetentionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualResultsRetentionDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

