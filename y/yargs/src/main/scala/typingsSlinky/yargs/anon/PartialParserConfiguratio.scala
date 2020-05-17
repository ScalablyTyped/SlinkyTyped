package typingsSlinky.yargs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yargs.yargs.ParserConfigurationOptions> */
@js.native
trait PartialParserConfiguratio extends js.Object {
  var `boolean-negation`: js.UndefOr[scala.Boolean] = js.native
  var `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.native
  var `combine-arrays`: js.UndefOr[scala.Boolean] = js.native
  var `dot-notation`: js.UndefOr[scala.Boolean] = js.native
  var `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.native
  var `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.native
  var `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.native
  var `negation-prefix`: js.UndefOr[java.lang.String] = js.native
  var `parse-numbers`: js.UndefOr[scala.Boolean] = js.native
  var `populate--`: js.UndefOr[scala.Boolean] = js.native
  var `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.native
  var `short-option-groups`: js.UndefOr[scala.Boolean] = js.native
  var `sort-commands`: js.UndefOr[scala.Boolean] = js.native
  var `strip-aliased`: js.UndefOr[scala.Boolean] = js.native
  var `strip-dashed`: js.UndefOr[scala.Boolean] = js.native
  var `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.native
}

object PartialParserConfiguratio {
  @scala.inline
  def apply(): PartialParserConfiguratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParserConfiguratio]
  }
  @scala.inline
  implicit class PartialParserConfiguratioOps[Self <: PartialParserConfiguratio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBoolean-negation`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean-negation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBoolean-negation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean-negation")(js.undefined)
        ret
    }
    @scala.inline
    def `withCamel-case-expansion`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camel-case-expansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCamel-case-expansion`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camel-case-expansion")(js.undefined)
        ret
    }
    @scala.inline
    def `withCombine-arrays`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine-arrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCombine-arrays`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine-arrays")(js.undefined)
        ret
    }
    @scala.inline
    def `withDot-notation`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot-notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDot-notation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot-notation")(js.undefined)
        ret
    }
    @scala.inline
    def `withDuplicate-arguments-array`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate-arguments-array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDuplicate-arguments-array`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate-arguments-array")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlatten-duplicate-arrays`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten-duplicate-arrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlatten-duplicate-arrays`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten-duplicate-arrays")(js.undefined)
        ret
    }
    @scala.inline
    def `withHalt-at-non-option`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halt-at-non-option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHalt-at-non-option`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halt-at-non-option")(js.undefined)
        ret
    }
    @scala.inline
    def `withNegation-prefix`(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation-prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNegation-prefix`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation-prefix")(js.undefined)
        ret
    }
    @scala.inline
    def `withParse-numbers`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse-numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutParse-numbers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse-numbers")(js.undefined)
        ret
    }
    @scala.inline
    def `withPopulate--`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate--")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPopulate--`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate--")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-placeholder-key`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-placeholder-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSet-placeholder-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-placeholder-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withShort-option-groups`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-option-groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShort-option-groups`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-option-groups")(js.undefined)
        ret
    }
    @scala.inline
    def `withSort-commands`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort-commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSort-commands`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort-commands")(js.undefined)
        ret
    }
    @scala.inline
    def `withStrip-aliased`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-aliased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStrip-aliased`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-aliased")(js.undefined)
        ret
    }
    @scala.inline
    def `withStrip-dashed`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-dashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStrip-dashed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-dashed")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnknown-options-as-args`(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown-options-as-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnknown-options-as-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown-options-as-args")(js.undefined)
        ret
    }
  }
  
}

