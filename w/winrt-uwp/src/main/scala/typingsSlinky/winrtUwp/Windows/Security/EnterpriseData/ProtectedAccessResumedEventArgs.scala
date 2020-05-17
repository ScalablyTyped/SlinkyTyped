package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is resumed. */
@js.native
trait ProtectedAccessResumedEventArgs extends js.Object {
  /** Contains the enterprise identities for which content protection is being resumed. */
  var identities: IVectorView[String] = js.native
}

object ProtectedAccessResumedEventArgs {
  @scala.inline
  def apply(identities: IVectorView[String]): ProtectedAccessResumedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessResumedEventArgs]
  }
  @scala.inline
  implicit class ProtectedAccessResumedEventArgsOps[Self <: ProtectedAccessResumedEventArgs] (val x: Self) extends AnyVal {
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

