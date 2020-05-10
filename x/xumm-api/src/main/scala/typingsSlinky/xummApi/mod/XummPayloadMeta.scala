package typingsSlinky.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPayloadMeta extends js.Object {
  var app_opened: Boolean = js.native
  var cancelled: Boolean = js.native
  var destination: String = js.native
  var exists: Boolean = js.native
  var expired: Boolean = js.native
  var multisign: Boolean = js.native
  var pushed: Boolean = js.native
  var resolved: Boolean = js.native
  var resolved_destination: String = js.native
  var return_url_app: String | Null = js.native
  var return_url_web: String | Null = js.native
  var signed: Boolean = js.native
  var submit: Boolean = js.native
  var uuid: String = js.native
}

object XummPayloadMeta {
  @scala.inline
  def apply(
    app_opened: Boolean,
    cancelled: Boolean,
    destination: String,
    exists: Boolean,
    expired: Boolean,
    multisign: Boolean,
    pushed: Boolean,
    resolved: Boolean,
    resolved_destination: String,
    signed: Boolean,
    submit: Boolean,
    uuid: String
  ): XummPayloadMeta = {
    val __obj = js.Dynamic.literal(app_opened = app_opened.asInstanceOf[js.Any], cancelled = cancelled.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], multisign = multisign.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], resolved_destination = resolved_destination.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPayloadMeta]
  }
  @scala.inline
  implicit class XummPayloadMetaOps[Self <: XummPayloadMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_opened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultisign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved_destination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn_url_app(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url_app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn_url_appNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url_app")(null)
        ret
    }
    @scala.inline
    def withReturn_url_web(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url_web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn_url_webNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url_web")(null)
        ret
    }
  }
  
}

