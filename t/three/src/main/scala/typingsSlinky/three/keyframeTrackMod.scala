package typingsSlinky.three

import typingsSlinky.three.constantsMod.InterpolationModes
import typingsSlinky.three.cubicInterpolantMod.CubicInterpolant
import typingsSlinky.three.discreteInterpolantMod.DiscreteInterpolant
import typingsSlinky.three.linearInterpolantMod.LinearInterpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/KeyframeTrack", JSImport.Namespace)
@js.native
object keyframeTrackMod extends js.Object {
  
  @js.native
  class KeyframeTrack protected () extends js.Object {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
    
    var DefaultInterpolation: InterpolationModes = js.native
    
    def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
    
    def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
    
    def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
    
    var TimeBufferType: js.typedarray.Float32Array = js.native
    
    var ValueBufferType: js.typedarray.Float32Array = js.native
    
    var ValueTypeName: String = js.native
    
    def getInterpolation(): InterpolationModes = js.native
    
    def getValueSize(): Double = js.native
    
    var name: String = js.native
    
    def optimize(): KeyframeTrack = js.native
    
    def scale(timeScale: Double): KeyframeTrack = js.native
    
    def setInterpolation(interpolation: InterpolationModes): KeyframeTrack = js.native
    
    def shift(timeOffset: Double): KeyframeTrack = js.native
    
    var times: js.typedarray.Float32Array = js.native
    
    def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
    
    def validate(): Boolean = js.native
    
    var values: js.typedarray.Float32Array = js.native
  }
  /* static members */
  @js.native
  object KeyframeTrack extends js.Object {
    
    def toJSON(track: KeyframeTrack): js.Any = js.native
  }
}
