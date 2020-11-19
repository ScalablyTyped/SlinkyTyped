package typingsSlinky.smoothScrollbar.smoothScrollbarMod

import org.scalajs.dom.raw.Event
import typingsSlinky.smoothScrollbar.data2dMod.Data2d
import typingsSlinky.smoothScrollbar.smoothScrollbarScrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
class ScrollbarPlugin protected ()
  extends typingsSlinky.smoothScrollbar.pluginMod.ScrollbarPlugin {
  def this(scrollbar: Scrollbar) = this()
  def this(scrollbar: Scrollbar, options: js.Any) = this()
  
  def transformDelta(delta: Data2d, _evt: Event): Data2d = js.native
}
/* static members */
@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
object ScrollbarPlugin extends js.Object {
  
  var defaultOptions: js.Any = js.native
  
  var pluginName: String = js.native
}
