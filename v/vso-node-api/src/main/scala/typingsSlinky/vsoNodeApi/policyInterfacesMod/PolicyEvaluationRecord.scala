package typingsSlinky.vsoNodeApi.policyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEvaluationRecord extends js.Object {
  /**
    * Links to other related objects
    */
  var _links: js.Any = js.native
  /**
    * A string which uniquely identifies the target of a policy evaluation.
    */
  var artifactId: String = js.native
  /**
    * Time when this policy finished evaluating on this pull request.
    */
  var completedDate: js.Date = js.native
  /**
    * Contains all configuration data for the policy which is being evaluated.
    */
  var configuration: PolicyConfiguration = js.native
  /**
    * Internal context data of this policy evaluation.
    */
  var context: js.Any = js.native
  /**
    * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
    */
  var evaluationId: String = js.native
  /**
    * Time when this policy was first evaluated on this pull request.
    */
  var startedDate: js.Date = js.native
  /**
    * Status of the policy (Running, Approved, Failed, etc.)
    */
  var status: PolicyEvaluationStatus = js.native
}

object PolicyEvaluationRecord {
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: String,
    completedDate: js.Date,
    configuration: PolicyConfiguration,
    context: js.Any,
    evaluationId: String,
    startedDate: js.Date,
    status: PolicyEvaluationStatus
  ): PolicyEvaluationRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], evaluationId = evaluationId.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEvaluationRecord]
  }
  @scala.inline
  implicit class PolicyEvaluationRecordOps[Self <: PolicyEvaluationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: PolicyConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PolicyEvaluationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

