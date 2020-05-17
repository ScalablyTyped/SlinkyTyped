package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
@js.native
trait WalletItemCustomProperty extends js.Object {
  /** Gets or sets whether this WalletItemCustomProperty is entity-extracted and actionable upon display. */
  var autoDetectLinks: Boolean = js.native
  /** Gets or sets the optional position of this property when shown in the wallet item's detail view. */
  var detailViewPosition: WalletDetailViewPosition = js.native
  /** Gets or sets the custom property label. */
  var name: String = js.native
  /** Gets or sets the optional position of this property when shown in the summary view for a wallet item. */
  var summaryViewPosition: WalletSummaryViewPosition = js.native
  /** Gets or sets the custom property value. */
  var value: String = js.native
}

object WalletItemCustomProperty {
  @scala.inline
  def apply(
    autoDetectLinks: Boolean,
    detailViewPosition: WalletDetailViewPosition,
    name: String,
    summaryViewPosition: WalletSummaryViewPosition,
    value: String
  ): WalletItemCustomProperty = {
    val __obj = js.Dynamic.literal(autoDetectLinks = autoDetectLinks.asInstanceOf[js.Any], detailViewPosition = detailViewPosition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summaryViewPosition = summaryViewPosition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletItemCustomProperty]
  }
  @scala.inline
  implicit class WalletItemCustomPropertyOps[Self <: WalletItemCustomProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDetectLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailViewPosition(value: WalletDetailViewPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailViewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryViewPosition(value: WalletSummaryViewPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryViewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

