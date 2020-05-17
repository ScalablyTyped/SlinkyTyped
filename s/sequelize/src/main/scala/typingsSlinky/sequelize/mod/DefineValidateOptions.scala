package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sequelize.anon.Args
import typingsSlinky.sequelize.anon.ArgsBoolean
import typingsSlinky.sequelize.anon.ArgsMsg
import typingsSlinky.sequelize.anon.ArgsMsgString
import typingsSlinky.sequelize.anon.ArgsNumber
import typingsSlinky.sequelize.anon.ArgsString
import typingsSlinky.sequelize.anon.MsgString
import typingsSlinky.sequelize.anon.`0`
import typingsSlinky.sequelize.sequelizeNumbers.`3`
import typingsSlinky.sequelize.sequelizeNumbers.`4`
import typingsSlinky.sequelize.sequelizeNumbers.`5`
import typingsSlinky.sequelize.sequelizeStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Model validations, allow you to specify format/content/inheritance validations for each attribute of the
  * model.
  *
  * Validations are automatically run on create, update and save. You can also call validate() to manually
  * validate an instance.
  *
  * The validations are implemented by validator.js.
  */
@js.native
trait DefineValidateOptions
  extends /**
  * custom validations are also possible
  *
  * Implementation notes :
  *
  * We can't enforce any other method to be a function, so :
  *
  * ```typescript
  * [name: string] : ( value : any ) => boolean;
  * ```
  *
  * doesn't work in combination with the properties above
  *
  * @see https://github.com/Microsoft/TypeScript/issues/1889
  */
/* name */ StringDictionary[js.Any] {
  /**
    * force specific substrings
    */
  var contains: js.UndefOr[String | MsgString] = js.native
  /**
    * only allow a specific value
    */
  @JSName("equals")
  var equals_FDefineValidateOptions: js.UndefOr[String | MsgString] = js.native
  /**
    * is: ["^[a-z]+$",'i'] // will only allow letters
    * is: /^[a-z]+$/i      // same as the previous example using real RegExp
    */
  var is: js.UndefOr[String | (js.Array[String | js.RegExp]) | js.RegExp | Args] = js.native
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[String | ArgsString] = js.native
  /**
    * will only allow letters
    */
  var isAlpha: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * will only allow alphanumeric characters, so "_abc" will fail
    */
  var isAlphanumeric: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * only allow arrays
    */
  var isArray: js.UndefOr[Boolean | ArgsBoolean] = js.native
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[String | ArgsString] = js.native
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[Boolean | ArgsBoolean] = js.native
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[Boolean | ArgsBoolean] = js.native
  /**
    * checks for any numbers
    */
  var isDecimal: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for email format (foo@bar.com)
    */
  var isEmail: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for valid floating point numbers
    */
  var isFloat: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for IPv4 (129.89.23.1) or IPv6 format
    */
  var isIP: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for IPv4 (129.89.23.1)
    */
  var isIPv4: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for IPv6 format
    */
  var isIPv6: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * check the value is one of these
    */
  var isIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.native
  /**
    * checks for valid integers
    */
  var isInt: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for lowercase
    */
  var isLowercase: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * only allows null
    */
  var isNull: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * will only allow numbers
    */
  var isNumeric: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * only allow uuids
    */
  var isUUID: js.UndefOr[
    `3` | `4` | `5` | typingsSlinky.sequelize.sequelizeStrings.`3` | typingsSlinky.sequelize.sequelizeStrings.`4` | typingsSlinky.sequelize.sequelizeStrings.`5` | all | ArgsNumber
  ] = js.native
  /**
    * checks for uppercase
    */
  var isUppercase: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * checks for url format (http://foo.com)
    */
  var isUrl: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * only allow values with length between 2 and 10
    */
  var len: js.UndefOr[(js.Tuple2[Double, Double]) | `0`] = js.native
  /**
    * only allow values
    */
  var max: js.UndefOr[Double | ArgsNumber] = js.native
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[Double | ArgsNumber] = js.native
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[String | (js.Array[String | js.RegExp]) | js.RegExp | Args] = js.native
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[js.Array[String] | String | ArgsMsgString] = js.native
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[Boolean | MsgString] = js.native
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.native
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[Boolean | MsgString] = js.native
}

object DefineValidateOptions {
  @scala.inline
  def apply(): DefineValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineValidateOptions]
  }
  @scala.inline
  implicit class DefineValidateOptionsOps[Self <: DefineValidateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: String | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: String | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: String | (js.Array[String | js.RegExp]) | js.RegExp | Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAfter(value: String | ArgsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlpha(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlphanumeric(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlphanumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlphanumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlphanumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArray(value: Boolean | ArgsBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBefore(value: String | ArgsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCreditCard(value: Boolean | ArgsBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDate(value: Boolean | ArgsBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDecimal(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmail(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFloat(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIP(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIP")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIPv4(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIPv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPv4")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIPv6(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIPv6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPv6")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInt(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInt")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLowercase(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNull(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNumeric(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUUID(
      value: `3` | `4` | `5` | typingsSlinky.sequelize.sequelizeStrings.`3` | typingsSlinky.sequelize.sequelizeStrings.`4` | typingsSlinky.sequelize.sequelizeStrings.`5` | all | ArgsNumber
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUUID")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUppercase(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUrl(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLen(value: (js.Tuple2[Double, Double]) | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double | ArgsNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double | ArgsNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNotRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: String | (js.Array[String | js.RegExp]) | js.RegExp | Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withNotContains(value: js.Array[String] | String | ArgsMsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.undefined)
        ret
    }
    @scala.inline
    def withNotEmpty(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withNotIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotNull(value: Boolean | MsgString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.undefined)
        ret
    }
  }
  
}

