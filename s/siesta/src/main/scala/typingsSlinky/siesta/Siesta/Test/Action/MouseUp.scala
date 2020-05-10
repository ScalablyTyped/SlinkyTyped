package typingsSlinky.siesta.Siesta.Test.Action

import typingsSlinky.siesta.Siesta.Test.Action.Role.IHasTarget
import typingsSlinky.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait MouseUp
  extends IAction
     with IHasTarget {
  var options: js.UndefOr[js.Any] = js.native
}

object MouseUp {
  @scala.inline
  def apply(): MouseUp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseUp]
  }
  @scala.inline
  implicit class MouseUpOps[Self <: MouseUp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

