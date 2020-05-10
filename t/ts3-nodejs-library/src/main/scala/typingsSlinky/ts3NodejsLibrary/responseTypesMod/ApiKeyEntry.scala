package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyEntry extends js.Object {
  var cldbid: Double = js.native
  var count: Double = js.native
  var created_at: Double = js.native
  var expires_at: Double = js.native
  var id: Double = js.native
  var scope: ApiKeyScope = js.native
  var sid: Double = js.native
  var time_left: Double = js.native
}

object ApiKeyEntry {
  @scala.inline
  def apply(
    cldbid: Double,
    count: Double,
    created_at: Double,
    expires_at: Double,
    id: Double,
    scope: ApiKeyScope,
    sid: Double,
    time_left: Double
  ): ApiKeyEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyEntry]
  }
  @scala.inline
  implicit class ApiKeyEntryOps[Self <: ApiKeyEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
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

