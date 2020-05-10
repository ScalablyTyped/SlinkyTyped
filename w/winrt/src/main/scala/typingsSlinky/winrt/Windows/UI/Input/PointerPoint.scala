package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint () extends IPointerPoint

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  def getCurrentPoint(pointerId: Double): PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): PointerPoint = js.native
  def getIntermediatePoints(pointerId: Double): IVector[PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[PointerPoint] = js.native
}

