package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.stdStrings.devicechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data. */
@js.native
trait MediaDevices extends EventTarget {
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(`type`: devicechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def enumerateDevices(): js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]] = js.native
  def getSupportedConstraints(): org.scalajs.dom.experimental.mediastream.MediaTrackSupportedConstraints = js.native
  def getUserMedia(): js.Promise[org.scalajs.dom.experimental.mediastream.MediaStream] = js.native
  def getUserMedia(constraints: org.scalajs.dom.experimental.mediastream.MediaStreamConstraints): js.Promise[org.scalajs.dom.experimental.mediastream.MediaStream] = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(`type`: devicechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("MediaDevices")
@js.native
object MediaDevices extends Instantiable0[MediaDevices]

