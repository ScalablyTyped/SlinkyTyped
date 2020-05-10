package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase extends js.Object {
  /**
    * The condition that must be true for this phase to execute.
    */
  var condition: String = js.native
  var dependencies: js.Array[Dependency] = js.native
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope = js.native
  /**
    * The cancellation timeout, in minutes, for builds queued against this definition.
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  /**
    * The job execution timeout, in minutes, for builds queued against this definition.
    */
  var jobTimeoutInMinutes: Double = js.native
  /**
    * The name of the phase.
    */
  var name: String = js.native
  var steps: js.Array[BuildDefinitionStep] = js.native
  /**
    * The target (agent, server, etc.) for this phase.
    */
  var target: PhaseTarget = js.native
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}

object Phase {
  @scala.inline
  def apply(
    condition: String,
    dependencies: js.Array[Dependency],
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: Double,
    jobTimeoutInMinutes: Double,
    name: String,
    steps: js.Array[BuildDefinitionStep],
    target: PhaseTarget,
    variables: StringDictionary[BuildDefinitionVariable]
  ): Phase = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], jobAuthorizationScope = jobAuthorizationScope.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  @scala.inline
  implicit class PhaseOps[Self <: Phase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[Dependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobAuthorizationScope(value: BuildAuthorizationScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobAuthorizationScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobCancelTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCancelTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[BuildDefinitionStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: PhaseTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[BuildDefinitionVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

