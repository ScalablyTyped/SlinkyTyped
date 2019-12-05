package typingsSlinky.twilioDashVideo.twilioDashVideoMod

import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.ArrayBufferView
import typingsSlinky.std.Blob
import typingsSlinky.twilioDashVideo.twilioDashVideoMod.Track.ID
import typingsSlinky.twilioDashVideo.twilioDashVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalDataTrack")
@js.native
class LocalDataTrack ()
  extends Track
     with DataTrack
     with LocalTrack {
  def this(options: LocalDataTrackOptions) = this()
  var id: ID = js.native
  @JSName("kind")
  var kind_LocalDataTrack: data = js.native
  var maxPacketLifeTime: Double | Null = js.native
  var maxRetransmits: Double | Null = js.native
  var ordered: Boolean = js.native
  var reliable: Boolean = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

