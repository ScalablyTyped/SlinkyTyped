package typingsSlinky.stripe.stripeMod.sources

import typingsSlinky.stripe.Anon_AcceptanceAmount
import typingsSlinky.stripe.Anon_AddressEmailNamePhoneIAddress
import typingsSlinky.stripe.stripeMod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
  var mandate: js.UndefOr[Anon_AcceptanceAmount] = js.undefined
  var owner: js.UndefOr[Anon_AddressEmailNamePhoneIAddress] = js.undefined
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    mandate: Anon_AcceptanceAmount = null,
    metadata: IOptionsMetadata = null,
    owner: Anon_AddressEmailNamePhoneIAddress = null
  ): ISourceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceUpdateOptions]
  }
}

