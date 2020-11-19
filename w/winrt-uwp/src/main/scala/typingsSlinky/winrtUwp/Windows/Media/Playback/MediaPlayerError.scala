package typingsSlinky.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerError extends js.Object
/** Indicates possible media player errors. */
@JSGlobal("Windows.Media.Playback.MediaPlayerError")
@js.native
object MediaPlayerError extends js.Object {
  
  /** The last operation was aborted. */
  @js.native
  sealed trait aborted extends MediaPlayerError
  
  /** A media decoding error occurred. */
  @js.native
  sealed trait decodingError extends MediaPlayerError
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError extends MediaPlayerError
  
  /** The media type is not supported. */
  @js.native
  sealed trait sourceNotSupported extends MediaPlayerError
  
  /** The error is unknown. */
  @js.native
  sealed trait unknown extends MediaPlayerError
}
