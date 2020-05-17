package typingsSlinky.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String = js.native
  var versions: Current = js.native
}

object DismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, versions: Current): DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissedVersionNotification]
  }
  @scala.inline
  implicit class DismissedVersionNotificationOps[Self <: DismissedVersionNotification] (val x: Self) extends AnyVal {
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
    def withVersions(value: Current): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

