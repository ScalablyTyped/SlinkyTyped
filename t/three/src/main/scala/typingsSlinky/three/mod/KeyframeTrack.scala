package typingsSlinky.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends typingsSlinky.three.keyframeTrackMod.KeyframeTrack {
  /**
  	 * @param name
  	 * @param times
  	 * @param values
  	 * @param [interpolation=THREE.InterpolateLinear]
  	 */
  def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  def this(
    name: String,
    times: js.Array[_],
    values: js.Array[_],
    interpolation: typingsSlinky.three.constantsMod.InterpolationModes
  ) = this()
}
/* static members */
object KeyframeTrack {
  
  @JSImport("three", "KeyframeTrack.toJSON")
  @js.native
  def toJSON(track: typingsSlinky.three.keyframeTrackMod.KeyframeTrack): js.Any = js.native
}
