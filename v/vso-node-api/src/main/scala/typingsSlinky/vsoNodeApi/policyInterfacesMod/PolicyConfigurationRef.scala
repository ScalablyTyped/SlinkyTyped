package typingsSlinky.vsoNodeApi.policyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyConfigurationRef extends js.Object {
  /**
    * The policy configuration ID.
    */
  var id: Double = js.native
  /**
    * The policy configuration type.
    */
  var `type`: PolicyTypeRef = js.native
  /**
    * The URL where the policy configuration can be retrieved.
    */
  var url: String = js.native
}

object PolicyConfigurationRef {
  @scala.inline
  def apply(id: Double, `type`: PolicyTypeRef, url: String): PolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConfigurationRef]
  }
  @scala.inline
  implicit class PolicyConfigurationRefOps[Self <: PolicyConfigurationRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PolicyTypeRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

