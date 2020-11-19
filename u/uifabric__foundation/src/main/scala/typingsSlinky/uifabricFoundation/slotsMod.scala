package typingsSlinky.uifabricFoundation

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Attributes
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlot
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotFactory
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
@js.native
object slotsMod extends js.Object {
  
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  
  def withSlots[P](`type`: String, props: Attributes with P, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, props: Null, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ReactComponentClass[P], props: Attributes with P, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ReactComponentClass[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ReactComponentClass[P], props: Null, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Null, children: ReactElement*): ReturnType[ReactComponentClass[P]] = js.native
}
