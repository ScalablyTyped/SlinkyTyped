package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustInvalidLimit
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustSelfNotAllowed
import typingsSlinky.stellarBase.stellarBaseStrings.changeTrustSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeTrustResultCode extends StObject {
  
  val name: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object ChangeTrustResultCode {
  
  @scala.inline
  def apply(
    name: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): ChangeTrustResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrustResultCode]
  }
  
  @scala.inline
  implicit class ChangeTrustResultCodeMutableBuilder[Self <: ChangeTrustResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
