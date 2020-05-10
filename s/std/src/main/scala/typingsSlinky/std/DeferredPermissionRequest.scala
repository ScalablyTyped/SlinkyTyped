package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPermissionRequest extends js.Object {
  val id: Double = js.native
  val `type`: MSWebViewPermissionType = js.native
  val uri: java.lang.String = js.native
  def allow(): Unit = js.native
  def deny(): Unit = js.native
}

@JSGlobal("DeferredPermissionRequest")
@js.native
object DeferredPermissionRequest extends Instantiable0[DeferredPermissionRequest]

