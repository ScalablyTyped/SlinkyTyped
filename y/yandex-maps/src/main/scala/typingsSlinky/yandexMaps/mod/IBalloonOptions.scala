package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBalloonOptions extends js.Object {
  var autoPan: js.UndefOr[Boolean] = js.native
  var autoPanCheckZoomRange: js.UndefOr[Boolean] = js.native
  var autoPanDuration: js.UndefOr[Double] = js.native
  var autoPanMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var autoPanUseMapMargin: js.UndefOr[Boolean] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  var layout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[js.Array[Double]] = js.native
  var pane: js.UndefOr[String] = js.native
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  var panelMaxHeightRatio: js.UndefOr[Double] = js.native
  var panelMaxMapArea: js.UndefOr[Double] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  var shadowOffset: js.UndefOr[js.Array[Double]] = js.native
}

object IBalloonOptions {
  @scala.inline
  def apply(): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalloonOptions]
  }
  @scala.inline
  implicit class IBalloonOptionsOps[Self <: IBalloonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanCheckZoomRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanCheckZoomRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanCheckZoomRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanCheckZoomRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanUseMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanUseMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanUseMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanUseMapMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLayout(value: IClassConstructor[ILayout] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: IClassConstructor[ILayout] | String): Self = {
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
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
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
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelContentLayout(value: IClassConstructor[ILayout] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelMaxHeightRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelMaxHeightRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelMaxHeightRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelMaxHeightRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelMaxMapArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelMaxMapArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelMaxMapArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelMaxMapArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowLayout(value: IClassConstructor[ILayout] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
  }
  
}

