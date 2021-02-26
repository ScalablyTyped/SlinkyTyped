package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollbarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("smooth-scrollbar/geometry", "getSize")
  @js.native
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  
  @JSImport("smooth-scrollbar/geometry", "isVisible")
  @js.native
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  
  @JSImport("smooth-scrollbar/geometry", "update")
  @js.native
  def update(scrollbar: Scrollbar): Unit = js.native
}
