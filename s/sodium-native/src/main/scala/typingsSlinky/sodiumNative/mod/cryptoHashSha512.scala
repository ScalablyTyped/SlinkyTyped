package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_hash_sha512")
@js.native
object cryptoHashSha512 extends js.Object {
  def apply(output: Buffer, input: Buffer): Unit = js.native
}

