package typingsSlinky.wavEncoder.mod

import typingsSlinky.wavEncoder.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wav-encoder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("encode")
  var encode_Original: AnonCall = js.native
  def encode(audioData: AudioData): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encode(audioData: AudioData, opts: Options): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
}

