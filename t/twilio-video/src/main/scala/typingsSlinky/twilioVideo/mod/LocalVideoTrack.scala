package typingsSlinky.twilioVideo.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.experimental.mediastream.MediaTrackConstraints
import org.scalajs.dom.raw.HTMLMediaElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.twilioVideo.mod.Track.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalVideoTrack")
@js.native
class LocalVideoTrack protected ()
  extends VideoTrack
     with LocalTrack {
  def this(mediaStreamTrack: MediaStreamTrack) = this()
  def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  
  /* InferMemberOverrides */
  override def attach(): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: String): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  
  /* InferMemberOverrides */
  override def detach(): js.Array[HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: String): js.Array[HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
  
  def disable(): LocalVideoTrack = js.native
  
  def enable(): LocalVideoTrack = js.native
  def enable(enabled: Boolean): LocalVideoTrack = js.native
  
  var id: ID = js.native
  
  var isStopped: Boolean = js.native
  
  def restart(): js.Promise[Unit] = js.native
  def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  
  def stop(): LocalVideoTrack = js.native
}
