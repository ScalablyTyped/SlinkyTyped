package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompany extends js.Object {
  var company: AnonAdditional = js.native
  var individual: AnonAdditional = js.native
}

object AnonCompany {
  @scala.inline
  def apply(company: AnonAdditional, individual: AnonAdditional): AnonCompany = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompany]
  }
  @scala.inline
  implicit class AnonCompanyOps[Self <: AnonCompany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: AnonAdditional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividual(value: AnonAdditional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

