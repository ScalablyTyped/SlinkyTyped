package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseStrings.signerKeyTypeEd25519
import typingsSlinky.stellarBase.stellarBaseStrings.signerKeyTypeHashX
import typingsSlinky.stellarBase.stellarBaseStrings.signerKeyTypePreAuthTx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerKeyType extends StObject {
  
  val name: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX = js.native
  
  val value: `0` | `1` | `2` = js.native
}
object SignerKeyType {
  
  @scala.inline
  def apply(name: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX, value: `0` | `1` | `2`): SignerKeyType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerKeyType]
  }
  
  @scala.inline
  implicit class SignerKeyTypeMutableBuilder[Self <: SignerKeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
