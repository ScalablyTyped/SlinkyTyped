package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeAction. */
@js.native
trait DialogNodeAction extends js.Object {
  /** The type of action to invoke. */
  var action_type: js.UndefOr[String] = js.native
  /** The name of the context variable that the client application will use to pass in credentials for the action. */
  var credentials: js.UndefOr[String] = js.native
  /** The name of the action. */
  var name: String = js.native
  /** A map of key/value pairs to be provided to the action. */
  var parameters: js.UndefOr[js.Object] = js.native
  /** The location in the dialog context where the result of the action is stored. */
  var result_variable: String = js.native
}

object DialogNodeAction {
  @scala.inline
  def apply(name: String, result_variable: String): DialogNodeAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result_variable = result_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeAction]
  }
  @scala.inline
  implicit class DialogNodeActionOps[Self <: DialogNodeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult_variable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

