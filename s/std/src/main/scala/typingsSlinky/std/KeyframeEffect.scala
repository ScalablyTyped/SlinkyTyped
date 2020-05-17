package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffect extends AnimationEffect {
  var composite: CompositeOperation = js.native
  var iterationComposite: IterationCompositeOperation = js.native
  var target: org.scalajs.dom.raw.Element | Null = js.native
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
}

