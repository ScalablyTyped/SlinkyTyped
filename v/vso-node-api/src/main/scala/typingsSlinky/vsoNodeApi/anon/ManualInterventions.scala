package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualInterventions extends js.Object {
  var approvals: scala.Double = js.native
  var artifacts: scala.Double = js.native
  var environments: scala.Double = js.native
  var manualInterventions: scala.Double = js.native
  var none: scala.Double = js.native
  var tags: scala.Double = js.native
  var variables: scala.Double = js.native
}

object ManualInterventions {
  @scala.inline
  def apply(
    approvals: scala.Double,
    artifacts: scala.Double,
    environments: scala.Double,
    manualInterventions: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    variables: scala.Double
  ): ManualInterventions = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventions]
  }
  @scala.inline
  implicit class ManualInterventionsOps[Self <: ManualInterventions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovals(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualInterventions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualInterventions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

