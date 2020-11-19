package typingsSlinky.sshpk.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "ECPrivate")
@js.native
class ECPrivate protected () extends js.Object {
  def this(params: X9ECParameters, buffer: Buffer) = this()
  
  def deriveSharedSecret(pk: Key): Buffer = js.native
}
