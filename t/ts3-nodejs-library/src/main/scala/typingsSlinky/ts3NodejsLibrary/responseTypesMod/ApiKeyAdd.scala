package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyAdd extends js.Object {
  var apikey: String = js.native
  var cldbid: Double = js.native
  var id: Double = js.native
  var scope: ApiKeyScope = js.native
  var sid: Double = js.native
  var time_left: Double = js.native
}

object ApiKeyAdd {
  @scala.inline
  def apply(apikey: String, cldbid: Double, id: Double, scope: ApiKeyScope, sid: Double, time_left: Double): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
  @scala.inline
  implicit class ApiKeyAddOps[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: ApiKeyScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_left")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

