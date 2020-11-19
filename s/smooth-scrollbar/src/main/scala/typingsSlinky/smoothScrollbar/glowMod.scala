package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.smoothScrollbar.anon.X
import typingsSlinky.smoothScrollbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/plugins/overscroll/glow", JSImport.Namespace)
@js.native
object glowMod extends js.Object {
  
  @js.native
  class Glow protected () extends js.Object {
    def this(_scrollbar: default) = this()
    
    var _canvas: js.Any = js.native
    
    var _ctx: js.Any = js.native
    
    var _getMaxOverscroll: js.Any = js.native
    
    var _renderX: js.Any = js.native
    
    var _renderY: js.Any = js.native
    
    var _scrollbar: js.Any = js.native
    
    var _touchX: js.Any = js.native
    
    var _touchY: js.Any = js.native
    
    def adjust(): Unit = js.native
    
    def mount(): Unit = js.native
    
    def recordTouch(event: TouchEvent): Unit = js.native
    
    def render(hasXY: X, color: String): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}
