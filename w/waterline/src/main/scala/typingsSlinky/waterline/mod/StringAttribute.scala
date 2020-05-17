package typingsSlinky.waterline.mod

import typingsSlinky.waterline.waterlineStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined waterline.waterline.BaseAttribute<string> & {  type  :'string'} */
@js.native
trait StringAttribute extends Attribute {
  var after: js.UndefOr[AttributeValidation[String]] = js.native
  var alpha: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var alphanumeric: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var array: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var before: js.UndefOr[AttributeValidation[String]] = js.native
  var boolean: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var columnName: js.UndefOr[String] = js.native
  var contains: js.UndefOr[AttributeValidation[String]] = js.native
  var creditcard: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var date: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var decimal: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var defaultsTo: js.UndefOr[String | DefaultsToFn[String]] = js.native
  var email: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var empty: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var enum: js.UndefOr[js.Array[String]] = js.native
  @JSName("equals")
  var equals_FStringAttribute: js.UndefOr[AttributeValidation[_]] = js.native
  var falsey: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var finite: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var float: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var hexColor: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var hexadecimal: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var in: js.UndefOr[AttributeValidation[js.Array[String]]] = js.native
  var index: js.UndefOr[Boolean] = js.native
  var int: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var integer: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var ip: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var ipv4: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var ipv6: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var is: js.UndefOr[AttributeValidation[js.RegExp]] = js.native
  var len: js.UndefOr[AttributeValidation[Double]] = js.native
  var lowercase: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var max: js.UndefOr[AttributeValidation[Double]] = js.native
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.native
  var min: js.UndefOr[AttributeValidation[Double]] = js.native
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.native
  var not: js.UndefOr[AttributeValidation[js.RegExp]] = js.native
  var notContains: js.UndefOr[AttributeValidation[String]] = js.native
  var notEmpty: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var notIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.native
  var notNull: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var notRegex: js.UndefOr[AttributeValidation[js.RegExp]] = js.native
  var `null`: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var number: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var numeric: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var primaryKey: js.UndefOr[Boolean] = js.native
  var regex: js.UndefOr[AttributeValidation[js.RegExp]] = js.native
  var required: js.UndefOr[AttributeValidation[Boolean] with Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var string: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var truthy: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var `type`: js.UndefOr[String with string] = js.native
  var undefined: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var unique: js.UndefOr[Boolean] = js.native
  var uppercase: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var url: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var urlish: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var uuid: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var uuidv3: js.UndefOr[AttributeValidation[Boolean]] = js.native
  var uuidv4: js.UndefOr[AttributeValidation[Boolean]] = js.native
}

object StringAttribute {
  @scala.inline
  def apply(): StringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringAttribute]
  }
  @scala.inline
  implicit class StringAttributeOps[Self <: StringAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFunction1(value: /* cb */ js.Function1[String, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAfter(value: AttributeValidation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlphaFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAlpha(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphanumericFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlphanumericFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAlphanumeric(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphanumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArrayFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArray(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFunction1(value: /* cb */ js.Function1[String, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBefore(value: AttributeValidation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBooleanFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBoolean(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsFunction1(value: /* cb */ js.Function1[String, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: AttributeValidation[String]): Self = {
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
    def withCreditcardFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditcard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreditcardFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditcard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreditcard(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditcard")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDate(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecimalFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDecimal(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultsToFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultsTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultsTo(value: String | DefaultsToFn[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmailFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmail(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withEnum(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualsFunction1(value: /* cb */ js.Function1[_, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualsFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquals(value: AttributeValidation[_]): Self = {
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
    def withFalseyFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFalseyFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFalsey(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalsey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsey")(js.undefined)
        ret
    }
    @scala.inline
    def withFiniteFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFiniteFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFinite(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFloatFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFloat(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withHexColorFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHexColorFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHexColor(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHexadecimalFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHexadecimalFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHexadecimal(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexadecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInFunction0(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIn(value: AttributeValidation[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIntFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInt(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntegerFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInteger(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.undefined)
        ret
    }
    @scala.inline
    def withIpFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIpFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIp(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4Function1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIpv4Function0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIpv4(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Function1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIpv6Function0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIpv6(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFunction1(value: /* cb */ js.Function1[js.RegExp, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFunction0(value: () => js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs(value: AttributeValidation[js.RegExp]): Self = {
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
    def withLenFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLenFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLen(value: AttributeValidation[Double]): Self = {
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
    def withLowercaseFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLowercaseFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLowercase(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: AttributeValidation[Double]): Self = {
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
    def withMaxLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxLengthFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxLength(value: AttributeValidation[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMin(value: AttributeValidation[Double]): Self = {
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
    def withMinLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinLengthFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinLength(value: AttributeValidation[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFunction1(value: /* cb */ js.Function1[js.RegExp, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFunction0(value: () => js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNot(value: AttributeValidation[js.RegExp]): Self = {
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
    def withNotContainsFunction1(value: /* cb */ js.Function1[String, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotContainsFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotContains(value: AttributeValidation[String]): Self = {
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
    def withNotEmptyFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotEmptyFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotEmpty(value: AttributeValidation[Boolean]): Self = {
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
    def withNotInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotInFunction0(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotIn(value: AttributeValidation[js.Array[String]]): Self = {
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
    def withNotNullFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotNullFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotNull(value: AttributeValidation[Boolean]): Self = {
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
    @scala.inline
    def withNotRegexFunction1(value: /* cb */ js.Function1[js.RegExp, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotRegexRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotRegexFunction0(value: () => js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotRegex(value: AttributeValidation[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNullFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNull(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumberFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumber(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumericFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumeric(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexFunction1(value: /* cb */ js.Function1[js.RegExp, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegexRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexFunction0(value: () => js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegex(value: AttributeValidation[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: AttributeValidation[Boolean] with Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withString(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withTruthyFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTruthyFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTruthy(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruthy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthy")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String with string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUndefinedFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndefinedFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUndefined(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercaseFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUppercaseFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUppercase(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrlFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlishFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrlishFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrlish(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlish")(js.undefined)
        ret
    }
    @scala.inline
    def withUuidFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUuidFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUuid(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withUuidv3Function1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv3")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUuidv3Function0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv3")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUuidv3(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuidv3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv3")(js.undefined)
        ret
    }
    @scala.inline
    def withUuidv4Function1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv4")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUuidv4Function0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv4")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUuidv4(value: AttributeValidation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuidv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidv4")(js.undefined)
        ret
    }
  }
  
}

