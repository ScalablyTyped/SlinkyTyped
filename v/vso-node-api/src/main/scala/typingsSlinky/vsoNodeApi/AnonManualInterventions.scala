package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManualInterventions extends js.Object {
  var approvals: Double = js.native
  var artifacts: Double = js.native
  var environments: Double = js.native
  var manualInterventions: Double = js.native
  var none: Double = js.native
  var tags: Double = js.native
  var variables: Double = js.native
}

object AnonManualInterventions {
  @scala.inline
  def apply(
    approvals: Double,
    artifacts: Double,
    environments: Double,
    manualInterventions: Double,
    none: Double,
    tags: Double,
    variables: Double
  ): AnonManualInterventions = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManualInterventions]
  }
  @scala.inline
  implicit class AnonManualInterventionsOps[Self <: AnonManualInterventions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualInterventions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualInterventions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

