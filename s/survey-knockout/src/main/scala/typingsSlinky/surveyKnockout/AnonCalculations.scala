package typingsSlinky.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalculations extends js.Object {
  var calculations: js.UndefOr[js.Array[AnonPropertyName]] = js.native
  var includeEmpty: js.UndefOr[Boolean] = js.native
}

object AnonCalculations {
  @scala.inline
  def apply(): AnonCalculations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCalculations]
  }
  @scala.inline
  implicit class AnonCalculationsOps[Self <: AnonCalculations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculations(value: js.Array[AnonPropertyName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculations")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmpty")(js.undefined)
        ret
    }
  }
  
}

