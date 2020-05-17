package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  var company: Additional = js.native
  var individual: Additional = js.native
}

object Company {
  @scala.inline
  def apply(company: Additional, individual: Additional): Company = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: Additional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividual(value: Additional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

