package typingsSlinky.yadda.libMod

import typingsSlinky.yadda.contextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepFn extends js.Object {
  var ctx: Properties = js.native
  var step: String = js.native
}

object StepFn {
  @scala.inline
  def apply(ctx: Properties, step: String): StepFn = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepFn]
  }
  @scala.inline
  implicit class StepFnOps[Self <: StepFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtx(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

