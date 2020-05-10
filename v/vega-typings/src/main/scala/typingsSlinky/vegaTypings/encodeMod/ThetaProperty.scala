package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThetaProperty extends js.Object {
  var theta: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object ThetaProperty {
  @scala.inline
  def apply(): ThetaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThetaProperty]
  }
  @scala.inline
  implicit class ThetaPropertyOps[Self <: ThetaProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheta(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(js.undefined)
        ret
    }
  }
  
}

