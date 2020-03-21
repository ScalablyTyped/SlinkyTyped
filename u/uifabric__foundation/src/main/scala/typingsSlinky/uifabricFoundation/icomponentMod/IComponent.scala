package typingsSlinky.uifabricFoundation.icomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStateComponentType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends js.Object {
  var displayName: String
  var factoryOptions: IFactoryOptions[TComponentProps]
  var fields: js.Array[String]
  var slots: ISlotComponent[TComponentProps, TComponentSlots]
  var state: IStateComponentType[TComponentProps, TViewProps]
  var statics: TStatics
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
  var view: IViewComponent[TViewProps, TComponentSlots]
}

object IComponent {
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
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
}

