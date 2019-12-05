package typingsSlinky.soundjs.createjs

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.DynamicsCompressorNode
import org.scalajs.dom.raw.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin () extends AbstractPlugin {
  var context: AudioContext = js.native
  var dynamicsCompressorNode: DynamicsCompressorNode = js.native
  var gainNode: GainNode = js.native
}

/* static members */
@JSGlobal("createjs.WebAudioPlugin")
@js.native
object WebAudioPlugin extends js.Object {
  // properties
  var context: AudioContext = js.native
  // methods
  def isSupported(): Boolean = js.native
  def playEmptySound(): Unit = js.native
}

