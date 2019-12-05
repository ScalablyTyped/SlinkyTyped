package typingsSlinky.utility.utilityMod

import typingsSlinky.node.Buffer
import typingsSlinky.utility.utilityStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "hmac")
@js.native
object hmac_base64 extends js.Object {
  def apply(algorithm: String, key: String, data: String, encoding: base64): String = js.native
  def apply(algorithm: String, key: String, data: Buffer, encoding: base64): String = js.native
}

