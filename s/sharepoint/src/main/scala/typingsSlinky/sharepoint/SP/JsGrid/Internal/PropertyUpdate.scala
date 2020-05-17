package typingsSlinky.sharepoint.SP.JsGrid.Internal

import typingsSlinky.sharepoint.SP.JsGrid.IValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyUpdate extends IValue {
  @JSName("localized")
  var localized_PropertyUpdate: String = js.native
}

object PropertyUpdate {
  @scala.inline
  def apply(localized: String): PropertyUpdate = {
    val __obj = js.Dynamic.literal(localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdate]
  }
  @scala.inline
  implicit class PropertyUpdateOps[Self <: PropertyUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

