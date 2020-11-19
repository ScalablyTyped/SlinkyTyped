package typingsSlinky.three

import org.scalajs.dom.raw.AnalyserNode
import org.scalajs.dom.raw.AudioNode
import typingsSlinky.three.audioMod.Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/audio/AudioAnalyser", JSImport.Namespace)
@js.native
object audioAnalyserMod extends js.Object {
  
  @js.native
  class AudioAnalyser protected () extends js.Object {
    def this(audio: Audio[AudioNode], fftSize: Double) = this()
    
    var analyser: AnalyserNode = js.native
    
    var data: js.typedarray.Uint8Array = js.native
    
    def getAverageFrequency(): Double = js.native
    
    /**
    	 * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
    	 */
    def getData(file: js.Any): js.Any = js.native
    
    def getFrequencyData(): js.typedarray.Uint8Array = js.native
  }
}
