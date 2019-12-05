package typingsSlinky.scrypt.scryptMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "verifyKdf")
@js.native
object verifyKdf extends js.Object {
  def apply(kdf: Buffer, key: String): js.Promise[Boolean] = js.native
  def apply(kdf: Buffer, key: String, cb: js.Function2[/* err */ js.Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  def apply(kdf: Buffer, key: Buffer): js.Promise[Boolean] = js.native
  def apply(kdf: Buffer, key: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
}

