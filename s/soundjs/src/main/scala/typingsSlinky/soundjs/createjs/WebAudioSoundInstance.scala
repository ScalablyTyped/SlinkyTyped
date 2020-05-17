package typingsSlinky.soundjs.createjs

import org.scalajs.dom.raw.AudioNode
import org.scalajs.dom.raw.GainNode
import org.scalajs.dom.raw.PannerNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAudioSoundInstance extends AbstractSoundInstance {
  var gainNode: GainNode = js.native
  var panNode: PannerNode = js.native
  var sourceNode: AudioNode = js.native
}

