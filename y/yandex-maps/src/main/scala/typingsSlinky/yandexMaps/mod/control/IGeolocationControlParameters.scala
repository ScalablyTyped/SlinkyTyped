package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.AnonImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocationControlParameters extends IButtonParameters {
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[AnonImage] = js.native
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.native
}

object IGeolocationControlParameters {
  @scala.inline
  def apply(): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
  @scala.inline
  implicit class IGeolocationControlParametersOps[Self <: IGeolocationControlParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonImage): Self = {
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
    def withOptions(value: IBaseButtonParametersOptions): Self = {
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
  }
  
}

