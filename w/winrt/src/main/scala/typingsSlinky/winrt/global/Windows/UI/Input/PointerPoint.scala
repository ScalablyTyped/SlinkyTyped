package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.UI.Input.IPointerPointTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint ()
  extends typingsSlinky.winrt.Windows.UI.Input.PointerPoint
/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  
  def getCurrentPoint(pointerId: Double): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
  
  def getIntermediatePoints(pointerId: Double): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
}
