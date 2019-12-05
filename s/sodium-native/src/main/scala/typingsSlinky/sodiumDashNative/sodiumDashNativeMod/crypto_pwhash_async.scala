package typingsSlinky.sodiumDashNative.sodiumDashNativeMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_async")
@js.native
object crypto_pwhash_async extends js.Object {
  def apply(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
}

