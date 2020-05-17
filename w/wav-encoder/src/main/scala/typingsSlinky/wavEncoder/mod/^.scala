package typingsSlinky.wavEncoder.mod

import typingsSlinky.wavEncoder.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wav-encoder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("encode")
  var encode_Original: Call = js.native
  def encode(audioData: AudioData): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encode(audioData: AudioData, opts: Options): js.Promise[js.typedarray.ArrayBuffer] = js.native
}

