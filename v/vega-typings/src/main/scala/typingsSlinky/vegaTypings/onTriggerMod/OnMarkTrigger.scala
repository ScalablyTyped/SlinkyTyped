package typingsSlinky.vegaTypings.onTriggerMod

import typingsSlinky.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMarkTrigger extends js.Object {
  var modify: js.UndefOr[Expr] = js.native
  var trigger: Expr = js.native
  var values: js.UndefOr[Expr] = js.native
}

object OnMarkTrigger {
  @scala.inline
  def apply(trigger: Expr): OnMarkTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMarkTrigger]
  }
  @scala.inline
  implicit class OnMarkTriggerOps[Self <: OnMarkTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrigger(value: Expr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModify(value: Expr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Expr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

