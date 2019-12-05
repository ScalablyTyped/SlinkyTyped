package typingsSlinky.smoothDashScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollbarSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  def update(scrollbar: Scrollbar): Unit = js.native
}

