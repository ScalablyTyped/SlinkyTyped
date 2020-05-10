package typingsSlinky.uifabricFoundation.libIcomponentMod

import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyleableComponentProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
}

object IStyleableComponentProps {
  @scala.inline
  def apply[TViewProps, TTokens, TStyleSet](): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
  }
  @scala.inline
  implicit class IStyleableComponentPropsOps[Self[tviewprops, ttokens, tstyleset] <: IStyleableComponentProps[tviewprops, ttokens, tstyleset], TViewProps, TTokens, TStyleSet] (val x: Self[TViewProps, TTokens, TStyleSet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TViewProps, TTokens, TStyleSet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TViewProps, TTokens, TStyleSet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TViewProps, TTokens, TStyleSet]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TViewProps, TTokens, TStyleSet]) with Other]
    @scala.inline
    def withClassName(value: String): Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self[TViewProps, TTokens, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

