package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "InertialMouse")
@js.native
class InertialMouse () extends js.Object {
  
  def damp(): this.type = js.native
  
  def get(): js.Tuple2[Double, Double] = js.native
  
  def reset(): this.type = js.native
  
  def update(xy: js.Tuple2[Double, Double]): this.type = js.native
  
  var xy: js.Array[Double] = js.native
}
/* static members */
@JSImport("seen", "InertialMouse")
@js.native
object InertialMouse extends js.Object {
  
  var inertiaExtinction: Double = js.native
  
  var inertiaMsecDelay: Double = js.native
  
  var smoothingTimeout: Double = js.native
}
