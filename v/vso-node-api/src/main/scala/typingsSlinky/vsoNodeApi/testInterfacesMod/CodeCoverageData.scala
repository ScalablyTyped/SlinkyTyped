package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCoverageData extends js.Object {
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: String = js.native
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: String = js.native
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics] = js.native
}

object CodeCoverageData {
  @scala.inline
  def apply(buildFlavor: String, buildPlatform: String, coverageStats: js.Array[CodeCoverageStatistics]): CodeCoverageData = {
    val __obj = js.Dynamic.literal(buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], coverageStats = coverageStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageData]
  }
  @scala.inline
  implicit class CodeCoverageDataOps[Self <: CodeCoverageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildFlavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildFlavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageStats(value: js.Array[CodeCoverageStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageStats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

