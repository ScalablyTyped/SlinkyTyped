package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceCannotClaim
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceDoesNotExist
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.claimClaimableBalanceSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimClaimableBalanceResultCode extends StObject {
  
  val name: claimClaimableBalanceSuccess | claimClaimableBalanceDoesNotExist | claimClaimableBalanceCannotClaim | claimClaimableBalanceLineFull | claimClaimableBalanceNoTrust | claimClaimableBalanceNotAuthorized = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object ClaimClaimableBalanceResultCode {
  
  @scala.inline
  def apply(
    name: claimClaimableBalanceSuccess | claimClaimableBalanceDoesNotExist | claimClaimableBalanceCannotClaim | claimClaimableBalanceLineFull | claimClaimableBalanceNoTrust | claimClaimableBalanceNotAuthorized,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): ClaimClaimableBalanceResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimClaimableBalanceResultCode]
  }
  
  @scala.inline
  implicit class ClaimClaimableBalanceResultCodeMutableBuilder[Self <: ClaimClaimableBalanceResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: claimClaimableBalanceSuccess | claimClaimableBalanceDoesNotExist | claimClaimableBalanceCannotClaim | claimClaimableBalanceLineFull | claimClaimableBalanceNoTrust | claimClaimableBalanceNotAuthorized
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
