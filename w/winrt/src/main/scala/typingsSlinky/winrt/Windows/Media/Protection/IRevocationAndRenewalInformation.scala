package typingsSlinky.winrt.Windows.Media.Protection

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRevocationAndRenewalInformation extends js.Object {
  var items: IVector[RevocationAndRenewalItem] = js.native
}

object IRevocationAndRenewalInformation {
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
  @scala.inline
  implicit class IRevocationAndRenewalInformationOps[Self <: IRevocationAndRenewalInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IVector[RevocationAndRenewalItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

