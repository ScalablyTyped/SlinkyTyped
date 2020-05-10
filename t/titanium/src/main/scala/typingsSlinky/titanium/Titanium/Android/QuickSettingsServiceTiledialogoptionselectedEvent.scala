package typingsSlinky.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An item from the signle choice menu has been selected.
		 */
@js.native
trait QuickSettingsServiceTiledialogoptionselectedEvent extends QuickSettingsServiceBaseEvent {
  /**
  			 * Index of the selected item from the single choice menu in the dialog.
  			 */
  var itemIndex: Double = js.native
}

object QuickSettingsServiceTiledialogoptionselectedEvent {
  @scala.inline
  def apply(itemIndex: Double, source: QuickSettingsService): QuickSettingsServiceTiledialogoptionselectedEvent = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceTiledialogoptionselectedEvent]
  }
  @scala.inline
  implicit class QuickSettingsServiceTiledialogoptionselectedEventOps[Self <: QuickSettingsServiceTiledialogoptionselectedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

