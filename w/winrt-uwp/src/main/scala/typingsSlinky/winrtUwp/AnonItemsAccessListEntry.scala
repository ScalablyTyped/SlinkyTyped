package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsAccessListEntry extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: AccessListEntry = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsAccessListEntry {
  @scala.inline
  def apply(items: AccessListEntry, returnValue: Double): AnonItemsAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsAccessListEntry]
  }
  @scala.inline
  implicit class AnonItemsAccessListEntryOps[Self <: AnonItemsAccessListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: AccessListEntry): Self = {
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

