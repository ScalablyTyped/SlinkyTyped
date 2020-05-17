package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOrder extends Compare {
  var field: js.Array[String | ExprRef | SignalRef] = js.native
  var order: js.UndefOr[js.Array[SortOrder]] = js.native
}

object FieldOrder {
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef]): FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
  @scala.inline
  implicit class FieldOrderOps[Self <: FieldOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: js.Array[String | ExprRef | SignalRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[SortOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

