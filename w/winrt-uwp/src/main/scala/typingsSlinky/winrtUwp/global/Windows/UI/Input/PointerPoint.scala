package typingsSlinky.winrtUwp.global.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.UI.Input.IPointerPointTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  /**
    * Retrieves position and state information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: Double): typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double): IVector[typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
}

