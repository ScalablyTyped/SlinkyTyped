package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoObjectOptions extends ICircleOptions {
  var iconCaptionMaxWidth: js.UndefOr[Double] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconContentOffset: js.UndefOr[js.Array[Double]] = js.native
  var iconContentPadding: js.UndefOr[js.Array[Double]] = js.native
  var iconContentSize: js.UndefOr[js.Array[Double]] = js.native
  var iconImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var iconImageHref: js.UndefOr[String] = js.native
  var iconImageOffset: js.UndefOr[js.Array[Double]] = js.native
  var iconImageShape: js.UndefOr[IShape | Null] = js.native
  var iconImageSize: js.UndefOr[js.Array[Double]] = js.native
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconMaxHeight: js.UndefOr[Double] = js.native
  var iconMaxWidth: js.UndefOr[Double] = js.native
  var iconOffset: js.UndefOr[js.Array[Double]] = js.native
  var iconShadow: js.UndefOr[Boolean] = js.native
  var iconShadowImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var iconShadowImageHref: js.UndefOr[String] = js.native
  var iconShadowImageOffset: js.UndefOr[js.Array[Double]] = js.native
  var iconShadowImageSize: js.UndefOr[js.Array[Double]] = js.native
  var iconShadowLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconShadowOffset: js.UndefOr[js.Array[Double]] = js.native
  var lineStringOverlay: js.UndefOr[OverlayKey] = js.native
  var pointOverlay: js.UndefOr[OverlayKey] = js.native
  var polygonOverlay: js.UndefOr[OverlayKey] = js.native
  var preset: js.UndefOr[String] = js.native
  var rectangleOverlay: js.UndefOr[OverlayKey] = js.native
  var setMapCursorInDragging: js.UndefOr[Boolean] = js.native
}

object IGeoObjectOptions {
  @scala.inline
  def apply(): IGeoObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectOptions]
  }
  @scala.inline
  implicit class IGeoObjectOptionsOps[Self <: IGeoObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconCaptionMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCaptionMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCaptionMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCaptionMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContentLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContentOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContentOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContentPadding(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContentPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContentSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconImageClipRect(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageClipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconImageClipRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageClipRect")(js.undefined)
        ret
    }
    @scala.inline
    def withIconImageHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconImageHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageHref")(js.undefined)
        ret
    }
    @scala.inline
    def withIconImageOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIconImageShape(value: IShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconImageShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageShape")(js.undefined)
        ret
    }
    @scala.inline
    def withIconImageShapeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageShape")(null)
        ret
    }
    @scala.inline
    def withIconImageSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconImageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIconMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIconOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowImageClipRect(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageClipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowImageClipRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageClipRect")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowImageHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowImageHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageHref")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowImageOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowImageSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowImageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShadowOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStringOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStringOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLineStringOverlay(value: OverlayKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStringOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStringOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStringOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPointOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPointOverlay(value: OverlayKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPolygonOverlay(value: OverlayKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangleOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRectangleOverlay(value: OverlayKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangleOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMapCursorInDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapCursorInDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetMapCursorInDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapCursorInDragging")(js.undefined)
        ret
    }
  }
  
}

