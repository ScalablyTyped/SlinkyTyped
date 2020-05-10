package typingsSlinky.uifabricFoundation.icomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStateComponentType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
@js.native
trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends js.Object {
  var displayName: String = js.native
  var factoryOptions: IFactoryOptions[TComponentProps] = js.native
  var fields: js.Array[String] = js.native
  var slots: ISlotComponent[TComponentProps, TComponentSlots] = js.native
  var state: IStateComponentType[TComponentProps, TViewProps] = js.native
  var statics: TStatics = js.native
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
  var view: IViewComponent[TViewProps, TComponentSlots] = js.native
}

object IComponent {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    slots: ISlotComponent[TComponentProps, TComponentSlots],
    state: TComponentProps => TViewProps,
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction2(view))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
  @scala.inline
  implicit class IComponentOps[Self[tcomponentprops, ttokens, tstyleset, tviewprops, tcomponentslots, tstatics] <: IComponent[tcomponentprops, ttokens, tstyleset, tviewprops, tcomponentslots, tstatics], TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] (val x: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with Other]
    @scala.inline
    def withDisplayName(value: String): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactoryOptions(value: IFactoryOptions[TComponentProps]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TComponentProps => TViewProps): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatics(value: TStatics): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(
      value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
    ): Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

