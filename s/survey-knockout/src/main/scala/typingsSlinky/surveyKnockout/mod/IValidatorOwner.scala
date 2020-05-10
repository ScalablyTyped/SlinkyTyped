package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any = js.native
  def getDataFilteredProperties(): js.Any = js.native
  def getDataFilteredValues(): js.Any = js.native
  def getValidatorTitle(): String = js.native
  def getValidators(): js.Array[SurveyValidator] = js.native
}

object IValidatorOwner {
  @scala.inline
  def apply(
    getDataFilteredProperties: () => js.Any,
    getDataFilteredValues: () => js.Any,
    getValidatorTitle: () => String,
    getValidators: () => js.Array[SurveyValidator],
    validatedValue: js.Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), getValidators = js.Any.fromFunction0(getValidators), validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorOwner]
  }
  @scala.inline
  implicit class IValidatorOwnerOps[Self <: IValidatorOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataFilteredProperties(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataFilteredProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataFilteredValues(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataFilteredValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidatorTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidatorTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidators(value: () => js.Array[SurveyValidator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidatedValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

