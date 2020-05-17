package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Director extends js.Object {
  /**
    * Whether the person is a director of the account’s legal entity. Currently only required for accounts in the EU.
    * Directors are typically members of the governing board of the company, or responsible for ensuring the
    * company meets its regulatory obligations.
    */
  var director: js.UndefOr[Boolean] = js.native
  /**
    * Whether the person has significant responsibility to control, manage, or direct the organization.
    */
  var executive: js.UndefOr[Boolean] = js.native
  /**
    * Whether the person is an owner of the account’s legal entity.
    */
  var owner: js.UndefOr[Boolean] = js.native
  /**
    * The percent owned by the person of the account’s legal entity.
    */
  var percent_ownership: js.UndefOr[Double] = js.native
  /**
    * Whether the person is authorized as the primary representative of the account.
    * This is the person nominated by the business to provide information about themselves,
    * and general information about the account. There can only be one representative at any given time.
    * At the time the account is created, this person should be set to the person responsible for opening the account.
    */
  var representative: js.UndefOr[Boolean] = js.native
  /**
    * The person’s title (e.g., CEO, Support Engineer).
    */
  var title: js.UndefOr[String] = js.native
}

object Director {
  @scala.inline
  def apply(): Director = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Director]
  }
  @scala.inline
  implicit class DirectorOps[Self <: Director] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executive")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent_ownership(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent_ownership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent_ownership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent_ownership")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresentative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresentative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

