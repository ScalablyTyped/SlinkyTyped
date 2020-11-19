package typingsSlinky.wavEncoder.mod

import typingsSlinky.wavEncoder.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wav-encoder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def encode(audioData: AudioData): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encode(audioData: AudioData, opts: Options): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("encode")
  var encode_Original: Call = js.native
}
