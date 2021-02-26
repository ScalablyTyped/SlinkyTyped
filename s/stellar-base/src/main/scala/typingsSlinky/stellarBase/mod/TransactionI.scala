package typingsSlinky.stellarBase.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.xdrMod.default.DecoratedSignature
import typingsSlinky.stellarBase.xdrMod.default.TransactionEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "TransactionI")
@js.native
class TransactionI () extends StObject {
  
  def addSignature(publicKey: String, signature: String): Unit = js.native
  
  var fee: String = js.native
  
  def getKeypairSignature(keypair: Keypair): String = js.native
  
  def hash(): Buffer = js.native
  
  var networkPassphrase: String = js.native
  
  def sign(keypairs: Keypair*): Unit = js.native
  
  def signHashX(preimage: String): Unit = js.native
  def signHashX(preimage: Buffer): Unit = js.native
  
  def signatureBase(): Buffer = js.native
  
  var signatures: js.Array[DecoratedSignature] = js.native
  
  def toEnvelope(): TransactionEnvelope = js.native
  
  def toXDR(): String = js.native
}
