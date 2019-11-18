package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
trait MediaDeviceInfo extends js.Object {
  val deviceId: java.lang.String
  val groupId: java.lang.String
  val kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind
  val label: java.lang.String
  def toJSON(): js.Any
}

@JSGlobal("MediaDeviceInfo")
@js.native
object MediaDeviceInfo extends Instantiable0[MediaDeviceInfo]

