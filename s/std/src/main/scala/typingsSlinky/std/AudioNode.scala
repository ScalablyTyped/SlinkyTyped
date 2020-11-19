package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic interface for representing an audio processing module. Examples include: */
@js.native
trait AudioNode extends EventTarget {
  
  var channelCount: Double = js.native
  
  var channelCountMode: ChannelCountMode = js.native
  
  var channelInterpretation: ChannelInterpretation = js.native
  
  def connect(destinationNode: org.scalajs.dom.raw.AudioNode): org.scalajs.dom.raw.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.raw.AudioNode, output: js.UndefOr[scala.Nothing], input: Double): org.scalajs.dom.raw.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.raw.AudioNode, output: Double): org.scalajs.dom.raw.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.raw.AudioNode, output: Double, input: Double): org.scalajs.dom.raw.AudioNode = js.native
  def connect(destinationParam: org.scalajs.dom.raw.AudioParam): Unit = js.native
  def connect(destinationParam: org.scalajs.dom.raw.AudioParam, output: Double): Unit = js.native
  
  val context: BaseAudioContext = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(destinationNode: org.scalajs.dom.raw.AudioNode): Unit = js.native
  def disconnect(destinationNode: org.scalajs.dom.raw.AudioNode, output: Double): Unit = js.native
  def disconnect(destinationNode: org.scalajs.dom.raw.AudioNode, output: Double, input: Double): Unit = js.native
  def disconnect(destinationParam: org.scalajs.dom.raw.AudioParam): Unit = js.native
  def disconnect(destinationParam: org.scalajs.dom.raw.AudioParam, output: Double): Unit = js.native
  def disconnect(output: Double): Unit = js.native
  
  val numberOfInputs: Double = js.native
  
  val numberOfOutputs: Double = js.native
}
