package typingsSlinky.winrt.Windows.Media.Protection

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponentRenewalStatics extends js.Object {
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = js.native
}

object IComponentRenewalStatics {
  @scala.inline
  def apply(
    renewSystemComponentsAsync: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal(renewSystemComponentsAsync = js.Any.fromFunction1(renewSystemComponentsAsync))
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
  @scala.inline
  implicit class IComponentRenewalStaticsOps[Self <: IComponentRenewalStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenewSystemComponentsAsync(value: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewSystemComponentsAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

