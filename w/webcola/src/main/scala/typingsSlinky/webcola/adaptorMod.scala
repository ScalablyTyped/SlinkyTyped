package typingsSlinky.webcola

import typingsSlinky.webcola.layoutMod.EventType
import typingsSlinky.webcola.layoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptorMod {
  
  @JSImport("webcola/dist/src/adaptor", "LayoutAdaptor")
  @js.native
  class LayoutAdaptor protected () extends Layout {
    def this(options: js.Any) = this()
    
    def drag(): Unit = js.native
    
    def dragEnd(d: js.Any): Unit = js.native
    
    def dragStart(d: js.Any): Unit = js.native
    
    def dragend(d: js.Any): Unit = js.native
    
    def dragstart(d: js.Any): Unit = js.native
    
    def on(eventType: String, listener: js.Function0[Unit]): this.type = js.native
    def on(eventType: EventType, listener: js.Function0[Unit]): this.type = js.native
  }
  
  @JSImport("webcola/dist/src/adaptor", "adaptor")
  @js.native
  def adaptor(options: js.Any): LayoutAdaptor = js.native
}
