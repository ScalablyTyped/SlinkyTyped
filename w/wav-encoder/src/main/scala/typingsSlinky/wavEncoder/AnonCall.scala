package typingsSlinky.wavEncoder

import typingsSlinky.wavEncoder.mod.AudioData
import typingsSlinky.wavEncoder.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(audioData: AudioData): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(audioData: AudioData, opts: Options): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sync(audioData: AudioData): js.typedarray.ArrayBuffer = js.native
  def sync(audioData: AudioData, opts: Options): js.typedarray.ArrayBuffer = js.native
}

