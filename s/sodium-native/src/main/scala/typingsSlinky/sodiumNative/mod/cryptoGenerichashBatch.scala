package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_generichash_batch")
@js.native
object cryptoGenerichashBatch extends js.Object {
  
  def apply(output: Buffer, inputArray: js.Array[Buffer]): Unit = js.native
  def apply(output: Buffer, inputArray: js.Array[Buffer], key: Buffer): Unit = js.native
}
