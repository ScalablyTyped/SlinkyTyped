package typingsSlinky.stellarBase.xdrMod.xdr

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
import typingsSlinky.stellarBase.stellarBaseStrings.paymentLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.paymentMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.paymentNoDestination
import typingsSlinky.stellarBase.stellarBaseStrings.paymentNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.paymentNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.paymentNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.paymentSrcNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.paymentSrcNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.paymentSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.paymentUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentResultCode extends StObject {
  
  val name: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` = js.native
}
object PaymentResultCode {
  
  @scala.inline
  def apply(
    name: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`
  ): PaymentResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResultCode]
  }
  
  @scala.inline
  implicit class PaymentResultCodeMutableBuilder[Self <: PaymentResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
