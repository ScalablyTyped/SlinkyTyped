package typingsSlinky.uuid1345.mod

import typingsSlinky.node.Buffer
import typingsSlinky.uuid1345.anon.EncodingName
import typingsSlinky.uuid1345.anon.Name
import typingsSlinky.uuid1345.anon.NameNamespace
import typingsSlinky.uuid1345.anon.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uuid-1345", "v3")
@js.native
object v3 extends js.Object {
  
  def apply(options: EncodingName): Buffer = js.native
  def apply(options: EncodingName, callback: BinaryCallback): Unit = js.native
  def apply(options: Name): String = js.native
  def apply(options: NameNamespace): UUID = js.native
  def apply(options: NameNamespace, callback: ObjectCallback): Unit = js.native
  def apply(options: Name, callback: ASCIICallback): Unit = js.native
  def apply(options: Namespace): String = js.native
  def apply(options: Namespace, callback: ASCIICallback): Unit = js.native
}
