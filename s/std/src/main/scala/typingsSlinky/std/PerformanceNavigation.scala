package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done. */
@js.native
trait PerformanceNavigation extends js.Object {
  val TYPE_BACK_FORWARD: Double = js.native
  val TYPE_NAVIGATE: Double = js.native
  val TYPE_RELOAD: Double = js.native
  val TYPE_RESERVED: Double = js.native
  val redirectCount: Double = js.native
  val `type`: Double = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceNavigation")
@js.native
object PerformanceNavigation
  extends Instantiable0[org.scalajs.dom.raw.PerformanceNavigation] {
  val TYPE_BACK_FORWARD: Double = js.native
  val TYPE_NAVIGATE: Double = js.native
  val TYPE_RELOAD: Double = js.native
  val TYPE_RESERVED: Double = js.native
}

