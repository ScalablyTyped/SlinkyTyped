package typingsSlinky.systemjs.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Declare extends js.Object {
  var execute: js.UndefOr[js.Function0[_]] = js.native
  var setters: js.UndefOr[js.Array[SetterFn]] = js.native
}

object Declare {
  @scala.inline
  def apply(): Declare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declare]
  }
  @scala.inline
  implicit class DeclareOps[Self <: Declare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withSetters(value: js.Array[SetterFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setters")(js.undefined)
        ret
    }
  }
  
}

