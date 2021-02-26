package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain). */
/////////////////////////////
/// DOM Iterable APIs
/////////////////////////////
@js.native
trait AudioParam extends StObject {
  
  var automationRate: AutomationRate = js.native
  
  def cancelAndHoldAtTime(cancelTime: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  def cancelScheduledValues(cancelTime: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  val defaultValue: Double = js.native
  
  def exponentialRampToValueAtTime(value: Double, endTime: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  def linearRampToValueAtTime(value: Double, endTime: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  val maxValue: Double = js.native
  
  val minValue: Double = js.native
  
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  def setValueAtTime(value: Double, startTime: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  def setValueCurveAtTime(values: js.Array[Double], startTime: Double, duration: Double): org.scalajs.dom.raw.AudioParam = js.native
  def setValueCurveAtTime(values: js.Iterable[Double], startTime: Double, duration: Double): org.scalajs.dom.raw.AudioParam = js.native
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime: Double, duration: Double): org.scalajs.dom.raw.AudioParam = js.native
  
  var value: Double = js.native
}
