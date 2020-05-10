package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackStrings.javascriptSlashauto
import typingsSlinky.webpack.webpackStrings.javascriptSlashdynamic
import typingsSlinky.webpack.webpackStrings.javascriptSlashesm
import typingsSlinky.webpack.webpackStrings.json
import typingsSlinky.webpack.webpackStrings.post
import typingsSlinky.webpack.webpackStrings.pre
import typingsSlinky.webpack.webpackStrings.webassemblySlashexperimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleSetRule extends js.Object {
  /**
    * Match the child compiler name
    */
  var compiler: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Enforce this rule as pre or post step
    */
  var enforce: js.UndefOr[pre | post] = js.native
  /**
    * Shortcut for resource.exclude
    */
  var exclude: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Shortcut for resource.include
    */
  var include: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Match the issuer of the module (The module pointing to this module)
    */
  var issuer: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Shortcut for use.loader
    */
  var loader: js.UndefOr[RuleSetUse] = js.native
  /**
    * Shortcut for use.loader
    */
  var loaders: js.UndefOr[RuleSetUse] = js.native
  /**
    * Only execute the first matching rule in this array
    */
  var oneOf: js.UndefOr[js.Array[RuleSetRule]] = js.native
  /**
    * Shortcut for use.options
    */
  var options: js.UndefOr[RuleSetQuery] = js.native
  /**
    * Options for parsing
    */
  var parser: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Shortcut for use.query
    */
  var query: js.UndefOr[RuleSetQuery] = js.native
  /**
    * Options for the resolver
    */
  var resolve: js.UndefOr[Resolve] = js.native
  /**
    * Match the resource path of the module
    */
  var resource: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Match the resource query of the module
    */
  var resourceQuery: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Match and execute these rules when this rule is matched
    */
  var rules: js.UndefOr[js.Array[RuleSetRule]] = js.native
  /**
    * Flags a module as with or without side effects
    */
  var sideEffects: js.UndefOr[Boolean] = js.native
  /**
    * Shortcut for resource.test
    */
  var test: js.UndefOr[RuleSetCondition] = js.native
  /**
    * Module type to use for the module
    */
  var `type`: js.UndefOr[
    javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
  ] = js.native
  /**
    * Modifiers applied to the module when rule is matched
    */
  var use: js.UndefOr[RuleSetUse] = js.native
}

object RuleSetRule {
  @scala.inline
  def apply(): RuleSetRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSetRule]
  }
  @scala.inline
  implicit class RuleSetRuleOps[Self <: RuleSetRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilerFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompilerRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiler(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforce(value: pre | post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIssuerRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderFunction1(value: /* data */ js.Any => js.Array[RuleSetUseItem] | RuleSetLoader | RuleSetUseItem | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoader(value: RuleSetUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadersFunction1(value: /* data */ js.Any => js.Array[RuleSetUseItem] | RuleSetLoader | RuleSetUseItem | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoaders(value: RuleSetUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(js.undefined)
        ret
    }
    @scala.inline
    def withOneOf(value: js.Array[RuleSetRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: RuleSetQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: RuleSetQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: Resolve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResourceRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceQueryFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResourceQueryRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceQuery(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[RuleSetRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withTestFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: RuleSetCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
    ): Self = {
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
    def withUseFunction1(value: /* data */ js.Any => js.Array[RuleSetUseItem] | RuleSetLoader | RuleSetUseItem | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUse(value: RuleSetUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

