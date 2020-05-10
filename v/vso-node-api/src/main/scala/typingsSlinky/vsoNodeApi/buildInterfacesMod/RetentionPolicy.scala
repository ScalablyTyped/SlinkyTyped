package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPolicy extends js.Object {
  var artifactTypesToDelete: js.Array[String] = js.native
  var artifacts: js.Array[String] = js.native
  var branches: js.Array[String] = js.native
  /**
    * The number of days to keep builds.
    */
  var daysToKeep: Double = js.native
  /**
    * Indicates whether the build record itself should be deleted.
    */
  var deleteBuildRecord: Boolean = js.native
  /**
    * Indicates whether to delete test results associated with the build.
    */
  var deleteTestResults: Boolean = js.native
  /**
    * The minimum number of builds to keep.
    */
  var minimumToKeep: Double = js.native
}

object RetentionPolicy {
  @scala.inline
  def apply(
    artifactTypesToDelete: js.Array[String],
    artifacts: js.Array[String],
    branches: js.Array[String],
    daysToKeep: Double,
    deleteBuildRecord: Boolean,
    deleteTestResults: Boolean,
    minimumToKeep: Double
  ): RetentionPolicy = {
    val __obj = js.Dynamic.literal(artifactTypesToDelete = artifactTypesToDelete.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], branches = branches.asInstanceOf[js.Any], daysToKeep = daysToKeep.asInstanceOf[js.Any], deleteBuildRecord = deleteBuildRecord.asInstanceOf[js.Any], deleteTestResults = deleteTestResults.asInstanceOf[js.Any], minimumToKeep = minimumToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
  @scala.inline
  implicit class RetentionPolicyOps[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactTypesToDelete(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTypesToDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteBuildRecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBuildRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTestResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTestResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumToKeep")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

