package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calculations extends js.Object {
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.native
  var includeEmpty: js.UndefOr[Boolean] = js.native
}

object Calculations {
  @scala.inline
  def apply(): Calculations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calculations]
  }
  @scala.inline
  implicit class CalculationsOps[Self <: Calculations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculations(value: js.Array[PropertyName]): Self = {
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

