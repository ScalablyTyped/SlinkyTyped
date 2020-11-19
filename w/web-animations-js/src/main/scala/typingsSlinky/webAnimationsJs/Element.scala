package typingsSlinky.webAnimationsJs

import typingsSlinky.std.Keyframe
import typingsSlinky.std.KeyframeAnimationOptions
import typingsSlinky.std.PropertyIndexedKeyframes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  def animate(): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame | Keyframe], timing: Double): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: Null, timing: Double): Animation = js.native
  def animate(effect: Null, timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: Double): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: AnimationEffectTiming): Animation = js.native
  def animate(keyframes: js.Array[Keyframe]): Animation = js.native
  def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
  
  def getAnimations(): js.Array[Animation] = js.native
}
