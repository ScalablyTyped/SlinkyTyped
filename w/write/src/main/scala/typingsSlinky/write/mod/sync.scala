package typingsSlinky.write.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write", "sync")
@js.native
object sync extends js.Object {
  
  def apply(filepath: String, data: String): Result[String] = js.native
  def apply(filepath: String, data: String, options: Options): Result[String] = js.native
  def apply(filepath: String, data: Buffer): Result[Buffer] = js.native
  def apply(filepath: String, data: Buffer, options: Options): Result[Buffer] = js.native
  def apply(filepath: String, data: js.typedarray.Uint8Array): Result[js.typedarray.Uint8Array] = js.native
  def apply(filepath: String, data: js.typedarray.Uint8Array, options: Options): Result[js.typedarray.Uint8Array] = js.native
}
