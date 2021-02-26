package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-10`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-11`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-12`
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
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoDestination
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendOfferCrossSelf
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendSrcNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendSrcNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendTooFewOffers
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendUnderDestmin
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictSendUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSendResultCode extends StObject {
  
  val name: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object PathPaymentStrictSendResultCode {
  
  @scala.inline
  def apply(
    name: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): PathPaymentStrictSendResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSendResultCode]
  }
  
  @scala.inline
  implicit class PathPaymentStrictSendResultCodeMutableBuilder[Self <: PathPaymentStrictSendResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: pathPaymentStrictSendSuccess | pathPaymentStrictSendMalformed | pathPaymentStrictSendUnderfunded | pathPaymentStrictSendSrcNoTrust | pathPaymentStrictSendSrcNotAuthorized | pathPaymentStrictSendNoDestination | pathPaymentStrictSendNoTrust | pathPaymentStrictSendNotAuthorized | pathPaymentStrictSendLineFull | pathPaymentStrictSendNoIssuer | pathPaymentStrictSendTooFewOffers | pathPaymentStrictSendOfferCrossSelf | pathPaymentStrictSendUnderDestmin
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
