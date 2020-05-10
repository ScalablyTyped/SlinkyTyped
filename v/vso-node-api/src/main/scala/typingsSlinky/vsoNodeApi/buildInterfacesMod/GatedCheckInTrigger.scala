package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatedCheckInTrigger extends BuildTrigger {
  var pathFilters: js.Array[String] = js.native
  /**
    * Indicates whether CI triggers should run after the gated check-in succeeds.
    */
  var runContinuousIntegration: Boolean = js.native
  /**
    * Indicates whether to take workspace mappings into account when determining whether a build should run.
    */
  var useWorkspaceMappings: Boolean = js.native
}

object GatedCheckInTrigger {
  @scala.inline
  def apply(
    pathFilters: js.Array[String],
    runContinuousIntegration: Boolean,
    triggerType: DefinitionTriggerType,
    useWorkspaceMappings: Boolean
  ): GatedCheckInTrigger = {
    val __obj = js.Dynamic.literal(pathFilters = pathFilters.asInstanceOf[js.Any], runContinuousIntegration = runContinuousIntegration.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any], useWorkspaceMappings = useWorkspaceMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatedCheckInTrigger]
  }
  @scala.inline
  implicit class GatedCheckInTriggerOps[Self <: GatedCheckInTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunContinuousIntegration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runContinuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseWorkspaceMappings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorkspaceMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

