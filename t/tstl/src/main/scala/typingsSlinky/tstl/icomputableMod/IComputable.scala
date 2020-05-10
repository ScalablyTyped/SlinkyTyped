package typingsSlinky.tstl.icomputableMod

import typingsSlinky.tstl.inegatableMod.INegatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComputable[Param, Ret] extends INegatable[Ret] {
  def divides(`val`: Param): Ret = js.native
  def minus(`val`: Param): Ret = js.native
  def modules(`val`: Param): Ret = js.native
  def multiplies(`val`: Param): Ret = js.native
  def plus(`val`: Param): Ret = js.native
}

object IComputable {
  @scala.inline
  def apply[Param, Ret](
    divides: Param => Ret,
    minus: Param => Ret,
    modules: Param => Ret,
    multiplies: Param => Ret,
    negate: () => Ret,
    plus: Param => Ret
  ): IComputable[Param, Ret] = {
    val __obj = js.Dynamic.literal(divides = js.Any.fromFunction1(divides), minus = js.Any.fromFunction1(minus), modules = js.Any.fromFunction1(modules), multiplies = js.Any.fromFunction1(multiplies), negate = js.Any.fromFunction0(negate), plus = js.Any.fromFunction1(plus))
    __obj.asInstanceOf[IComputable[Param, Ret]]
  }
  @scala.inline
  implicit class IComputableOps[Self[param, ret] <: IComputable[param, ret], Param, Ret] (val x: Self[Param, Ret]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Param, Ret] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Param, Ret]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Param, Ret]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Param, Ret]) with Other]
    @scala.inline
    def withDivides(value: Param => Ret): Self[Param, Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divides")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinus(value: Param => Ret): Self[Param, Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModules(value: Param => Ret): Self[Param, Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiplies(value: Param => Ret): Self[Param, Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlus(value: Param => Ret): Self[Param, Ret] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

