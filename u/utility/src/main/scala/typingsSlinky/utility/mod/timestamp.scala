package typingsSlinky.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "timestamp")
@js.native
object timestamp extends js.Object {
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  def apply(): Double | js.Date = js.native
  def apply(t: String): Double | js.Date = js.native
  def apply(t: Double): Double | js.Date = js.native
}

