package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typingsSlinky.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollStatus
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingMod {
  
  @JSImport("smooth-scrollbar/scrolling", "scrollIntoView")
  @js.native
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollIntoView")
  @js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = js.native
  
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  
  @JSImport("smooth-scrollbar/scrolling", "setPosition")
  @js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}
