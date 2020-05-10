package typingsSlinky.trtcJsSdk.mod

import org.scalajs.dom.experimental.mediastream.MediaDeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trtc-js-sdk", "getDevices")
@js.native
object getDevices extends js.Object {
  def apply(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
}

