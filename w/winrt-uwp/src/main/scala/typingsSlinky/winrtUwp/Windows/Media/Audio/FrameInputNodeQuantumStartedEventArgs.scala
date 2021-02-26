package typingsSlinky.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AudioFrameInputNode::QuantumStarted event. This event is raised when the audio graph containing the audio frame input node is ready to begin processing a new quantum of data. */
@js.native
trait FrameInputNodeQuantumStartedEventArgs extends StObject {
  
  /** Gets the number of samples that the audio graph requires to fill the quantum with data. */
  var requiredSamples: Double = js.native
}
object FrameInputNodeQuantumStartedEventArgs {
  
  @scala.inline
  def apply(requiredSamples: Double): FrameInputNodeQuantumStartedEventArgs = {
    val __obj = js.Dynamic.literal(requiredSamples = requiredSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameInputNodeQuantumStartedEventArgs]
  }
  
  @scala.inline
  implicit class FrameInputNodeQuantumStartedEventArgsMutableBuilder[Self <: FrameInputNodeQuantumStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredSamples(value: Double): Self = StObject.set(x, "requiredSamples", value.asInstanceOf[js.Any])
  }
}
