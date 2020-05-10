package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivilegeKeyList extends js.Object {
  var token: String = js.native
  var token_created: Double = js.native
  /** only in server version >= 3.11.x */
  var token_customset: js.Array[TokenCustomSet] = js.native
  var token_description: String = js.native
  var token_id1: Double = js.native
  var token_id2: Double = js.native
  var token_type: Double = js.native
}

object PrivilegeKeyList {
  @scala.inline
  def apply(
    token: String,
    token_created: Double,
    token_customset: js.Array[TokenCustomSet],
    token_description: String,
    token_id1: Double,
    token_id2: Double,
    token_type: Double
  ): PrivilegeKeyList = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], token_created = token_created.asInstanceOf[js.Any], token_customset = token_customset.asInstanceOf[js.Any], token_description = token_description.asInstanceOf[js.Any], token_id1 = token_id1.asInstanceOf[js.Any], token_id2 = token_id2.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivilegeKeyList]
  }
  @scala.inline
  implicit class PrivilegeKeyListOps[Self <: PrivilegeKeyList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_customset(value: js.Array[TokenCustomSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_customset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_id1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_id2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

