package typingsSlinky.yandexMaps

import typingsSlinky.yandexMaps.mod.IClassConstructor
import typingsSlinky.yandexMaps.mod.ISelectableControlLayout
import typingsSlinky.yandexMaps.yandexMapsStrings.auto
import typingsSlinky.yandexMaps.yandexMapsStrings.large
import typingsSlinky.yandexMaps.yandexMapsStrings.left
import typingsSlinky.yandexMaps.yandexMapsStrings.medium
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import typingsSlinky.yandexMaps.yandexMapsStrings.right
import typingsSlinky.yandexMaps.yandexMapsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  selectOnClick ? :boolean,   size ? :'auto' | 'small' | 'medium' | 'large'} */
@js.native
trait IBaseButtonParametersOpti extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[none | left | right] = js.native
  var floatIndex: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.native
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var position: js.UndefOr[AnonBottom] = js.native
  var selectOnClick: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[auto | small | medium | large] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object IBaseButtonParametersOpti {
  @scala.inline
  def apply(): IBaseButtonParametersOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonParametersOpti]
  }
  @scala.inline
  implicit class IBaseButtonParametersOptiOps[Self <: IBaseButtonParametersOpti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMapMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: none | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: IClassConstructor[ISelectableControlLayout] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: auto | small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

