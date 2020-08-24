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
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferBuyNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferBuyNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferBuyNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferCrossSelf
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferLineFull
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferLowReserve
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferNotFound
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferSellNoIssuer
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferSellNoTrust
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferSellNotAuthorized
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.manageBuyOfferUnderfunded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageBuyOfferResultCode extends js.Object {
  val name: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}

object ManageBuyOfferResultCode {
  @scala.inline
  def apply(
    name: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): ManageBuyOfferResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOfferResultCode]
  }
  @scala.inline
  implicit class ManageBuyOfferResultCodeOps[Self <: ManageBuyOfferResultCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: manageBuyOfferSuccess | manageBuyOfferMalformed | manageBuyOfferSellNoTrust | manageBuyOfferBuyNoTrust | manageBuyOfferSellNotAuthorized | manageBuyOfferBuyNotAuthorized | manageBuyOfferLineFull | manageBuyOfferUnderfunded | manageBuyOfferCrossSelf | manageBuyOfferSellNoIssuer | manageBuyOfferBuyNoIssuer | manageBuyOfferNotFound | manageBuyOfferLowReserve
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

