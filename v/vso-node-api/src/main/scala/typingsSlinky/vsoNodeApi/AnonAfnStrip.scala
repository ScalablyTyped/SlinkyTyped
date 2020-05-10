package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfnStrip extends js.Object {
  var afnStrip: Double = js.native
  var bugFilingData: Double = js.native
  var codeCoverage: Double = js.native
  var consoleLog: Double = js.native
  var generalAttachment: Double = js.native
  var intermediateCollectorData: Double = js.native
  var runConfig: Double = js.native
  var testImpactDetails: Double = js.native
  var tmiTestResultDetail: Double = js.native
  var tmiTestRunDeploymentFiles: Double = js.native
  var tmiTestRunReverseDeploymentFiles: Double = js.native
  var tmiTestRunSummary: Double = js.native
}

object AnonAfnStrip {
  @scala.inline
  def apply(
    afnStrip: Double,
    bugFilingData: Double,
    codeCoverage: Double,
    consoleLog: Double,
    generalAttachment: Double,
    intermediateCollectorData: Double,
    runConfig: Double,
    testImpactDetails: Double,
    tmiTestResultDetail: Double,
    tmiTestRunDeploymentFiles: Double,
    tmiTestRunReverseDeploymentFiles: Double,
    tmiTestRunSummary: Double
  ): AnonAfnStrip = {
    val __obj = js.Dynamic.literal(afnStrip = afnStrip.asInstanceOf[js.Any], bugFilingData = bugFilingData.asInstanceOf[js.Any], codeCoverage = codeCoverage.asInstanceOf[js.Any], consoleLog = consoleLog.asInstanceOf[js.Any], generalAttachment = generalAttachment.asInstanceOf[js.Any], intermediateCollectorData = intermediateCollectorData.asInstanceOf[js.Any], runConfig = runConfig.asInstanceOf[js.Any], testImpactDetails = testImpactDetails.asInstanceOf[js.Any], tmiTestResultDetail = tmiTestResultDetail.asInstanceOf[js.Any], tmiTestRunDeploymentFiles = tmiTestRunDeploymentFiles.asInstanceOf[js.Any], tmiTestRunReverseDeploymentFiles = tmiTestRunReverseDeploymentFiles.asInstanceOf[js.Any], tmiTestRunSummary = tmiTestRunSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfnStrip]
  }
  @scala.inline
  implicit class AnonAfnStripOps[Self <: AnonAfnStrip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfnStrip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afnStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBugFilingData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugFilingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeCoverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleLog(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneralAttachment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntermediateCollectorData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCollectorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunConfig(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestImpactDetails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testImpactDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestResultDetail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestResultDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunDeploymentFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunDeploymentFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunReverseDeploymentFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunReverseDeploymentFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunSummary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunSummary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

