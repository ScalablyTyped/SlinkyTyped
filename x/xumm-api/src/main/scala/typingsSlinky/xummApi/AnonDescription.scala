package typingsSlinky.xummApi

import typingsSlinky.xummApi.xummApiNumbers.`0`
import typingsSlinky.xummApi.xummApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescription extends js.Object {
  var description: String = js.native
  var disabled: `0` | `1` = js.native
  var icon_url: String = js.native
  var issued_user_token: String | Null = js.native
  var name: String = js.native
  var uuidv4: String = js.native
}

object AnonDescription {
  @scala.inline
  def apply(description: String, disabled: `0` | `1`, icon_url: String, name: String, uuidv4: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon_url = icon_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
  @scala.inline
  implicit class AnonDescriptionOps[Self <: AnonDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuidv4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssued_user_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued_user_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssued_user_tokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued_user_token")(null)
        ret
    }
  }
  
}

