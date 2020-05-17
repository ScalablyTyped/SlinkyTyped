package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is being suspended. */
@js.native
trait ProtectedAccessSuspendingEventArgs extends js.Object {
  /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
  var deadline: js.Date = js.native
  /** Contains the enterprise identities for which content protection is being suspended. */
  var identities: IVectorView[String] = js.native
  /**
    * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object ProtectedAccessSuspendingEventArgs {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => Deferral, identities: IVectorView[String]): ProtectedAccessSuspendingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessSuspendingEventArgs]
  }
  @scala.inline
  implicit class ProtectedAccessSuspendingEventArgsOps[Self <: ProtectedAccessSuspendingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => Deferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIdentities(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

