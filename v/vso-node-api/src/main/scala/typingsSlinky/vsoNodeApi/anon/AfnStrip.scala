package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfnStrip extends js.Object {
  var afnStrip: scala.Double = js.native
  var bugFilingData: scala.Double = js.native
  var codeCoverage: scala.Double = js.native
  var consoleLog: scala.Double = js.native
  var generalAttachment: scala.Double = js.native
  var intermediateCollectorData: scala.Double = js.native
  var runConfig: scala.Double = js.native
  var testImpactDetails: scala.Double = js.native
  var tmiTestResultDetail: scala.Double = js.native
  var tmiTestRunDeploymentFiles: scala.Double = js.native
  var tmiTestRunReverseDeploymentFiles: scala.Double = js.native
  var tmiTestRunSummary: scala.Double = js.native
}

object AfnStrip {
  @scala.inline
  def apply(
    afnStrip: scala.Double,
    bugFilingData: scala.Double,
    codeCoverage: scala.Double,
    consoleLog: scala.Double,
    generalAttachment: scala.Double,
    intermediateCollectorData: scala.Double,
    runConfig: scala.Double,
    testImpactDetails: scala.Double,
    tmiTestResultDetail: scala.Double,
    tmiTestRunDeploymentFiles: scala.Double,
    tmiTestRunReverseDeploymentFiles: scala.Double,
    tmiTestRunSummary: scala.Double
  ): AfnStrip = {
    val __obj = js.Dynamic.literal(afnStrip = afnStrip.asInstanceOf[js.Any], bugFilingData = bugFilingData.asInstanceOf[js.Any], codeCoverage = codeCoverage.asInstanceOf[js.Any], consoleLog = consoleLog.asInstanceOf[js.Any], generalAttachment = generalAttachment.asInstanceOf[js.Any], intermediateCollectorData = intermediateCollectorData.asInstanceOf[js.Any], runConfig = runConfig.asInstanceOf[js.Any], testImpactDetails = testImpactDetails.asInstanceOf[js.Any], tmiTestResultDetail = tmiTestResultDetail.asInstanceOf[js.Any], tmiTestRunDeploymentFiles = tmiTestRunDeploymentFiles.asInstanceOf[js.Any], tmiTestRunReverseDeploymentFiles = tmiTestRunReverseDeploymentFiles.asInstanceOf[js.Any], tmiTestRunSummary = tmiTestRunSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfnStrip]
  }
  @scala.inline
  implicit class AfnStripOps[Self <: AfnStrip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfnStrip(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afnStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBugFilingData(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugFilingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeCoverage(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleLog(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneralAttachment(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntermediateCollectorData(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCollectorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunConfig(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestImpactDetails(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testImpactDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestResultDetail(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestResultDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunDeploymentFiles(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunDeploymentFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunReverseDeploymentFiles(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunReverseDeploymentFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmiTestRunSummary(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmiTestRunSummary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

