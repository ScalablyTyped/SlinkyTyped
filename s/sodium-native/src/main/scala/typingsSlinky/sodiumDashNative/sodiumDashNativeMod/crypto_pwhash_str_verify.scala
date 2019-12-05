package typingsSlinky.sodiumDashNative.sodiumDashNativeMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_verify")
@js.native
object crypto_pwhash_str_verify extends js.Object {
  def apply(str: Buffer, password: Buffer): Boolean = js.native
}

