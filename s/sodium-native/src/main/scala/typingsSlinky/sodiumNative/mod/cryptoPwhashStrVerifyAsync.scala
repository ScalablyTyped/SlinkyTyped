package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash_str_verify_async")
@js.native
object cryptoPwhashStrVerifyAsync extends js.Object {
  
  def apply(
    str: Buffer,
    password: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* bool */ Boolean, Unit]
  ): Unit = js.native
}
