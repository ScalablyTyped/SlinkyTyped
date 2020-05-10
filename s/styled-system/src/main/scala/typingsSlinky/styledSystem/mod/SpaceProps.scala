package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object SpaceProps {
  @scala.inline
  def apply[ThemeType, TVal](): SpaceProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class SpacePropsOps[Self[themetype, tval] <: SpaceProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withM(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(null)
        ret
    }
    @scala.inline
    def withMargin(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(null)
        ret
    }
    @scala.inline
    def withMarginBottom(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottomNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(null)
        ret
    }
    @scala.inline
    def withMarginLeft(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeftNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(null)
        ret
    }
    @scala.inline
    def withMarginRight(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRightNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(null)
        ret
    }
    @scala.inline
    def withMarginTop(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTopNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(null)
        ret
    }
    @scala.inline
    def withMarginX(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginX: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginXNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(null)
        ret
    }
    @scala.inline
    def withMarginY(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginY: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginYNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(null)
        ret
    }
    @scala.inline
    def withMb(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMb: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(js.undefined)
        ret
    }
    @scala.inline
    def withMbNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(null)
        ret
    }
    @scala.inline
    def withMl(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMl: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(js.undefined)
        ret
    }
    @scala.inline
    def withMlNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(null)
        ret
    }
    @scala.inline
    def withMr(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMr: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(js.undefined)
        ret
    }
    @scala.inline
    def withMrNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(null)
        ret
    }
    @scala.inline
    def withMt(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMt: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(js.undefined)
        ret
    }
    @scala.inline
    def withMtNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(null)
        ret
    }
    @scala.inline
    def withMx(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMx: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(js.undefined)
        ret
    }
    @scala.inline
    def withMxNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(null)
        ret
    }
    @scala.inline
    def withMy(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
    @scala.inline
    def withMyNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(null)
        ret
    }
    @scala.inline
    def withP(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withPNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(null)
        ret
    }
    @scala.inline
    def withPadding(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(null)
        ret
    }
    @scala.inline
    def withPaddingBottom(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottomNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(null)
        ret
    }
    @scala.inline
    def withPaddingLeft(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeftNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(null)
        ret
    }
    @scala.inline
    def withPaddingRight(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRight: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRightNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(null)
        ret
    }
    @scala.inline
    def withPaddingTop(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(null)
        ret
    }
    @scala.inline
    def withPaddingX(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingX: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingXNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(null)
        ret
    }
    @scala.inline
    def withPaddingY(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingY: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingYNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(null)
        ret
    }
    @scala.inline
    def withPb(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPb: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(js.undefined)
        ret
    }
    @scala.inline
    def withPbNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(null)
        ret
    }
    @scala.inline
    def withPl(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPl: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(js.undefined)
        ret
    }
    @scala.inline
    def withPlNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(null)
        ret
    }
    @scala.inline
    def withPr(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPr: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pr")(js.undefined)
        ret
    }
    @scala.inline
    def withPrNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pr")(null)
        ret
    }
    @scala.inline
    def withPt(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPt: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(js.undefined)
        ret
    }
    @scala.inline
    def withPtNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(null)
        ret
    }
    @scala.inline
    def withPx(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPx: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(js.undefined)
        ret
    }
    @scala.inline
    def withPxNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(null)
        ret
    }
    @scala.inline
    def withPy(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPy: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(js.undefined)
        ret
    }
    @scala.inline
    def withPyNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(null)
        ret
    }
  }
  
}

