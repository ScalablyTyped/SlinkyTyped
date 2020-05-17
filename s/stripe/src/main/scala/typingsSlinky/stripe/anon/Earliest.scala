package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.exact
import typingsSlinky.stripe.stripeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Earliest extends js.Object {
  /**
    * If type is "exact", date will be the expected delivery date in the format YYYY-MM-DD
    */
  var date: String = js.native
  /**
    * If type is "range", earliest will be be the earliest delivery date in the format YYYY-MM-DD
    */
  var earliest: String = js.native
  /**
    * If type is "range", latest will be the latest delivery date in the format YYYY-MM-DD
    */
  var latest: String = js.native
  /**
    * The type of estimate. Must be either "range" or "exact"
    */
  var `type`: range | exact = js.native
}

object Earliest {
  @scala.inline
  def apply(date: String, earliest: String, latest: String, `type`: range | exact): Earliest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], earliest = earliest.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Earliest]
  }
  @scala.inline
  implicit class EarliestOps[Self <: Earliest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEarliest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earliest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: range | exact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

