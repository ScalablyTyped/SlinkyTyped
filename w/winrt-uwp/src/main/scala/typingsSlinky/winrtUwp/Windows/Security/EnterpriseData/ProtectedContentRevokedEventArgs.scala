package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection has been revoked. */
@js.native
trait ProtectedContentRevokedEventArgs extends js.Object {
  /** Contains the enterprise identities for which content protection has been revoked. */
  var identities: IVectorView[String] = js.native
}

object ProtectedContentRevokedEventArgs {
  @scala.inline
  def apply(identities: IVectorView[String]): ProtectedContentRevokedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContentRevokedEventArgs]
  }
  @scala.inline
  implicit class ProtectedContentRevokedEventArgsOps[Self <: ProtectedContentRevokedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentities(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

