package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.ReactPortal
import typingsSlinky.wordpressComponents.anon.Fill
import typingsSlinky.wordpressComponents.contextMod.SlotFillContext
import typingsSlinky.wordpressComponents.fillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillMod {
  
  @JSImport("@wordpress/components/slot-fill", "Consumer")
  @js.native
  val Consumer: ReactComponentClass[ConsumerProps[SlotFillContext]] = js.native
  
  object Fill {
    
    @JSImport("@wordpress/components/slot-fill", "Fill")
    @js.native
    def apply(props: Props): ReactPortal = js.native
  }
  
  @JSImport("@wordpress/components/slot-fill", "Provider")
  @js.native
  val Provider: ReactComponentClass[js.Object] = js.native
  
  object Slot extends Shortcut {
    
    @JSImport("@wordpress/components/slot-fill", "Slot")
    @js.native
    val ^ : ComponentType[typingsSlinky.wordpressComponents.slotMod.Slot.Props] = js.native
    
    type _To = ComponentType[typingsSlinky.wordpressComponents.slotMod.Slot.Props]
    
    /* This means you don't have to write `^`, but can instead just say `Slot.foo` */
    override def _to: ComponentType[typingsSlinky.wordpressComponents.slotMod.Slot.Props] = ^
  }
  
  @JSImport("@wordpress/components/slot-fill", "createSlotFill")
  @js.native
  def createSlotFill(name: String): Fill = js.native
}
