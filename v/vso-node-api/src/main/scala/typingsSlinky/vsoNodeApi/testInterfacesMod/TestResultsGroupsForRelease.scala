package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsGroupsForRelease extends js.Object {
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults] = js.native
  /**
    * Release Environment Id for which groupby result is fetched.
    */
  var releaseEnvId: Double = js.native
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: Double = js.native
}

object TestResultsGroupsForRelease {
  @scala.inline
  def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: Double, releaseId: Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], releaseEnvId = releaseEnvId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
  @scala.inline
  implicit class TestResultsGroupsForReleaseOps[Self <: TestResultsGroupsForRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[FieldDetailsForTestResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseEnvId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

