package typingsSlinky.signaturePad.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.signaturePad.anon.Callback
import typingsSlinky.signaturePad.anon.Color
import typingsSlinky.signaturePad.anon.Curve
import typingsSlinky.signaturePad.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaturePad extends js.Object {
  
  def _addPoint(point: Point): Bezier | Null = js.native
  
  def _calculateCurveWidths(startPoint: Point, endPoint: Point): End = js.native
  
  def _createPoint(x: Double, y: Double): Point = js.native
  
  var _ctx: CanvasRenderingContext2D = js.native
  
  var _data: js.Array[Color] = js.native
  
  def _drawCurve(_a: Curve): Unit = js.native
  
  def _drawCurveSegment(x: Double, y: Double, width: Double): Unit = js.native
  
  def _drawDot(_a: typingsSlinky.signaturePad.anon.Point): Unit = js.native
  
  def _fromData(
    pointGroups: js.Array[js.Array[Point]],
    drawCurve: js.Function1[/* _a */ Curve, Unit],
    drawDot: js.Function1[/* _a */ typingsSlinky.signaturePad.anon.Point, Unit]
  ): Unit = js.native
  
  /**
    * Privates
    */
  def _handleMouseDown(event: MouseEvent): Unit = js.native
  
  def _handleMouseEvents(event: MouseEvent): Unit = js.native
  
  def _handleMouseMove(event: MouseEvent): Unit = js.native
  
  def _handleMouseUp(event: MouseEvent): Unit = js.native
  
  def _handleTouchEnd(event: MouseEvent): Unit = js.native
  
  def _handleTouchEvents(event: TouchEvent): Unit = js.native
  
  def _handleTouchMove(event: MouseEvent): Unit = js.native
  
  def _handleTouchStart(event: MouseEvent): Unit = js.native
  
  var _isEmpty: Boolean = js.native
  
  var _lastVelocity: Double = js.native
  
  var _lastWidth: Double = js.native
  
  var _mouseButtonDown: Boolean = js.native
  
  var _points: js.Array[Point] = js.native
  
  def _reset(): Unit = js.native
  
  def _strokeBegin(event: MouseEvent): Unit = js.native
  
  def _strokeEnd(event: MouseEvent): Unit = js.native
  
  def _strokeMoveUpdate(): Unit = js.native
  
  def _strokeUpdate(event: MouseEvent): Unit = js.native
  
  def _strokeWidth(velocity: Double): Double = js.native
  
  def _toSVG(): String = js.native
  
  var backgroundColor: String = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  /**
    *   Clears the canvas
    */
  def clear(): Unit = js.native
  
  var dotSize: Double | js.Function0[Double] = js.native
  
  /**
    *   Draws signature image from array of signature point groups
    */
  def fromData(pointGroups: js.Array[js.Array[Point]]): Unit = js.native
  
  /**
    *   Draws signature image from data URL
    */
  def fromDataURL(dataUrl: String): Unit = js.native
  def fromDataURL(dataUrl: String, options: Callback): Unit = js.native
  
  /**
    *   Returns true if canvas is empty, otherwise returns false
    */
  def isEmpty(): Boolean = js.native
  
  var maxWidth: Double = js.native
  
  var minDistance: Double = js.native
  
  var minWidth: Double = js.native
  
  /**
    *   Unbinds all event handlers
    */
  def off(): Unit = js.native
  
  /**
    *   Rebinds all event handlers
    */
  def on(): Unit = js.native
  
  /**
    * Callback when stroke begin
    */
  def onBegin(event: MouseEvent): Unit = js.native
  
  /**
    * Callback when stroke end.
    */
  def onEnd(event: MouseEvent): Unit = js.native
  
  var options: SignaturePadOptions = js.native
  
  var penColor: String = js.native
  
  var throttle: Double = js.native
  
  /**
    *   Returns array of signature point groups
    */
  def toData(): js.Array[js.Array[Point]] = js.native
  
  /**
    *   Returns signature image as data URL.
    *   If 'type' parameter is ommitted, PNG dataUrl is returned.
    */
  def toDataURL(): String = js.native
  def toDataURL(`type`: js.UndefOr[scala.Nothing], encoderOptions: js.Any): String = js.native
  def toDataURL(`type`: String): String = js.native
  def toDataURL(`type`: String, encoderOptions: js.Any): String = js.native
  
  var velocityFilterWeight: Double = js.native
}
