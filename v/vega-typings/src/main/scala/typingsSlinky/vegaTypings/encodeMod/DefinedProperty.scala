package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinedProperty extends js.Object {
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
}

object DefinedProperty {
  @scala.inline
  def apply(): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinedProperty]
  }
  @scala.inline
  implicit class DefinedPropertyOps[Self <: DefinedProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefined(value: ProductionRule[BooleanValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defined")(js.undefined)
        ret
    }
  }
  
}

