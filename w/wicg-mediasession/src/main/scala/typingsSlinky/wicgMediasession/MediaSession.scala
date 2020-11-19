package typingsSlinky.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSession extends js.Object {
  
  // Current media session meta data.
  var metadata: MediaMetadata | Null = js.native
  
  // Current media session playback state.
  var playbackState: MediaSessionPlaybackState = js.native
  
  // Set/Unset actions handlers.
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, listener: js.Function0[Unit]): Unit = js.native
}
