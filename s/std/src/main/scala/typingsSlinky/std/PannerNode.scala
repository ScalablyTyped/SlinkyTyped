package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels! */
@js.native
trait PannerNode extends AudioNode {
  
  var coneInnerAngle: Double = js.native
  
  var coneOuterAngle: Double = js.native
  
  var coneOuterGain: Double = js.native
  
  var distanceModel: DistanceModelType = js.native
  
  var maxDistance: Double = js.native
  
  val orientationX: org.scalajs.dom.raw.AudioParam = js.native
  
  val orientationY: org.scalajs.dom.raw.AudioParam = js.native
  
  val orientationZ: org.scalajs.dom.raw.AudioParam = js.native
  
  var panningModel: PanningModelType = js.native
  
  val positionX: org.scalajs.dom.raw.AudioParam = js.native
  
  val positionY: org.scalajs.dom.raw.AudioParam = js.native
  
  val positionZ: org.scalajs.dom.raw.AudioParam = js.native
  
  var refDistance: Double = js.native
  
  var rolloffFactor: Double = js.native
  
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double): Unit = js.native
  
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}
