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
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoDestination
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveOfferCrossSelf
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveOverSendmax
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSrcNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSrcNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveTooFewOffers
import typingsSlinky.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictReceiveResultCode extends StObject {
  
  val name: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object PathPaymentStrictReceiveResultCode {
  
  @scala.inline
  def apply(
    name: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): PathPaymentStrictReceiveResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceiveResultCode]
  }
  
  @scala.inline
  implicit class PathPaymentStrictReceiveResultCodeMutableBuilder[Self <: PathPaymentStrictReceiveResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
