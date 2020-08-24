package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.ReactPortal
import typingsSlinky.wordpressComponents.anon.Fill
import typingsSlinky.wordpressComponents.contextMod.SlotFillContext
import typingsSlinky.wordpressComponents.fillMod.Fill.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/slot-fill", JSImport.Namespace)
@js.native
object slotFillMod extends js.Object {
  val Consumer: ReactComponentClass[ConsumerProps[SlotFillContext]] = js.native
  val Provider: ReactComponentClass[js.Object] = js.native
  def createSlotFill(name: String): Fill = js.native
  @js.native
  object Fill extends js.Object {
    def apply(props: Props): ReactPortal = js.native
  }
  
  @js.native
  object Slot
    extends TopLevel[ReactComponentClass[typingsSlinky.wordpressComponents.slotMod.Slot.Props]]
  
}

