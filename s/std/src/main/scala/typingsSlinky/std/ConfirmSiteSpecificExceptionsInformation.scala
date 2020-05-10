package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSiteSpecificExceptionsInformation extends ExceptionInformation {
  var arrayOfDomainStrings: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object ConfirmSiteSpecificExceptionsInformation {
  @scala.inline
  def apply(): ConfirmSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSiteSpecificExceptionsInformation]
  }
  @scala.inline
  implicit class ConfirmSiteSpecificExceptionsInformationOps[Self <: ConfirmSiteSpecificExceptionsInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayOfDomainStrings(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayOfDomainStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayOfDomainStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayOfDomainStrings")(js.undefined)
        ret
    }
  }
  
}

