package typingsSlinky.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
@js.native
trait IAction extends js.Object {
  var desc: js.UndefOr[String] = js.native
}

object IAction {
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
  }
  
}

