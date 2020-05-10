package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRepoTrigger extends ReleaseTriggerBase {
  var alias: String = js.native
  var branchFilters: js.Array[String] = js.native
}

object SourceRepoTrigger {
  @scala.inline
  def apply(alias: String, branchFilters: js.Array[String], triggerType: ReleaseTriggerType): SourceRepoTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], branchFilters = branchFilters.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepoTrigger]
  }
  @scala.inline
  implicit class SourceRepoTriggerOps[Self <: SourceRepoTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

