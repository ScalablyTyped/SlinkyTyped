package typingsSlinky.uifabricFoundation.libIcomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view  :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
@js.native
trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  var displayName: String = js.native
  var factoryOptions: IFactoryOptions[TComponentProps] = js.native
  var fields: js.Array[String] = js.native
  var state: IStateComponentType[TComponentProps, TViewProps] = js.native
  var statics: TStatics = js.native
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
  /**
    * Component that generates view output.
    */
  var view: IViewComponent[TViewProps] = js.native
}

object IComponent {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    state: TComponentProps => TViewProps,
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: /* props */ PropsWithChildren[TViewProps] => ReturnType[ReactComponentClass[js.Object]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
  @scala.inline
  implicit class IComponentOps[Self[tcomponentprops, ttokens, tstyleset, tviewprops, tstatics] <: IComponent[tcomponentprops, ttokens, tstyleset, tviewprops, tstatics], TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] (val x: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]) extends AnyVal {
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
    def withFactoryOptions(value: IFactoryOptions[TComponentProps]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TComponentProps => TViewProps): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatics(value: TStatics): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
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
    def withTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: /* props */ PropsWithChildren[TViewProps] => ReturnType[ReactComponentClass[js.Object]]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

