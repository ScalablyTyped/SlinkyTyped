package typingsSlinky.utility.mod

import typingsSlinky.node.Buffer
import typingsSlinky.utility.utilityStrings.base64
import typingsSlinky.utility.utilityStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "hash")
@js.native
object hash extends js.Object {
  
  def apply(method: typingsSlinky.utility.utilityStrings.md5, s: String, format: base64): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.md5, s: String, format: hex): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.md5, s: Buffer, format: base64): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.md5, s: Buffer, format: hex): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.sha1, s: String, format: base64): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.sha1, s: String, format: hex): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.sha1, s: Buffer, format: base64): String = js.native
  def apply(method: typingsSlinky.utility.utilityStrings.sha1, s: Buffer, format: hex): String = js.native
}
