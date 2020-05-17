package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.Expanded
import typingsSlinky.yandexMaps.anon.IBaseButtonParametersOptiAdjustMapMargin
import typingsSlinky.yandexMaps.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[Title] = js.native
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.native
  var state: js.UndefOr[Expanded] = js.native
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
  @scala.inline
  implicit class IFullscreenControlParametersOps[Self <: IFullscreenControlParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: IBaseButtonParametersOptiAdjustMapMargin): Self = {
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
    def withState(value: Expanded): Self = {
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

