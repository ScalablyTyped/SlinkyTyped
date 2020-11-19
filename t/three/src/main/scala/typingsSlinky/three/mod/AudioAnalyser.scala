package typingsSlinky.three.mod

import org.scalajs.dom.raw.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AudioAnalyser")
@js.native
class AudioAnalyser protected ()
  extends typingsSlinky.three.audioAnalyserMod.AudioAnalyser {
  def this(audio: typingsSlinky.three.audioMod.Audio[AudioNode], fftSize: Double) = this()
}
