package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", "scrollIntoView")
  @js.native
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", "scrollIntoView")
  @js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = js.native
}
