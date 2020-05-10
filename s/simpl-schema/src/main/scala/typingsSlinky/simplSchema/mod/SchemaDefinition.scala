package typingsSlinky.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinition extends js.Object {
  var allowedValues: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  var autoValue: js.UndefOr[js.Function0[_]] = js.native
  var blackbox: js.UndefOr[Boolean] = js.native
  /**
    * For custom validation function. If you use an arrow function the context
    * for "this" will not be available. Use "custom: function() { return
    * something(this.value); }" instead.
    */
  var custom: js.UndefOr[
    js.ThisFunction0[
      /* this */ CustomValidationContext, 
      js.UndefOr[String | SimpleSchemaValidationError]
    ]
  ] = js.native
  var decimal: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var exclusiveMax: js.UndefOr[Boolean] = js.native
  var exclusiveMin: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | js.Function0[String]] = js.native
  var max: js.UndefOr[Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])] = js.native
  var maxCount: js.UndefOr[Double | js.Function0[Double]] = js.native
  var min: js.UndefOr[Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])] = js.native
  var minCount: js.UndefOr[Double | js.Function0[Double]] = js.native
  var optional: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  var regEx: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var `type`: js.Any = js.native
}

object SchemaDefinition {
  @scala.inline
  def apply(`type`: js.Any): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinition]
  }
  @scala.inline
  implicit class SchemaDefinitionOps[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedValuesFunction0(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllowedValues(value: js.Array[_] | js.Function0[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAutoValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(
      value: js.ThisFunction0[
          /* this */ CustomValidationContext, 
          js.UndefOr[String | SimpleSchemaValidationError]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimal(value: Boolean): Self = {
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
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMax")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMin")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLabel(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFunction0(value: () => Double | Boolean | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])): Self = {
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
    def withMaxCountFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxCount(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFunction0(value: () => Double | Boolean | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMin(value: Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])): Self = {
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
    def withMinCountFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinCount(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptional(value: Boolean | js.Function0[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegEx(value: js.RegExp | js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegEx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regEx")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

