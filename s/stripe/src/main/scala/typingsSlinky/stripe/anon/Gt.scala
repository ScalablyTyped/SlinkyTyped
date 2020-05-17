package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.topups.IAmountFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gt
  extends IAmountFilter
     with IDateFilter {
  /**
    * Return values where the created field is after this timestamp.
    */
  var gt: js.UndefOr[String] = js.native
  /**
    * Return values where the created field is after or equal to this timestamp.
    */
  var gte: js.UndefOr[String] = js.native
  /**
    * Return values where the created field is before this timestamp.
    */
  var lt: js.UndefOr[String] = js.native
  /**
    * Return values where the created field is before or equal to this timestamp.
    */
  var lte: js.UndefOr[String] = js.native
}

object Gt {
  @scala.inline
  def apply(): Gt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gt]
  }
  @scala.inline
  implicit class GtOps[Self <: Gt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.undefined)
        ret
    }
    @scala.inline
    def withGte(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.undefined)
        ret
    }
    @scala.inline
    def withLt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.undefined)
        ret
    }
    @scala.inline
    def withLte(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.undefined)
        ret
    }
  }
  
}

