package typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details associated with the background task for the app service. */
@js.native
trait AppServiceTriggerDetails extends js.Object {
  /** Gets the connection to the endpoint of the other app service. */
  var appServiceConnection: AppServiceConnection = js.native
  /** Gets the name of the package family for the client app that called the background task for the app service. */
  var callerPackageFamilyName: String = js.native
  /** Gets the name of the app service. */
  var name: String = js.native
}

object AppServiceTriggerDetails {
  @scala.inline
  def apply(appServiceConnection: AppServiceConnection, callerPackageFamilyName: String, name: String): AppServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(appServiceConnection = appServiceConnection.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceTriggerDetails]
  }
  @scala.inline
  implicit class AppServiceTriggerDetailsOps[Self <: AppServiceTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppServiceConnection(value: AppServiceConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appServiceConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallerPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerPackageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

