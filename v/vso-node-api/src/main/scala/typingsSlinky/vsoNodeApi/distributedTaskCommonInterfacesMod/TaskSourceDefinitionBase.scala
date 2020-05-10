package typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSourceDefinitionBase extends js.Object {
  var authKey: String = js.native
  var endpoint: String = js.native
  var keySelector: String = js.native
  var selector: String = js.native
  var target: String = js.native
}

object TaskSourceDefinitionBase {
  @scala.inline
  def apply(authKey: String, endpoint: String, keySelector: String, selector: String, target: String): TaskSourceDefinitionBase = {
    val __obj = js.Dynamic.literal(authKey = authKey.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSourceDefinitionBase]
  }
  @scala.inline
  implicit class TaskSourceDefinitionBaseOps[Self <: TaskSourceDefinitionBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

