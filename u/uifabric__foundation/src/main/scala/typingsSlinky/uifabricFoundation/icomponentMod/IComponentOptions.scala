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
import scala.scalajs.js.annotation._

@js.native
trait IComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
  extends typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
  /**
    * Slot definition object defining the slot component for each slot.
    */
  var slots: js.UndefOr[ISlotComponent[TComponentProps, TComponentSlots]] = js.native
  /**
    * Stateless pure function that receives props to render the output of the component.
    */
  var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self[tcomponentprops, ttokens, tstyleset, tviewprops, tcomponentslots, tstatics] <: IComponentOptions[tcomponentprops, ttokens, tstyleset, tviewprops, tcomponentslots, tstatics], TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] (val x: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with Other]
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
    def withoutSlots: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
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
    @scala.inline
    def withoutView: Self[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

