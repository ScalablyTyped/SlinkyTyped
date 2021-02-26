package typingsSlinky.winrtUwp.Windows.Media.Effects

import typingsSlinky.winrtUwp.Windows.Media.AudioFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
@js.native
trait ProcessAudioFrameContext extends StObject {
  
  /** Gets the input frame for an audio effect operation. */
  var inputFrame: AudioFrame = js.native
  
  /** Gets the output frame for an audio effect operation. */
  var outputFrame: AudioFrame = js.native
}
object ProcessAudioFrameContext {
  
  @scala.inline
  def apply(inputFrame: AudioFrame, outputFrame: AudioFrame): ProcessAudioFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessAudioFrameContext]
  }
  
  @scala.inline
  implicit class ProcessAudioFrameContextMutableBuilder[Self <: ProcessAudioFrameContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputFrame(value: AudioFrame): Self = StObject.set(x, "inputFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFrame(value: AudioFrame): Self = StObject.set(x, "outputFrame", value.asInstanceOf[js.Any])
  }
}
