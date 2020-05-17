package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item (data) that is stored in the wallet. */
@js.native
trait WalletItem extends js.Object {
  /** Gets or sets the barcode that's representative of the wallet item. */
  var barcode: WalletBarcode = js.native
  /** Gets or sets the background image of the body of the wallet item (uses a stream). */
  var bodyBackgroundImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the body color of the wallet item. */
  var bodyColor: Color = js.native
  /** Gets or sets the body font color of the wallet item. */
  var bodyFontColor: Color = js.native
  /** Gets or sets a string that appears next to the app name in About info. */
  var displayMessage: String = js.native
  /** Gets or sets the name or title to be displayed to the user. */
  var displayName: String = js.native
  /** Gets the collection of WalletItemCustomProperty objects associated with the wallet item. */
  var displayProperties: IMap[String, WalletItemCustomProperty] = js.native
  /** Gets or sets the expiration date of the wallet item. */
  var expirationDate: js.Date = js.native
  /** Gets or sets the header background image of the wallet item. */
  var headerBackgroundImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the header color of the wallet item. */
  var headerColor: Color = js.native
  /** Gets or sets the header font color of the wallet item. */
  var headerFontColor: Color = js.native
  /** Gets the unique identifier of the wallet item. */
  var id: String = js.native
  /** Gets or sets whether this item is acknowledged by the app. */
  var isAcknowledged: Boolean = js.native
  /** Gets or sets whether to launch your app when the user taps on the DisplayMessage . */
  var isDisplayMessageLaunchable: Boolean = js.native
  /** Gets or sets whether your app should be launched when the user taps "see more transaction history". */
  var isMoreTransactionHistoryLaunchable: Boolean = js.native
  /** Gets or sets the issuer name of the wallet item. */
  var issuerDisplayName: String = js.native
  /** Gets the type of the wallet item. */
  var kind: WalletItemKind = js.native
  /** Gets or sets the date and time the data for this item was last updated. */
  var lastUpdated: js.Date = js.native
  /** Gets or sets the medium (159 x 159) logo image of the wallet item. */
  var logo159x159: IRandomAccessStreamReference = js.native
  /** Gets or sets the large (336 x 336) logo image of the wallet item. */
  var logo336x336: IRandomAccessStreamReference = js.native
  /** Gets or sets the small (99 x 99) logo image of the wallet item. */
  var logo99x99: IRandomAccessStreamReference = js.native
  /** Gets or sets the logo image of the wallet item. */
  var logoImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the logo text of the wallet item. */
  var logoText: String = js.native
  /** Gets or sets the promotional image of the wallet item. */
  var promotionalImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the date on which the item is valid. */
  var relevantDate: js.Date = js.native
  /** Gets or sets the description of the relevant date of the wallet item. */
  var relevantDateDisplayMessage: String = js.native
  /** Gets a collection of all relevant locations for the wallet item. */
  var relevantLocations: IMap[String, WalletRelevantLocation] = js.native
  /** Gets the transaction history collection of the wallet item. */
  var transactionHistory: IMap[String, WalletTransaction] = js.native
  /** Gets the collection of WalletVerb objects associated with the wallet item. */
  var verbs: IMap[String, WalletVerb] = js.native
}

object WalletItem {
  @scala.inline
  def apply(
    barcode: WalletBarcode,
    bodyBackgroundImage: IRandomAccessStreamReference,
    bodyColor: Color,
    bodyFontColor: Color,
    displayMessage: String,
    displayName: String,
    displayProperties: IMap[String, WalletItemCustomProperty],
    expirationDate: js.Date,
    headerBackgroundImage: IRandomAccessStreamReference,
    headerColor: Color,
    headerFontColor: Color,
    id: String,
    isAcknowledged: Boolean,
    isDisplayMessageLaunchable: Boolean,
    isMoreTransactionHistoryLaunchable: Boolean,
    issuerDisplayName: String,
    kind: WalletItemKind,
    lastUpdated: js.Date,
    logo159x159: IRandomAccessStreamReference,
    logo336x336: IRandomAccessStreamReference,
    logo99x99: IRandomAccessStreamReference,
    logoImage: IRandomAccessStreamReference,
    logoText: String,
    promotionalImage: IRandomAccessStreamReference,
    relevantDate: js.Date,
    relevantDateDisplayMessage: String,
    relevantLocations: IMap[String, WalletRelevantLocation],
    transactionHistory: IMap[String, WalletTransaction],
    verbs: IMap[String, WalletVerb]
  ): WalletItem = {
    val __obj = js.Dynamic.literal(barcode = barcode.asInstanceOf[js.Any], bodyBackgroundImage = bodyBackgroundImage.asInstanceOf[js.Any], bodyColor = bodyColor.asInstanceOf[js.Any], bodyFontColor = bodyFontColor.asInstanceOf[js.Any], displayMessage = displayMessage.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayProperties = displayProperties.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], headerBackgroundImage = headerBackgroundImage.asInstanceOf[js.Any], headerColor = headerColor.asInstanceOf[js.Any], headerFontColor = headerFontColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAcknowledged = isAcknowledged.asInstanceOf[js.Any], isDisplayMessageLaunchable = isDisplayMessageLaunchable.asInstanceOf[js.Any], isMoreTransactionHistoryLaunchable = isMoreTransactionHistoryLaunchable.asInstanceOf[js.Any], issuerDisplayName = issuerDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], logo159x159 = logo159x159.asInstanceOf[js.Any], logo336x336 = logo336x336.asInstanceOf[js.Any], logo99x99 = logo99x99.asInstanceOf[js.Any], logoImage = logoImage.asInstanceOf[js.Any], logoText = logoText.asInstanceOf[js.Any], promotionalImage = promotionalImage.asInstanceOf[js.Any], relevantDate = relevantDate.asInstanceOf[js.Any], relevantDateDisplayMessage = relevantDateDisplayMessage.asInstanceOf[js.Any], relevantLocations = relevantLocations.asInstanceOf[js.Any], transactionHistory = transactionHistory.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletItem]
  }
  @scala.inline
  implicit class WalletItemOps[Self <: WalletItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarcode(value: WalletBarcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBackgroundImage(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFontColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayProperties(value: IMap[String, WalletItemCustomProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackgroundImage(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFontColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAcknowledged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAcknowledged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisplayMessageLaunchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisplayMessageLaunchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMoreTransactionHistoryLaunchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoreTransactionHistoryLaunchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: WalletItemKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo159x159(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo159x159")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo336x336(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo336x336")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo99x99(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo99x99")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoImage(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotionalImage(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionalImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevantDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevantDateDisplayMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantDateDisplayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevantLocations(value: IMap[String, WalletRelevantLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionHistory(value: IMap[String, WalletTransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbs(value: IMap[String, WalletVerb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

