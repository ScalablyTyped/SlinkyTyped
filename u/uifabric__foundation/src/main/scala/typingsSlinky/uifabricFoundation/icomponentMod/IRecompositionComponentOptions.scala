package typingsSlinky.uifabricFoundation.icomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRecompositionComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
  extends typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
  
  /**
    * Slot definition object defining the slot component for each slot.
    */
  var slots: js.UndefOr[IPartialSlotComponent[TComponentProps, TComponentSlots]] = js.native
  
  /**
    * Stateless pure function that receives props to render the output of the component.
    */
  var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.native
}
object IRecompositionComponentOptions {
  
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](): IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
  
  @scala.inline
  implicit class IRecompositionComponentOptionsOps[Self <: IRecompositionComponentOptions[_, _, _, _, _, _], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self with (IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSlotsFunction1(value: TComponentProps => ISlotDefinition[TComponentSlots]): Self = this.set("slots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlots(value: IPartialSlotComponent[TComponentProps, TComponentSlots]): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setView(
      value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
    ): Self = this.set("view", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
