package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of signature help items, and the preferred item that should be selected.
  */
@js.native
trait SignatureHelpItems extends js.Object {
  var applicableSpan: TextSpan = js.native
  var argumentCount: Double = js.native
  var argumentIndex: Double = js.native
  var items: js.Array[SignatureHelpItem] = js.native
  var selectedItemIndex: Double = js.native
}

object SignatureHelpItems {
  @scala.inline
  def apply(
    applicableSpan: TextSpan,
    argumentCount: Double,
    argumentIndex: Double,
    items: js.Array[SignatureHelpItem],
    selectedItemIndex: Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan.asInstanceOf[js.Any], argumentCount = argumentCount.asInstanceOf[js.Any], argumentIndex = argumentIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItems]
  }
  @scala.inline
  implicit class SignatureHelpItemsOps[Self <: SignatureHelpItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicableSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgumentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgumentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SignatureHelpItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

