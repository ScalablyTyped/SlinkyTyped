package typingsSlinky.uglifyJs.mod

import typingsSlinky.uglifyJs.uglifyJsStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressOptions extends js.Object {
  /**
    * Replace `arguments[index]` with function parameter name whenever possible.
    * @default true
    */
  var arguments: js.UndefOr[Boolean] = js.native
  /**
    * Apply optimizations to assignment expressions
    * @default ture
    */
  var assignments: js.UndefOr[Boolean] = js.native
  /**
    * Various optimizations for boolean context, for example `!!a ? b : c → a ? b : c`
    * @default true
    */
  var booleans: js.UndefOr[Boolean] = js.native
  /**
    * Collapse single-use non-constant variables, side effects permitting.
    * @default true
    */
  var collapse_vars: js.UndefOr[Boolean] = js.native
  /**
    * Apply certain optimizations to binary nodes, e.g. `!(a <= b) → a > b,` attempts to negate binary nodes, e.g. `a = !b && !c && !d && !e → a=!(b||c||d||e)` etc
    * @default true
    */
  var comparisons: js.UndefOr[Boolean] = js.native
  /**
    * Apply optimizations for `if-s` and conditional expressions.
    * @default true
    */
  var conditionals: js.UndefOr[Boolean] = js.native
  /**
    * Remove unreachable code
    * @default true
    */
  var dead_code: js.UndefOr[Boolean] = js.native
  /**
    * remove redundant or non-standard directives
    * @default true
    */
  var directives: js.UndefOr[Boolean] = js.native
  /**
    * Pass `true` to discard calls to console.* functions.
    * If you wish to drop a specific function call such as `console.info` and/or retain side effects from function
    * arguments after dropping the function call then use `pure_funcs` instead.
    * @default true
    */
  var drop_console: js.UndefOr[Boolean] = js.native
  /**
    * Remove `debugger;` statements
    * @default true
    */
  var drop_debugger: js.UndefOr[Boolean] = js.native
  /**
    * Attempt to evaluate constant expressions
    * @default true
    */
  var evaluate: js.UndefOr[Boolean] = js.native
  /**
    * Pass `true` to preserve completion values from terminal statements without `return`, e.g. in bookmarklets.
    * @default false
    */
  var expression: js.UndefOr[Boolean] = js.native
  /**
    * convert declarations from varto function whenever possible
    * @default true
    */
  var functions: js.UndefOr[Boolean] = js.native
  /**
    * @default {}
    */
  var global_defs: js.UndefOr[js.Object] = js.native
  /**
    * hoist function declarations
    * @default false
    */
  var hoist_funs: js.UndefOr[Boolean] = js.native
  /**
    * Hoist properties from constant object and array literals into regular variables subject to a set of constraints.
    * For example: `var o={p:1, q:2}; f(o.p, o.q);` is converted to `f(1, 2);`. Note: `hoist_props` works best with mangle enabled,
    * the compress option passes set to 2 or higher, and the compress option toplevel enabled.
    * @default true
    */
  var hoist_props: js.UndefOr[Boolean] = js.native
  /**
    * Hoist var declarations (this is `false` by default because it seems to increase the size of the output in general)
    * @default false
    */
  var hoist_vars: js.UndefOr[Boolean] = js.native
  /**
    * Optimizations for if/return and if/continue
    * @default true
    */
  var if_return: js.UndefOr[Boolean] = js.native
  /**
    * Inline calls to function with simple/return statement
    * - false -- same as `Disabled`
    * - `Disabled` -- disabled inlining
    * - `SimpleFunctions` -- inline simple functions
    * - `WithArguments` -- inline functions with arguments
    * - `WithArgumentsAndVariables` -- inline functions with arguments and variables
    * - true -- same as `WithArgumentsAndVariables`
    * @default true
    */
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.native
  /**
    * join consecutive `var` statements
    * @default true
    */
  var join_vars: js.UndefOr[Boolean] = js.native
  /**
    * Prevents the compressor from discarding unused function arguments.
    * You need this for code which relies on `Function.length`
    * @default 'strict'
    */
  var keep_fargs: js.UndefOr[strict | Boolean] = js.native
  /**
    * Pass true to prevent the compressor from discarding function names.
    * Useful for code relying on `Function.prototype.name`.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  /**
    * Pass true to prevent Infinity from being compressed into `1/0`, which may cause performance issues on `Chrome`
    * @default false
    */
  var keep_infinity: js.UndefOr[Boolean] = js.native
  /**
    * Optimizations for `do`, `while` and `for` loops when we can statically determine the condition.
    * @default true
    */
  var loops: js.UndefOr[Boolean] = js.native
  /**
    * negate `Immediately-Called Function Expressions` where the return value is discarded,
    * to avoid the parens that the code generator would insert.
    * @default true
    */
  var negate_iife: js.UndefOr[Boolean] = js.native
  /**
    * compact duplicate keys in object literals
    * @default true
    */
  var objects: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of times to run compress.
    * In some cases more than one pass leads to further compressed code.
    * Keep in mind more passes will take more time.
    * @default 1
    */
  var passes: js.UndefOr[Double] = js.native
  /**
    * Rewrite property access using the dot notation, for example `foo["bar"]` to `foo.bar`
    * @default true
    */
  var properties: js.UndefOr[Boolean] = js.native
  /**
    * An array of names and UglifyJS will assume that those functions do not produce side effects.
    * DANGER: will not check if the name is redefined in scope.
    * An example case here, for instance `var q = Math.floor(a/b)`.
    * If variable q is not used elsewhere, UglifyJS will drop it, but will still keep the `Math.floor(a/b)`,
    * not knowing what it does. You can pass `pure_funcs: [ 'Math.floor' ]` to let it know that this function
    * won't produce any side effect, in which case the whole statement would get discarded. The current
    * implementation adds some overhead (compression will be slower).
    * @default null
    */
  var pure_funcs: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * If you pass true for this, UglifyJS will assume that object property access
    * (e.g. foo.bar or foo["bar"]) doesn't have any side effects.
    * Specify "strict" to treat foo.bar as side-effect-free only when foo is certain to not throw,
    * i.e. not null or undefine
    * @default 'strict'
    */
  var pure_getters: js.UndefOr[Boolean | strict] = js.native
  /**
    * Allows single-use functions to be inlined as function expressions when permissible allowing further optimization.
    * Enabled by default. Option depends on reduce_vars being enabled. Some code runs faster in the Chrome V8 engine if
    * this option is disabled. Does not negatively impact other major browsers.
    * @default true
    */
  var reduce_funcs: js.UndefOr[Boolean] = js.native
  /**
    * Improve optimization on variables assigned with and used as constant values.
    * @default true
    */
  var reduce_vars: js.UndefOr[Boolean] = js.native
  /**
    * join consecutive simple statements using the comma operator.
    * May be set to a positive integer to specify the maximum number of
    * consecutive comma sequences that will be generated.
    * If this option is set to true then the default sequences limit is 200.
    * Set option to false or 0 to disable. The smallest sequences length is 2.
    * A sequences value of 1 is grandfathered to be equivalent to true and as such means 200.
    * On rare occasions the default sequences limit leads to very slow compress times in which case
    * a value of 20 or less is recommended
    * @default true
    */
  var sequences: js.UndefOr[Boolean] = js.native
  /**
    * Pass false to disable potentially dropping functions marked as "pure".
    * @default true
    */
  var side_effects: js.UndefOr[Boolean] = js.native
  /**
    * compact string concatenations
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.native
  /**
    * De-duplicate and remove unreachable `switch` branches.
    * @default true
    */
  var switches: js.UndefOr[Boolean] = js.native
  /**
    * Prevent specific toplevel functions and variables from unused removal
    * (can be array, comma-separated, RegExp or function. Implies toplevel)
    * @default null
    */
  var top_retain: js.UndefOr[Boolean | Null] = js.native
  /**
    * Drop unreferenced functions ("funcs") and/or variables ("vars") in the top level scope (false by default,
    * true to drop both unreferenced functions and variables)
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.native
  /**
    * Transforms typeof foo == "undefined" into foo === void 0.
    * Note: recommend to set this value to false for IE10 and earlier versions due to known issues
    * @default true
    */
  var typeofs: js.UndefOr[Boolean] = js.native
  /**
    * apply "unsafe" transformations (discussion below)
    * @default false
    */
  var unsafe: js.UndefOr[Boolean] = js.native
  /**
    * Compress and mangle `Function(args, code)` when both args and code are string literals.
    * @default false
    */
  var unsafe_Function: js.UndefOr[Boolean] = js.native
  /**
    * Compress expressions like a `<= b` assuming none of the operands can be (coerced to) `NaN`.
    * @default false
    */
  var unsafe_comps: js.UndefOr[Boolean] = js.native
  /**
    * Optimize numerical expressions like `2 * x * 3` into `6 * x`,
    * which may give imprecise floating point results.
    * @default false
    */
  var unsafe_math: js.UndefOr[Boolean] = js.native
  /**
    * Optimize expressions like `Array.prototype.slice.call(a)` into `[].slice.call(a)`
    * @default false
    */
  var unsafe_proto: js.UndefOr[Boolean] = js.native
  /**
    * Enable substitutions of variables with `RegExp` values the same way as if they are constants.
    * @default false
    */
  var unsafe_regexp: js.UndefOr[Boolean] = js.native
  /**
    * substitute void 0 if there is a variable named undefined in scope
    * (variable name will be mangled, typically reduced to a single character)
    * @default false
    */
  var unsafe_undefined: js.UndefOr[Boolean] = js.native
  /**
    * drop unreferenced functions and variables
    * (simple direct variable assignments do not count as references unless set to "keep_assign")
    * @default true
    */
  var unused: js.UndefOr[Boolean] = js.native
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
    def withAssignments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
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
    def withFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
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
    def withKeep_fargs(value: strict | Boolean): Self = {
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
    def withKeep_fnames(value: Boolean): Self = {
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
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
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
    def withPure_funcsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure_funcs")(null)
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
    def withSequences(value: Boolean): Self = {
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
    def withStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
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
    def withTop_retain(value: Boolean): Self = {
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
  }
  
}

