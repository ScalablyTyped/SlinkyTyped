package typingsSlinky.three

import typingsSlinky.three.constantsMod.InterpolationModes
import typingsSlinky.three.keyframeTrackMod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/tracks/StringKeyframeTrack", JSImport.Namespace)
@js.native
object stringKeyframeTrackMod extends js.Object {
  
  @js.native
  class StringKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
}
