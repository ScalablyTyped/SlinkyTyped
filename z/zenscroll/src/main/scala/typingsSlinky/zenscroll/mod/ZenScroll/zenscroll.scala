package typingsSlinky.zenscroll.mod.ZenScroll

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait zenscroll extends js.Object {
  
  def center(elem: HTMLElement): Unit = js.native
  def center(
    elem: HTMLElement,
    duration: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onDone: js.Function0[Unit]
  ): Unit = js.native
  def center(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def center(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], offset: Double, onDone: js.Function0[Unit]): Unit = js.native
  def center(elem: HTMLElement, duration: Double): Unit = js.native
  def center(elem: HTMLElement, duration: Double, offset: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
  def center(elem: HTMLElement, duration: Double, offset: Double): Unit = js.native
  def center(elem: HTMLElement, duration: Double, offset: Double, onDone: js.Function0[Unit]): Unit = js.native
  
  def createScroller(scrollContainer: HTMLElement): zenscroll = js.native
  def createScroller(scrollContainer: HTMLElement, defaultDuration: js.UndefOr[scala.Nothing], edgeOffset: Double): zenscroll = js.native
  def createScroller(scrollContainer: HTMLElement, defaultDuration: Double): zenscroll = js.native
  def createScroller(scrollContainer: HTMLElement, defaultDuration: Double, edgeOffset: Double): zenscroll = js.native
  
  def getTopOf(elem: HTMLElement): Double = js.native
  
  def getY(): Double = js.native
  
  def intoView(elem: HTMLElement): Unit = js.native
  def intoView(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
  def intoView(elem: HTMLElement, duration: Double): Unit = js.native
  def intoView(elem: HTMLElement, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
  
  def moving(): Boolean = js.native
  
  def setup(): setupOption = js.native
  def setup(defaultDuration: js.UndefOr[scala.Nothing], edgeOffset: Double): setupOption = js.native
  def setup(defaultDuration: Double): setupOption = js.native
  def setup(defaultDuration: Double, edgeOffset: Double): setupOption = js.native
  
  def stop(): Unit = js.native
  
  def to(elem: HTMLElement): Unit = js.native
  def to(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
  def to(elem: HTMLElement, duration: Double): Unit = js.native
  def to(elem: HTMLElement, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
  
  def toY(targetY: Double): Unit = js.native
  def toY(targetY: Double, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
  def toY(targetY: Double, duration: Double): Unit = js.native
  def toY(targetY: Double, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
}
