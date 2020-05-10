package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsGroupsForBuild extends js.Object {
  /**
    * BuildId for which groupby result is fetched.
    */
  var buildId: Double = js.native
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults] = js.native
}

object TestResultsGroupsForBuild {
  @scala.inline
  def apply(buildId: Double, fields: js.Array[FieldDetailsForTestResults]): TestResultsGroupsForBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForBuild]
  }
  @scala.inline
  implicit class TestResultsGroupsForBuildOps[Self <: TestResultsGroupsForBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[FieldDetailsForTestResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

