package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsCharacterGrouping extends js.Object {
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping = js.native
  /** The number of objects returned. */ var returnValue: Double = js.native
}

object AnonItemsCharacterGrouping {
  @scala.inline
  def apply(items: CharacterGrouping, returnValue: Double): AnonItemsCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsCharacterGrouping]
  }
  @scala.inline
  implicit class AnonItemsCharacterGroupingOps[Self <: AnonItemsCharacterGrouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: CharacterGrouping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

