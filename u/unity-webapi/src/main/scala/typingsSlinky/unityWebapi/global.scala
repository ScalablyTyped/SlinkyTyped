package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class UnityIndicatorProperties ()
    extends typingsSlinky.unityWebapi.UnityIndicatorProperties {
    /* CompleteClass */
    override var count: Double = js.native
    /* CompleteClass */
    override var iconURI: String = js.native
    /* CompleteClass */
    override var onIndicatorActivated: js.Function = js.native
    /* CompleteClass */
    override var time: js.Date = js.native
  }
  
  @js.native
  class UnitySettings ()
    extends typingsSlinky.unityWebapi.UnitySettings {
    /* CompleteClass */
    override var iconUrl: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var onInit: js.Function = js.native
  }
  
  @js.native
  class UnityTrackMetadata ()
    extends typingsSlinky.unityWebapi.UnityTrackMetadata {
    // Optionals
    /* CompleteClass */
    override var album: String = js.native
    /* CompleteClass */
    override var artLocation: String = js.native
    /* CompleteClass */
    override var artist: String = js.native
    /* CompleteClass */
    override var title: String = js.native
  }
  
  @js.native
  object UnityPlaybackState extends js.Object {
    /* 1 */ val Paused: typingsSlinky.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    /* 0 */ val Playing: typingsSlinky.unityWebapi.UnityPlaybackState.Playing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.unityWebapi.UnityPlaybackState with Double] = js.native
  }
  
}

