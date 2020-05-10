package typingsSlinky.uifabricFoundation.libIcomponentMod

import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponentOptions[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  /**
    * Display name to identify component in React hierarchy. This parameter is required for targeted component styling
    * via theming.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Default prop for which to map primitive values.
    */
  var factoryOptions: js.UndefOr[IFactoryOptions[TComponentProps]] = js.native
  /**
    * List of fields which can be customized.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional state component that processes TComponentProps into TViewProps.
    */
  var state: js.UndefOr[IStateComponentType[TComponentProps, TViewProps]] = js.native
  /**
    * Optional static object to assign to constructed component.
    */
  var statics: js.UndefOr[TStatics] = js.native
  /**
    * Styles prop to pass into component.
    */
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
  /**
    * Tokens prop to pass into component.
    */
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self[tcomponentprops, ttokens, tstyleset, tviewprops, tstatics] <: IComponentOptions[tcomponentprops, ttokens, tstyleset, tviewprops, tstatics], TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] (val x: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]) with Other]
    @scala.inline
    def withDisplayName(value: String): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFactoryOptions(value: IFactoryOptions[TComponentProps]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactoryOptions: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: TComponentProps => TViewProps): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutState: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatics(value: TStatics): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatics: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

