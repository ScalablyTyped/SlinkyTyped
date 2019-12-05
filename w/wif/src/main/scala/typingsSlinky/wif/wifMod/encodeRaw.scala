package typingsSlinky.wif.wifMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wif", "encodeRaw")
@js.native
object encodeRaw extends js.Object {
  def apply(version: Double, privateKey: Buffer, compressed: Boolean): Buffer = js.native
}

