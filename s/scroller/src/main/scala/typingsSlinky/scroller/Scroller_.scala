package typingsSlinky.scroller

import typingsSlinky.scroller.anon.Left
import typingsSlinky.scroller.anon.PageX
import typingsSlinky.scroller.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller_ extends js.Object {
  
  def activatePullToRefresh(
    height: Double,
    activate: js.Function0[Unit],
    deactivate: js.Function0[Unit],
    start: js.Function0[Unit]
  ): Unit = js.native
  
  def doMouseZoom(wheelData: Double, timeStamp: Double, pageX: Double, pageY: Double): Unit = js.native
  
  def doTouchEnd(timeStamp: Double): Unit = js.native
  
  def doTouchMove(touches: js.Array[PageX], timeStamp: Double): Unit = js.native
  def doTouchMove(touches: js.Array[PageX], timeStamp: Double, scale: Double): Unit = js.native
  
  def doTouchStart(touches: js.Array[PageX], timeStamp: Double): Unit = js.native
  
  def finishPullToRefresh(): Unit = js.native
  
  def getScrollMax(): Top = js.native
  
  def getValues(): Left = js.native
  
  def scrollBy(leftOffset: Double, topOffset: Double): Unit = js.native
  def scrollBy(leftOffset: Double, topOffset: Double, animate: Boolean): Unit = js.native
  
  def scrollTo(left: Double, top: Double): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: js.UndefOr[scala.Nothing], zoom: Double): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean, zoom: Double): Unit = js.native
  
  def setDimensions(clientWidth: Double, clientHeight: Double, contentWidth: Double, contentHeight: Double): Unit = js.native
  
  def setPosition(clientLeft: Double, clientTop: Double): Unit = js.native
  
  def setSnapSize(width: Double, height: Double): Unit = js.native
  
  def zoomBy(factor: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double
  ): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: js.UndefOr[scala.Nothing], originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  def zoomTo(level: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double
  ): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: js.UndefOr[scala.Nothing], originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
