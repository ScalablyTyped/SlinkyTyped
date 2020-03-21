package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_shorthash")
@js.native
object cryptoShorthash extends js.Object {
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}

