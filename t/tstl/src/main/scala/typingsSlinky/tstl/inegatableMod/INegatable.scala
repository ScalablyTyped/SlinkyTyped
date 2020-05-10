package typingsSlinky.tstl.inegatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INegatable[Ret] extends js.Object {
  def negate(): Ret = js.native
}

object INegatable {
  @scala.inline
  def apply[Ret](negate: () => Ret): INegatable[Ret] = {
    val __obj = js.Dynamic.literal(negate = js.Any.fromFunction0(negate))
    __obj.asInstanceOf[INegatable[Ret]]
  }
  @scala.inline
  implicit class INegatableOps[Self[ret] <: INegatable[ret], Ret] (val x: Self[Ret]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ret] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ret]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ret] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ret] with Other]
    @scala.inline
    def withNegate(value: () => Ret): Self[Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

