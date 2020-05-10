package typingsSlinky.umbraco.umbraco.services

import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Show dialog args
  */
@js.native
trait IShowDialogArgs extends js.Object {
  var action: IShowDialogAction = js.native
  var scope: IScope = js.native
}

object IShowDialogArgs {
  @scala.inline
  def apply(action: IShowDialogAction, scope: IScope): IShowDialogArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogArgs]
  }
  @scala.inline
  implicit class IShowDialogArgsOps[Self <: IShowDialogArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: IShowDialogAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

