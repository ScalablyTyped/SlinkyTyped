package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPermissionRequest extends js.Object {
  val id: Double = js.native
  val `type`: MSWebViewPermissionType = js.native
  val uri: java.lang.String = js.native
  def allow(): Unit = js.native
  def deny(): Unit = js.native
}

object DeferredPermissionRequest {
  @scala.inline
  def apply(
    allow: () => Unit,
    deny: () => Unit,
    id: Double,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): DeferredPermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredPermissionRequest]
  }
  @scala.inline
  implicit class DeferredPermissionRequestOps[Self <: DeferredPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeny(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MSWebViewPermissionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

