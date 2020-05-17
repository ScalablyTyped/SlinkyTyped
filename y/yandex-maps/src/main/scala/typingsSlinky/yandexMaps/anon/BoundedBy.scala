package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.mod.IClassConstructor
import typingsSlinky.yandexMaps.mod.IGeocodeProvider
import typingsSlinky.yandexMaps.mod.ILayout
import typingsSlinky.yandexMaps.mod.ISearchControlLayout
import typingsSlinky.yandexMaps.yandexMapsStrings.auto
import typingsSlinky.yandexMaps.yandexMapsStrings.district
import typingsSlinky.yandexMaps.yandexMapsStrings.house
import typingsSlinky.yandexMaps.yandexMapsStrings.large
import typingsSlinky.yandexMaps.yandexMapsStrings.latlong
import typingsSlinky.yandexMaps.yandexMapsStrings.left
import typingsSlinky.yandexMaps.yandexMapsStrings.locality
import typingsSlinky.yandexMaps.yandexMapsStrings.longlat
import typingsSlinky.yandexMaps.yandexMapsStrings.medium
import typingsSlinky.yandexMaps.yandexMapsStrings.metro
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import typingsSlinky.yandexMaps.yandexMapsStrings.right
import typingsSlinky.yandexMaps.yandexMapsStrings.small
import typingsSlinky.yandexMaps.yandexMapsStrings.street
import typingsSlinky.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import typingsSlinky.yandexMaps.yandexMapsStrings.yandexNumbersignsearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundedBy extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var fitMaxWidth: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[none | left | right] = js.native
  var floatIndex: js.UndefOr[Double] = js.native
  var formLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var kind: js.UndefOr[house | street | metro | district | locality] = js.native
  var layout: js.UndefOr[String | IClassConstructor[ISearchControlLayout]] = js.native
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var noCentering: js.UndefOr[Boolean] = js.native
  var noPlacemark: js.UndefOr[Boolean] = js.native
  var noPopup: js.UndefOr[Boolean] = js.native
  var noSelect: js.UndefOr[Boolean] = js.native
  var noSuggestPanel: js.UndefOr[Boolean] = js.native
  var placeholderContent: js.UndefOr[String] = js.native
  var popupItemLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var popupLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var position: js.UndefOr[Bottom] = js.native
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch] = js.native
  var searchCoordOrder: js.UndefOr[latlong | longlat] = js.native
  var size: js.UndefOr[auto | small | medium | large] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
  var suppressYandexSearch: js.UndefOr[Boolean] = js.native
  var useMapBounds: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[Double] = js.native
}

object BoundedBy {
  @scala.inline
  def apply(): BoundedBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundedBy]
  }
  @scala.inline
  implicit class BoundedByOps[Self <: BoundedBy] (val x: Self) extends AnyVal {
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
    def withBoundedBy(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFitMaxWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitMaxWidth")(js.undefined)
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
    def withFormLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: house | street | metro | district | locality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String | IClassConstructor[ISearchControlLayout]): Self = {
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
    def withNoCentering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCentering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCentering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCentering")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPlacemark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlacemark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPlacemark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlacemark")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSuggestPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSuggestPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupItemLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupItemLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupItemLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupItemLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Bottom): Self = {
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
    def withProvider(value: IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchCoordOrder(value: latlong | longlat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCoordOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchCoordOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCoordOrder")(js.undefined)
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
    def withStrictBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressYandexSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressYandexSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressYandexSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressYandexSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapBounds")(js.undefined)
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
    @scala.inline
    def withZoomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(js.undefined)
        ret
    }
  }
  
}

