package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class UnityIndicatorProperties ()
    extends typingsSlinky.unityWebapi.UnityIndicatorProperties
  
  @js.native
  object UnityPlaybackState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.unityWebapi.UnityPlaybackState with Double] = js.native
    
    /* 1 */ val Paused: typingsSlinky.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    
    /* 0 */ val Playing: typingsSlinky.unityWebapi.UnityPlaybackState.Playing with Double = js.native
  }
  
  @js.native
  class UnitySettings ()
    extends typingsSlinky.unityWebapi.UnitySettings
  
  @js.native
  class UnityTrackMetadata ()
    extends typingsSlinky.unityWebapi.UnityTrackMetadata
}
