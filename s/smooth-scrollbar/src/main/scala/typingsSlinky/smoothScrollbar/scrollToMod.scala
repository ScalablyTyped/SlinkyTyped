package typingsSlinky.smoothScrollbar

import typingsSlinky.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/scrolling/scroll-to", JSImport.Namespace)
@js.native
object scrollToMod extends js.Object {
  
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
}
