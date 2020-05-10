package typingsSlinky.webrtc

import org.scalajs.dom.experimental.mediastream.MediaDeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDevices extends js.Object {
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
}

object MediaDevices {
  @scala.inline
  def apply(
    enumerateDevices: () => js.Promise[js.Array[MediaDeviceInfo]],
    getSupportedConstraints: () => MediaTrackSupportedConstraints,
    getUserMedia: MediaStreamConstraints => js.Promise[MediaStream]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal(enumerateDevices = js.Any.fromFunction0(enumerateDevices), getSupportedConstraints = js.Any.fromFunction0(getSupportedConstraints), getUserMedia = js.Any.fromFunction1(getUserMedia))
    __obj.asInstanceOf[MediaDevices]
  }
  @scala.inline
  implicit class MediaDevicesOps[Self <: MediaDevices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumerateDevices(value: () => js.Promise[js.Array[MediaDeviceInfo]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateDevices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSupportedConstraints(value: () => MediaTrackSupportedConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedConstraints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserMedia(value: MediaStreamConstraints => js.Promise[MediaStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserMedia")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

