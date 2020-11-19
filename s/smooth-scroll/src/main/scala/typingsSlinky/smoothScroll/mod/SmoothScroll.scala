package typingsSlinky.smoothScroll.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmoothScroll extends js.Object {
  
  def animateScroll(): Unit = js.native
  def animateScroll(anchor: Double): Unit = js.native
  def animateScroll(anchor: Double, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def animateScroll(anchor: Double, toggle: Null, options: Options): Unit = js.native
  def animateScroll(anchor: Double, toggle: Element): Unit = js.native
  def animateScroll(anchor: Double, toggle: Element, options: Options): Unit = js.native
  def animateScroll(anchor: Null, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def animateScroll(anchor: Null, toggle: Null, options: Options): Unit = js.native
  def animateScroll(anchor: Null, toggle: Element): Unit = js.native
  def animateScroll(anchor: Null, toggle: Element, options: Options): Unit = js.native
  def animateScroll(anchor: Element): Unit = js.native
  def animateScroll(anchor: Element, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def animateScroll(anchor: Element, toggle: Null, options: Options): Unit = js.native
  def animateScroll(anchor: Element, toggle: Element): Unit = js.native
  def animateScroll(anchor: Element, toggle: Element, options: Options): Unit = js.native
  
  def cancelScroll(): Unit = js.native
  def cancelScroll(noEvent: Boolean): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def init(): Unit = js.native
  def init(options: Options): Unit = js.native
}
