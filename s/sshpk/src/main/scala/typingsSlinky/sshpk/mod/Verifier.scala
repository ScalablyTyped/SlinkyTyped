package typingsSlinky.sshpk.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(key: Key, hashAlgo: String) = this()
  
  def update(chunk: String): Unit = js.native
  def update(chunk: Buffer): Unit = js.native
  
  def verify(signature: String): Boolean = js.native
}
