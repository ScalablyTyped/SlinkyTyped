package typingsSlinky.semanticUiForm.SemanticUI.Form.PromptSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '{name} must be checked'
    */
  var checked: String = js.native
  /**
    * @default '{name} cannot contain \'{ruleValue}\''
    */
  var contain: String = js.native
  /**
    * @default '{name} cannot contain exactly \'{ruleValue}\''
    */
  var containExactly: String = js.native
  /**
    * @default '{name} must be a valid credit card number'
    */
  var creditCard: String = js.native
  /**
    * @default '{name} must be a decimal number'
    */
  var decimal: String = js.native
  /**
    * @default '{name} must have a different value than {ruleValue} field'
    */
  var different: String = js.native
  /**
    * @default '{name} must contain  \'{ruleValue}\''
    */
  var doesntContain: String = js.native
  /**
    * @default '{name} must contain exactly \'{ruleValue}\''
    */
  var doesntContainExactly: String = js.native
  /**
    * @default '{name} must be a valid e-mail'
    */
  var email: String = js.native
  /**
    * @default '{name} must have a value'
    */
  var empty: String = js.native
  /**
    * @default '{name} must have exactly {ruleValue} choices'
    */
  var exactCount: String = js.native
  /**
    * @default '{name} must be exactly {ruleValue} characters'
    */
  var exactLength: String = js.native
  /**
    * @default '{name} must be an integer'
    */
  var integer: String = js.native
  /**
    * @default '{name} must be \'{ruleValue}\''
    */
  var is: String = js.native
  /**
    * @default '{name} must be exactly \'{ruleValue}\''
    */
  var isExactly: String = js.native
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var length: String = js.native
  /**
    * @default '{name} must match {ruleValue} field'
    */
  var `match`: String = js.native
  /**
    * @default '{name} must have {ruleValue} or less choices'
    */
  var maxCount: String = js.native
  /**
    * @default '{name} cannot be longer than {ruleValue} characters'
    */
  var maxLength: String = js.native
  /**
    * @default '{name} must have at least {ruleValue} choices'
    */
  var minCount: String = js.native
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var minLength: String = js.native
  /**
    * @default '{name} cannot be set to \'{ruleValue}\''
    */
  var not: String = js.native
  /**
    * @default '{name} cannot be set to exactly \'{ruleValue}\''
    */
  var notExactly: String = js.native
  /**
    * @default '{name} must be set to a number'
    */
  var number: String = js.native
  /**
    * @default '{name} is not formatted correctly'
    */
  var regExp: String = js.native
  /**
    * @default '{name} must be a valid url'
    */
  var url: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    checked: String,
    contain: String,
    containExactly: String,
    creditCard: String,
    decimal: String,
    different: String,
    doesntContain: String,
    doesntContainExactly: String,
    email: String,
    empty: String,
    exactCount: String,
    exactLength: String,
    integer: String,
    is: String,
    isExactly: String,
    length: String,
    `match`: String,
    maxCount: String,
    maxLength: String,
    minCount: String,
    minLength: String,
    not: String,
    notExactly: String,
    number: String,
    regExp: String,
    url: String
  ): Impl = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], containExactly = containExactly.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], different = different.asInstanceOf[js.Any], doesntContain = doesntContain.asInstanceOf[js.Any], doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], exactCount = exactCount.asInstanceOf[js.Any], exactLength = exactLength.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], isExactly = isExactly.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minCount = minCount.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notExactly = notExactly.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainExactly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containExactly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDifferent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("different")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoesntContain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesntContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoesntContainExactly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesntContainExactly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExactCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExactLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExactly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExactly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotExactly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notExactly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

