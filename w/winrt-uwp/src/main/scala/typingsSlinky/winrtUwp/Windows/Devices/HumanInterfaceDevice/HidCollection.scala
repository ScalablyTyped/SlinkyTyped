package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves the collection information for a group of related controls. */
@js.native
trait HidCollection extends js.Object {
  /** Retrieves the identifier for a collection of HID controls. */
  var id: Double = js.native
  /** Retrieves the collection type. */
  var `type`: HidCollectionType = js.native
  /** Retrieves the usage identifier for the given control collection. */
  var usageId: Double = js.native
  /** Retrieves the usage page for the given control collection. */
  var usagePage: Double = js.native
}

object HidCollection {
  @scala.inline
  def apply(id: Double, `type`: HidCollectionType, usageId: Double, usagePage: Double): HidCollection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidCollection]
  }
  @scala.inline
  implicit class HidCollectionOps[Self <: HidCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: HidCollectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsagePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

