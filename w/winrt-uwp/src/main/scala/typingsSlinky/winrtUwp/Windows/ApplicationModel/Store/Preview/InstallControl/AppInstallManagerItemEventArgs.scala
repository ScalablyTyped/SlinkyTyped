package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ItemCompleted and ItemStatusChanged events. */
@js.native
trait AppInstallManagerItemEventArgs extends js.Object {
  /** Gets an object that describes the app that has finished installing (for the ItemCompleted event) or whose installation status has changed (for the ItemStatusChanged event). */
  var item: AppInstallItem = js.native
}

object AppInstallManagerItemEventArgs {
  @scala.inline
  def apply(item: AppInstallItem): AppInstallManagerItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstallManagerItemEventArgs]
  }
  @scala.inline
  implicit class AppInstallManagerItemEventArgsOps[Self <: AppInstallManagerItemEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: AppInstallItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

