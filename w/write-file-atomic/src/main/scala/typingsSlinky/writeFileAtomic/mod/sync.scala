package typingsSlinky.writeFileAtomic.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write-file-atomic", "sync")
@js.native
object sync extends js.Object {
  
  def apply(filename: String, data: String): Unit = js.native
  def apply(filename: String, data: String, options: BufferEncoding): Unit = js.native
  def apply(filename: String, data: String, options: Options): Unit = js.native
  def apply(filename: String, data: Buffer): Unit = js.native
  def apply(filename: String, data: Buffer, options: BufferEncoding): Unit = js.native
  def apply(filename: String, data: Buffer, options: Options): Unit = js.native
}
