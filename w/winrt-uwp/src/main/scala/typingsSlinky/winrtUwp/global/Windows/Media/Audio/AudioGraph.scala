package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
abstract class AudioGraph ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.AudioGraph
/* static members */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
object AudioGraph extends js.Object {
  
  /**
    * Creates an audio graph with specific settings.
    * @param settings An AudioGraphSettings object representing the source audio file.
    * @return When this operation completes, a CreateAudioGraphResult object is returned.
    */
  def createAsync(settings: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioGraphSettings): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult] = js.native
}
