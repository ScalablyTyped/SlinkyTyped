package typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
@js.native
trait AppServiceDeferral extends js.Object {
  /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
  def complete(): Unit = js.native
}

object AppServiceDeferral {
  @scala.inline
  def apply(complete: () => Unit): AppServiceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AppServiceDeferral]
  }
  @scala.inline
  implicit class AppServiceDeferralOps[Self <: AppServiceDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

