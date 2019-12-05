package typingsSlinky.wavDashEncoder

import typingsSlinky.wavDashEncoder.wavDashEncoderMod.AudioData
import typingsSlinky.wavDashEncoder.wavDashEncoderMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AudioData extends js.Object {
  def apply(audioData: AudioData): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(audioData: AudioData, opts: Options): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sync(audioData: AudioData): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def sync(audioData: AudioData, opts: Options): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

