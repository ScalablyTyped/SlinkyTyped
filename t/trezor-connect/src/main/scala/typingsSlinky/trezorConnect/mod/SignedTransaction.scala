package typingsSlinky.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedTransaction extends StObject {
  
  var serializedTx: String = js.native
  
  var signatures: js.Array[String] = js.native
  
  var txId: js.UndefOr[String] = js.native
}
object SignedTransaction {
  
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String]): SignedTransaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTransaction]
  }
  
  @scala.inline
  implicit class SignedTransactionMutableBuilder[Self <: SignedTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializedTx(value: String): Self = StObject.set(x, "serializedTx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTxId(value: String): Self = StObject.set(x, "txId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxIdUndefined: Self = StObject.set(x, "txId", js.undefined)
  }
}
