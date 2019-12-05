package typingsSlinky.smoothDashScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollIntoViewOptions
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollStatus
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollToOptions
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling", JSImport.Namespace)
@js.native
object scrollingMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: Partial[ScrollToOptions]
  ): Unit = js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

