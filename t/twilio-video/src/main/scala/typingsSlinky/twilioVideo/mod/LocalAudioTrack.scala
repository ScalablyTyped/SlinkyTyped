package typingsSlinky.twilioVideo.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.experimental.mediastream.MediaTrackConstraints
import typingsSlinky.twilioVideo.mod.Track.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalAudioTrack")
@js.native
class LocalAudioTrack protected ()
  extends AudioTrack
     with LocalTrack {
  def this(mediaStreamTrack: MediaStreamTrack) = this()
  def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  
  def disable(): LocalAudioTrack = js.native
  
  def enable(): LocalAudioTrack = js.native
  def enable(enabled: Boolean): LocalAudioTrack = js.native
  
  var id: ID = js.native
  
  var isStopped: Boolean = js.native
  
  def restart(): js.Promise[Unit] = js.native
  def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  
  def stop(): LocalAudioTrack = js.native
}
