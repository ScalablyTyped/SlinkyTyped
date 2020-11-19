package typingsSlinky.scrypt.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "hash")
@js.native
object hash extends js.Object {
  
  def apply(key: String, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: String, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
}
