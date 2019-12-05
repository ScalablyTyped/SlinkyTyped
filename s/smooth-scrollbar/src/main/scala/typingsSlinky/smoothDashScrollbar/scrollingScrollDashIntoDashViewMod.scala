package typingsSlinky.smoothDashScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollIntoViewOptions
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/scroll-into-view", JSImport.Namespace)
@js.native
object scrollingScrollDashIntoDashViewMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
}

