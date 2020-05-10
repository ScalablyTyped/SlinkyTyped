package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageManager extends js.Object {
  def estimate(): js.Promise[StorageEstimate] = js.native
  def persist(): js.Promise[scala.Boolean] = js.native
  def persisted(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("StorageManager")
@js.native
object StorageManager extends Instantiable0[StorageManager]

