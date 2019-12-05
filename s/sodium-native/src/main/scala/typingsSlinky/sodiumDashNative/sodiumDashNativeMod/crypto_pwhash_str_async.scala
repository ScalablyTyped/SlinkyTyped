package typingsSlinky.sodiumDashNative.sodiumDashNativeMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_async")
@js.native
object crypto_pwhash_str_async extends js.Object {
  def apply(
    output: Buffer,
    password: Buffer,
    opslimit: Double,
    memlimit: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
}

