package typingsSlinky.stellarBase.anon

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetCode extends StObject {
  
  var assetCode: Buffer = js.native
  
  var issuer: typingsSlinky.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AssetCode {
  
  @scala.inline
  def apply(assetCode: Buffer, issuer: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): AssetCode = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetCode]
  }
  
  @scala.inline
  implicit class AssetCodeMutableBuilder[Self <: AssetCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetCode(value: Buffer): Self = StObject.set(x, "assetCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
