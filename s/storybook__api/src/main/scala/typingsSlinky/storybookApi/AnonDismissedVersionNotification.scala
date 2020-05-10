package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String = js.native
  var versions: AnonCurrent = js.native
}

object AnonDismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, versions: AnonCurrent): AnonDismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismissedVersionNotification]
  }
  @scala.inline
  implicit class AnonDismissedVersionNotificationOps[Self <: AnonDismissedVersionNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissedVersionNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: AnonCurrent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

