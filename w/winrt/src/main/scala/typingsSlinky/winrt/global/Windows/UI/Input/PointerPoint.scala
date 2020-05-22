package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDevice
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.UI.Input.IPointerPointTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint ()
  extends typingsSlinky.winrt.Windows.UI.Input.PointerPoint {
  /* CompleteClass */
  override var frameId: Double = js.native
  /* CompleteClass */
  override var isInContact: Boolean = js.native
  /* CompleteClass */
  override var pointerDevice: PointerDevice = js.native
  /* CompleteClass */
  override var pointerId: Double = js.native
  /* CompleteClass */
  override var position: Point = js.native
  /* CompleteClass */
  override var properties: typingsSlinky.winrt.Windows.UI.Input.PointerPointProperties = js.native
  /* CompleteClass */
  override var rawPosition: Point = js.native
  /* CompleteClass */
  override var timestamp: Double = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  def getCurrentPoint(pointerId: Double): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
  def getIntermediatePoints(pointerId: Double): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
}

