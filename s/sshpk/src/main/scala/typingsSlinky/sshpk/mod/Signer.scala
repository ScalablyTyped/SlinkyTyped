package typingsSlinky.sshpk.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Signer")
@js.native
class Signer protected () extends js.Object {
  def this(key: Key, hashAlgo: String) = this()
  
  def sign(): Signature = js.native
  
  def update(chunk: String): Unit = js.native
  def update(chunk: Buffer): Unit = js.native
}
