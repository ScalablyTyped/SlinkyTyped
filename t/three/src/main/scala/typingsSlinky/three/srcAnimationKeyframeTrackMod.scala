package typingsSlinky.three

import typingsSlinky.three.srcConstantsMod.InterpolationModes
import typingsSlinky.three.srcMathInterpolantsCubicInterpolantMod.CubicInterpolant
import typingsSlinky.three.srcMathInterpolantsDiscreteInterpolantMod.DiscreteInterpolant
import typingsSlinky.three.srcMathInterpolantsLinearInterpolantMod.LinearInterpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/KeyframeTrack", JSImport.Namespace)
@js.native
object srcAnimationKeyframeTrackMod extends js.Object {
  @js.native
  class KeyframeTrack protected () extends js.Object {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
    var DefaultInterpolation: InterpolationModes = js.native
    var TimeBufferType: scala.scalajs.js.typedarray.Float32Array = js.native
    var ValueBufferType: scala.scalajs.js.typedarray.Float32Array = js.native
    var ValueTypeName: String = js.native
    var name: String = js.native
    var times: scala.scalajs.js.typedarray.Float32Array = js.native
    var values: scala.scalajs.js.typedarray.Float32Array = js.native
    def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
    def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
    def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
    def getInterpolation(): InterpolationModes = js.native
    def getValuesize(): Double = js.native
    def optimize(): KeyframeTrack = js.native
    def scale(timeScale: Double): KeyframeTrack = js.native
    def setInterpolation(interpolation: InterpolationModes): Unit = js.native
    def shift(timeOffset: Double): KeyframeTrack = js.native
    def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
    def validate(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyframeTrack extends js.Object {
    def parse(json: js.Any): KeyframeTrack = js.native
    def toJSON(track: KeyframeTrack): js.Any = js.native
  }
  
}

