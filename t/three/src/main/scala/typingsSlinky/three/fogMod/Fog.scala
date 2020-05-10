package typingsSlinky.three.fogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Fog", "Fog")
@js.native
class Fog protected () extends IFog {
  def this(hex: Double) = this()
  def this(hex: Double, near: Double) = this()
  def this(hex: Double, near: Double, far: Double) = this()
  /**
  	 * The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
  	 * Default is 1000.
  	 */
  var far: Double = js.native
  /**
  	 * The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
  	 */
  var near: Double = js.native
}

