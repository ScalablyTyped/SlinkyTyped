package typingsSlinky.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusTransitions extends js.Object {
  /**
    * The time that the invoice draft was finalized.
    */
  var finalized_at: Double | Null = js.native
  /**
    * The time that the invoice was marked uncollectible.
    */
  var marked_uncollectible_at: Double | Null = js.native
  /**
    * The time that the invoice was paid.
    */
  var paid_at: Double | Null = js.native
  /**
    * The time that the invoice was voided.
    */
  var voided_at: Double | Null = js.native
}

object IStatusTransitions {
  @scala.inline
  def apply(): IStatusTransitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusTransitions]
  }
  @scala.inline
  implicit class IStatusTransitionsOps[Self <: IStatusTransitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalized_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalized_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalized_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalized_at")(null)
        ret
    }
    @scala.inline
    def withMarked_uncollectible_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked_uncollectible_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarked_uncollectible_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked_uncollectible_at")(null)
        ret
    }
    @scala.inline
    def withPaid_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaid_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid_at")(null)
        ret
    }
    @scala.inline
    def withVoided_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voided_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoided_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voided_at")(null)
        ret
    }
  }
  
}

