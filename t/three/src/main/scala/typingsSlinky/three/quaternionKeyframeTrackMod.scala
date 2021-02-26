package typingsSlinky.three

import typingsSlinky.three.constantsMod.InterpolationModes
import typingsSlinky.three.keyframeTrackMod.KeyframeTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quaternionKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/QuaternionKeyframeTrack", "QuaternionKeyframeTrack")
  @js.native
  class QuaternionKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
}
