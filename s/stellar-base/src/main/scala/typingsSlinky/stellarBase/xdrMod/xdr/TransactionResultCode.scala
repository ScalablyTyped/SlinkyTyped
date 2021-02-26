package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-10`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-11`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-12`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-13`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-14`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-7`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-8`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-9`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`1`
import typingsSlinky.stellarBase.stellarBaseStrings.txBadAuth
import typingsSlinky.stellarBase.stellarBaseStrings.txBadAuthExtra
import typingsSlinky.stellarBase.stellarBaseStrings.txBadSeq
import typingsSlinky.stellarBase.stellarBaseStrings.txBadSponsorship
import typingsSlinky.stellarBase.stellarBaseStrings.txFailed
import typingsSlinky.stellarBase.stellarBaseStrings.txFeeBumpInnerFailed
import typingsSlinky.stellarBase.stellarBaseStrings.txFeeBumpInnerSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.txInsufficientBalance
import typingsSlinky.stellarBase.stellarBaseStrings.txInsufficientFee
import typingsSlinky.stellarBase.stellarBaseStrings.txInternalError
import typingsSlinky.stellarBase.stellarBaseStrings.txMissingOperation
import typingsSlinky.stellarBase.stellarBaseStrings.txNoAccount
import typingsSlinky.stellarBase.stellarBaseStrings.txNotSupported
import typingsSlinky.stellarBase.stellarBaseStrings.txSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.txTooEarly
import typingsSlinky.stellarBase.stellarBaseStrings.txTooLate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResultCode extends StObject {
  
  val name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship = js.native
  
  val value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14` = js.native
}
object TransactionResultCode {
  
  @scala.inline
  def apply(
    name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship,
    value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14`
  ): TransactionResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResultCode]
  }
  
  @scala.inline
  implicit class TransactionResultCodeMutableBuilder[Self <: TransactionResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
