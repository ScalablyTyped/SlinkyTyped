package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeEffect extends AnimationEffect {
  
  var composite: CompositeOperation = js.native
  
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  
  var iterationComposite: IterationCompositeOperation = js.native
  
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
  
  var target: org.scalajs.dom.raw.Element | Null = js.native
}
