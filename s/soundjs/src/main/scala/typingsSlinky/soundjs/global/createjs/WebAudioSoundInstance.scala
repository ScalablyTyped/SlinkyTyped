package typingsSlinky.soundjs.global.createjs

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
class WebAudioSoundInstance protected ()
  extends typingsSlinky.soundjs.createjs.WebAudioSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
}

/* static members */
@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
object WebAudioSoundInstance extends js.Object {
  // properties
  var context: AudioContext = js.native
  var destinationNode: AudioNode = js.native
}

