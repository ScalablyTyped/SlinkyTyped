package typingsSlinky.sicEcies.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.bitcoreLib.mod.PrivateKey
import typingsSlinky.bitcoreLib.mod.PublicKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECIES extends js.Object {
  
  def apply(): ECIES = js.native
  def apply(opts: ECIESOptions): ECIES = js.native
  
  var Rbuf: Buffer = js.native
  
  def decrypt(encbuf: Buffer): Buffer = js.native
  
  def encrypt(message: String): Buffer = js.native
  def encrypt(message: String, ivbuf: Buffer): Buffer = js.native
  def encrypt(message: Buffer): Buffer = js.native
  def encrypt(message: Buffer, ivbuf: Buffer): Buffer = js.native
  
  var kE: Buffer = js.native
  
  var kEkM: Buffer = js.native
  
  var kM: Buffer = js.native
  
  def privateKey(privateKey: PrivateKey): ECIES = js.native
  
  def publicKey(publicKey: PublicKey): ECIES = js.native
}
@JSImport("sic-ecies", "ECIES")
@js.native
object ECIES extends TopLevel[ECIES]
