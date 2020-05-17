package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  var organization: scala.Double = js.native
  var `private`: scala.Double = js.native
  var public: scala.Double = js.native
  var unchanged: scala.Double = js.native
}

object Organization {
  @scala.inline
  def apply(organization: scala.Double, `private`: scala.Double, public: scala.Double, unchanged: scala.Double): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganization(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnchanged(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

