package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestTrigger extends BuildTrigger {
  var branchFilters: js.Array[String] = js.native
  var forks: Forks = js.native
}

object PullRequestTrigger {
  @scala.inline
  def apply(branchFilters: js.Array[String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTrigger]
  }
  @scala.inline
  implicit class PullRequestTriggerOps[Self <: PullRequestTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks(value: Forks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

