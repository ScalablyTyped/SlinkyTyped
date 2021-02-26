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
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferBuyNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferBuyNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferBuyNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferCrossSelf
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferNotFound
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferSellNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferSellNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferSellNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.manageSellOfferUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageSellOfferResultCode extends StObject {
  
  val name: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object ManageSellOfferResultCode {
  
  @scala.inline
  def apply(
    name: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): ManageSellOfferResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageSellOfferResultCode]
  }
  
  @scala.inline
  implicit class ManageSellOfferResultCodeMutableBuilder[Self <: ManageSellOfferResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
