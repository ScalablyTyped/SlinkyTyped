package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.AnonAdjustMapMargin
import typingsSlinky.yandexMaps.AnonExpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[AnonAdjustMapMargin] = js.native
  var state: js.UndefOr[AnonExpanded] = js.native
}

object IRouteButtonParameters {
  @scala.inline
  def apply(): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteButtonParameters]
  }
  @scala.inline
  implicit class IRouteButtonParametersOps[Self <: IRouteButtonParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: AnonAdjustMapMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: AnonExpanded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

