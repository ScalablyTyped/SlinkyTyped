package typingsSlinky.wavEncoder

import typingsSlinky.wavEncoder.mod.AudioData
import typingsSlinky.wavEncoder.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call extends js.Object {
    def apply(audioData: AudioData): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def apply(audioData: AudioData, opts: Options): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def sync(audioData: AudioData): js.typedarray.ArrayBuffer = js.native
    def sync(audioData: AudioData, opts: Options): js.typedarray.ArrayBuffer = js.native
  }
  
}

