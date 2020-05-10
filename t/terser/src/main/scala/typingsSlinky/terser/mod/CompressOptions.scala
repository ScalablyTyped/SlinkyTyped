package typingsSlinky.terser.mod

import typingsSlinky.terser.terserStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressOptions extends js.Object {
  var arguments: js.UndefOr[Boolean] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var booleans: js.UndefOr[Boolean] = js.native
  var booleans_as_integers: js.UndefOr[Boolean] = js.native
  var collapse_vars: js.UndefOr[Boolean] = js.native
  var comparisons: js.UndefOr[Boolean] = js.native
  var computed_props: js.UndefOr[Boolean] = js.native
  var conditionals: js.UndefOr[Boolean] = js.native
  var dead_code: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var directives: js.UndefOr[Boolean] = js.native
  var drop_console: js.UndefOr[Boolean] = js.native
  var drop_debugger: js.UndefOr[Boolean] = js.native
  var ecma: js.UndefOr[ECMA] = js.native
  var evaluate: js.UndefOr[Boolean] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var global_defs: js.UndefOr[js.Object] = js.native
  var hoist_funs: js.UndefOr[Boolean] = js.native
  var hoist_props: js.UndefOr[Boolean] = js.native
  var hoist_vars: js.UndefOr[Boolean] = js.native
  var ie8: js.UndefOr[Boolean] = js.native
  var if_return: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.native
  var join_vars: js.UndefOr[Boolean] = js.native
  var keep_classnames: js.UndefOr[Boolean | js.RegExp] = js.native
  var keep_fargs: js.UndefOr[Boolean] = js.native
  var keep_fnames: js.UndefOr[Boolean | js.RegExp] = js.native
  var keep_infinity: js.UndefOr[Boolean] = js.native
  var loops: js.UndefOr[Boolean] = js.native
  var module: js.UndefOr[Boolean] = js.native
  var negate_iife: js.UndefOr[Boolean] = js.native
  var passes: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[Boolean] = js.native
  var pure_funcs: js.UndefOr[js.Array[String]] = js.native
  var pure_getters: js.UndefOr[Boolean | strict] = js.native
  var reduce_funcs: js.UndefOr[Boolean] = js.native
  var reduce_vars: js.UndefOr[Boolean] = js.native
  var sequences: js.UndefOr[Boolean | Double] = js.native
  var side_effects: js.UndefOr[Boolean] = js.native
  var switches: js.UndefOr[Boolean] = js.native
  var top_retain: js.UndefOr[Null | String | js.Array[String] | js.RegExp] = js.native
  var toplevel: js.UndefOr[Boolean] = js.native
  var typeofs: js.UndefOr[Boolean] = js.native
  var unsafe: js.UndefOr[Boolean] = js.native
  var unsafe_Function: js.UndefOr[Boolean] = js.native
  var unsafe_arrows: js.UndefOr[Boolean] = js.native
  var unsafe_comps: js.UndefOr[Boolean] = js.native
  var unsafe_math: js.UndefOr[Boolean] = js.native
  var unsafe_methods: js.UndefOr[Boolean] = js.native
  var unsafe_proto: js.UndefOr[Boolean] = js.native
  var unsafe_regexp: js.UndefOr[Boolean] = js.native
  var unsafe_symbols: js.UndefOr[Boolean] = js.native
  var unsafe_undefined: js.UndefOr[Boolean] = js.native
  var unused: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
}

object CompressOptions {
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleans_as_integers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans_as_integers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleans_as_integers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans_as_integers")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisons")(js.undefined)
        ret
    }
    @scala.inline
    def withComputed_props(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed_props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputed_props: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed_props")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionals")(js.undefined)
        ret
    }
    @scala.inline
    def withDead_code(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dead_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDead_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dead_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop_console(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop_console: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_console")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop_debugger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_debugger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop_debugger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_debugger")(js.undefined)
        ret
    }
    @scala.inline
    def withEcma(value: ECMA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecma")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal_defs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal_defs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_defs")(js.undefined)
        ret
    }
    @scala.inline
    def withHoist_funs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_funs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoist_funs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_funs")(js.undefined)
        ret
    }
    @scala.inline
    def withHoist_props(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoist_props: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_props")(js.undefined)
        ret
    }
    @scala.inline
    def withHoist_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoist_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withIe8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(js.undefined)
        ret
    }
    @scala.inline
    def withIf_return(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIf_return: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_return")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean | InlineFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_classnamesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_classnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeep_classnames(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_classnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_classnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_classnames")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_fargs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_fargs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fargs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_fnamesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeep_fnames(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_fnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_infinity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_infinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_infinity")(js.undefined)
        ret
    }
    @scala.inline
    def withLoops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withNegate_iife(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate_iife")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegate_iife: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate_iife")(js.undefined)
        ret
    }
    @scala.inline
    def withPasses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withPure_funcs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure_funcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure_funcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure_funcs")(js.undefined)
        ret
    }
    @scala.inline
    def withPure_getters(value: Boolean | strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure_getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure_getters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure_getters")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce_funcs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce_funcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce_funcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce_funcs")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withSequences(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequences")(js.undefined)
        ret
    }
    @scala.inline
    def withSide_effects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side_effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide_effects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side_effects")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switches")(js.undefined)
        ret
    }
    @scala.inline
    def withTop_retainRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop_retain(value: String | js.Array[String] | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_retain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_retain")(js.undefined)
        ret
    }
    @scala.inline
    def withTop_retainNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_retain")(null)
        ret
    }
    @scala.inline
    def withToplevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToplevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeofs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeofs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeofs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeofs")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_Function(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_Function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_Function: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_Function")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_arrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_arrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_comps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_comps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_comps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_comps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_math(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_math")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_math: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_math")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_methods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_methods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_methods")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_proto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_proto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_proto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_proto")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_regexp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_regexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_regexp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_symbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_symbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_symbols")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe_undefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_undefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe_undefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe_undefined")(js.undefined)
        ret
    }
    @scala.inline
    def withUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unused")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

