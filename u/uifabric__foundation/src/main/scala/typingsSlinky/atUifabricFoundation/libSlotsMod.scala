package typingsSlinky.atUifabricFoundation

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.atUifabricFoundation.libIComponentMod.IFactoryOptions
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlot
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotFactory
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlots
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlottableProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidShorthand
import typingsSlinky.react.reactMod.Attributes
import typingsSlinky.react.reactMod.FunctionComponent
import typingsSlinky.react.reactMod.ReactNode
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
@js.native
object libSlotsMod extends js.Object {
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def withSlots[P](`type`: String): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
}

