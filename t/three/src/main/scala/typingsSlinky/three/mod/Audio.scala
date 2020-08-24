package typingsSlinky.three.mod

import org.scalajs.dom.raw.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Audio")
@js.native
class Audio[NodeType /* <: AudioNode */] protected ()
  extends typingsSlinky.three.audioMod.Audio[NodeType] {
  def this(listener: typingsSlinky.three.audioListenerMod.AudioListener) = this()
}

