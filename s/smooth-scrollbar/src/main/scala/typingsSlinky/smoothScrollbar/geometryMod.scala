package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollbarSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  
  def update(scrollbar: Scrollbar): Unit = js.native
}
