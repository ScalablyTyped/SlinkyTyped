package typingsSlinky.sshKeyDecrypt

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.sshKeyDecrypt.sshKeyDecryptStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh-key-decrypt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(data: String, passphrase: String): Buffer = js.native
  def apply(data: String, passphrase: String, outEnc: BufferEncoding): String = js.native
  def apply(data: String, passphrase: String, outEnc: buffer): Buffer = js.native
  def apply(data: Buffer, passphrase: String): Buffer = js.native
  def apply(data: Buffer, passphrase: String, outEnc: BufferEncoding): String = js.native
  def apply(data: Buffer, passphrase: String, outEnc: buffer): Buffer = js.native
}
