package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executive extends js.Object {
  /**
    * A filter on the list of people returned based on whether these people are
    * directors of the account’s company.
    */
  var director: js.UndefOr[Boolean] = js.native
  /**
    * A filter on the list of people returned based on whether these people are
    * executives of the account’s company.
    */
  var executive: js.UndefOr[Boolean] = js.native
  /**
    * A filter on the list of people returned based on whether these people are
    * owners of the account’s company.
    */
  var owner: js.UndefOr[Boolean] = js.native
  /**
    * A filter on the list of people returned based on whether these people are
    * the representative of the account’s company.
    */
  var representative: js.UndefOr[Boolean] = js.native
}

object Executive {
  @scala.inline
  def apply(): Executive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Executive]
  }
  @scala.inline
  implicit class ExecutiveOps[Self <: Executive] (val x: Self) extends AnyVal {
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
  }
  
}

