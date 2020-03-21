package typingsSlinky.uifabricFoundation.icomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
  extends typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
  /**
    * Slot definition object defining the slot component for each slot.
    */
  var slots: js.UndefOr[ISlotComponent[TComponentProps, TComponentSlots]] = js.undefined
  /**
    * Stateless pure function that receives props to render the output of the component.
    */
  var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.undefined
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
    displayName: String = null,
    factoryOptions: IFactoryOptions[TComponentProps] = null,
    fields: js.Array[String] = null,
    slots: ISlotComponent[TComponentProps, TComponentSlots] = null,
    state: TComponentProps => TViewProps = null,
    statics: TStatics = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null,
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]] = null
  ): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (factoryOptions != null) __obj.updateDynamic("factoryOptions")(factoryOptions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(js.Any.fromFunction1(state))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction2(view))
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
}

