package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
@js.native
trait MediaDeviceInfo extends js.Object {
  val deviceId: java.lang.String = js.native
  val groupId: java.lang.String = js.native
  val kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind = js.native
  val label: java.lang.String = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("MediaDeviceInfo")
@js.native
object MediaDeviceInfo
  extends Instantiable0[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]

