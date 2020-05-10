package typingsSlinky.serviceWorkerMock.mod

import org.scalajs.dom.experimental.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * A key/value map of current cache contents.
    */
  var caches: Caches = js.native
  /**
    * A list of active clients.
    */
  var clients: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
  ] = js.native
  /**
    * A list of active notifications.
    */
  var notifications: js.Array[Notification] = js.native
}

object Snapshot {
  @scala.inline
  def apply(
    caches: Caches,
    clients: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
    ],
    notifications: js.Array[Notification]
  ): Snapshot = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaches(value: Caches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClients(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

