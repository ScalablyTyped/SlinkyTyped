package typingsSlinky.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var assumeAdditional: js.UndefOr[Boolean] = js.native
  var asyncTimeout: js.UndefOr[Double] = js.native
  var breakOnFirstError: js.UndefOr[Boolean] = js.native
  var customValidator: js.UndefOr[js.Function3[/* report */ Report, /* schema */ js.Any, /* json */ js.Any, Unit]] = js.native
  var forceAdditional: js.UndefOr[Boolean] = js.native
  var forceItems: js.UndefOr[Boolean] = js.native
  var forceMaxItems: js.UndefOr[Boolean] = js.native
  var forceMaxLength: js.UndefOr[Boolean] = js.native
  var forceMinItems: js.UndefOr[Boolean] = js.native
  var forceMinLength: js.UndefOr[Boolean] = js.native
  var forceProperties: js.UndefOr[Boolean] = js.native
  var ignoreUnknownFormats: js.UndefOr[Boolean] = js.native
  var ignoreUnresolvableReferences: js.UndefOr[Boolean] = js.native
  var noEmptyArrays: js.UndefOr[Boolean] = js.native
  var noEmptyStrings: js.UndefOr[Boolean] = js.native
  var noExtraKeywords: js.UndefOr[Boolean] = js.native
  var noTypeless: js.UndefOr[Boolean] = js.native
  var pedanticCheck: js.UndefOr[Boolean] = js.native
  var reportPathAsArray: js.UndefOr[Boolean] = js.native
  var strictMode: js.UndefOr[Boolean] = js.native
  var strictUris: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeAdditional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeAdditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeAdditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeAdditional")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakOnFirstError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakOnFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakOnFirstError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakOnFirstError")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomValidator(value: (/* report */ Report, /* schema */ js.Any, /* json */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customValidator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAdditional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAdditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAdditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAdditional")(js.undefined)
        ret
    }
    @scala.inline
    def withForceItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceItems")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMaxItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMaxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMaxLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMinItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMinItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMinItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMinItems")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMinLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMinLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMinLength")(js.undefined)
        ret
    }
    @scala.inline
    def withForceProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnknownFormats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnknownFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnresolvableReferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnresolvableReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnresolvableReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnresolvableReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmptyArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmptyArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmptyArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmptyArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmptyStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmptyStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmptyStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmptyStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExtraKeywords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExtraKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExtraKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExtraKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTypeless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTypeless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTypeless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTypeless")(js.undefined)
        ret
    }
    @scala.inline
    def withPedanticCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedanticCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPedanticCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedanticCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withReportPathAsArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPathAsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportPathAsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPathAsArray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictUris(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictUris")(js.undefined)
        ret
    }
  }
  
}

