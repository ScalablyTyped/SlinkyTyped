package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.anon.PartialScrollbarOptions
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/scrollbar", JSImport.Namespace)
@js.native
object smoothScrollbarScrollbarMod extends js.Object {
  
  val scrollbarMap: Map[HTMLElement, Scrollbar] = js.native
  
  @js.native
  class Scrollbar protected ()
    extends typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar {
    def this(containerEl: HTMLElement) = this()
    def this(containerEl: HTMLElement, options: PartialScrollbarOptions) = this()
    
    var _init: js.Any = js.native
    
    var _listeners: js.Any = js.native
    
    var _momentum: js.Any = js.native
    
    var _nextTick: js.Any = js.native
    
    var _observer: js.Any = js.native
    
    var _plugins: js.Any = js.native
    
    var _render: js.Any = js.native
    
    var _renderID: js.Any = js.native
    
    var _shouldPropagateMomentum: js.Any = js.native
    
    var _updateDebounced: js.Any = js.native
  }
}
