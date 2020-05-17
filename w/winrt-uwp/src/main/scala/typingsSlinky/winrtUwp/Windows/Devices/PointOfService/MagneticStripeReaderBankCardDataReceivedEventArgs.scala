package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides bank card data from the BankCardDataReceived event. */
@js.native
trait MagneticStripeReaderBankCardDataReceivedEventArgs extends js.Object {
  /** Gets the account number from the swiped bank card. */
  var accountNumber: String = js.native
  /** Gets the expiration date from the swiped card. */
  var expirationDate: String = js.native
  /** Gets the first name from the swiped bank card. */
  var firstName: String = js.native
  /** Gets the middle initial from the swiped bank card. */
  var middleInitial: String = js.native
  /** Gets the data from the swiped bank card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the service code for the swiped bank card. */
  var serviceCode: String = js.native
  /** Gets the suffix from the swiped bank card. */
  var suffix: String = js.native
  /** Gets the surname from the swiped bank card. */
  var surname: String = js.native
  /** Gets the title from the swiped bank card. */
  var title: String = js.native
}

object MagneticStripeReaderBankCardDataReceivedEventArgs {
  @scala.inline
  def apply(
    accountNumber: String,
    expirationDate: String,
    firstName: String,
    middleInitial: String,
    report: MagneticStripeReaderReport,
    serviceCode: String,
    suffix: String,
    surname: String,
    title: String
  ): MagneticStripeReaderBankCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(accountNumber = accountNumber.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], middleInitial = middleInitial.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderBankCardDataReceivedEventArgs]
  }
  @scala.inline
  implicit class MagneticStripeReaderBankCardDataReceivedEventArgsOps[Self <: MagneticStripeReaderBankCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: MagneticStripeReaderReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

