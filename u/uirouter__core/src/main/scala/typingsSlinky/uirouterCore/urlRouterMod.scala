package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.Absolute
import typingsSlinky.uirouterCore.anon.Priority
import typingsSlinky.uirouterCore.anon.Replace
import typingsSlinky.uirouterCore.paramsInterfaceMod.RawParams
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.TargetStateDef
import typingsSlinky.uirouterCore.stateMod.TargetState
import typingsSlinky.uirouterCore.urlInterfaceMod.MatchResult
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlParts
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRule
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
import typingsSlinky.uirouterCore.urlRuleMod.UrlRuleFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlRouter", JSImport.Namespace)
@js.native
object urlRouterMod extends js.Object {
  @js.native
  class UrlRouter protected () extends js.Object {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
    /** @deprecated use [[UrlService.interceptDeferred]]*/
    var interceptDeferred: Boolean = js.native
    /** @internal */ var location: js.Any = js.native
    var router: js.Any = js.native
    /** used to create [[UrlRule]] objects for common cases */
    var urlRuleFactory: UrlRuleFactory = js.native
    /** @deprecated use [[UrlService.deferIntercept]]*/
    def deferIntercept(): Unit = js.native
    def deferIntercept(defer: Boolean): Unit = js.native
    /**
      * Builds and returns a URL with interpolated parameters
      *
      * #### Example:
      * ```js
      * matcher = $umf.compile("/about/:person");
      * params = { person: "bob" };
      * $bob = $urlRouter.href(matcher, params);
      * // $bob == "/about/bob";
      * ```
      *
      * @param urlMatcher The [[UrlMatcher]] object which is used as the template of the URL to generate.
      * @param params An object of parameter values to fill the matcher's required parameters.
      * @param options Options object. The options are:
      *
      * - **`absolute`** - {boolean=false},  If true will generate an absolute url, e.g. "http://www.example.com/fullurl".
      *
      * @returns Returns the fully compiled URL, or `null` if `params` fail validation against `urlMatcher`
      */
    def href(urlMatcher: UrlMatcher): String = js.native
    def href(urlMatcher: UrlMatcher, params: js.UndefOr[scala.Nothing], options: Absolute): String = js.native
    def href(urlMatcher: UrlMatcher, params: js.Any): String = js.native
    def href(urlMatcher: UrlMatcher, params: js.Any, options: Absolute): String = js.native
    /** @deprecated use [[UrlRules.initial]]*/
    def initial(handler: String): Unit = js.native
    def initial(handler: TargetStateDef): Unit = js.native
    def initial(handler: TargetState): Unit = js.native
    def initial(handler: UrlRuleHandlerFn): Unit = js.native
    /** @deprecated use [[UrlService.listen]]*/
    def listen(): js.Function = js.native
    def listen(enabled: Boolean): js.Function = js.native
    /** @deprecated use [[UrlService.match]]*/
    def `match`(urlParts: UrlParts): MatchResult = js.native
    /** @deprecated use [[UrlRules.otherwise]]*/
    def otherwise(handler: String): Unit = js.native
    def otherwise(handler: TargetStateDef): Unit = js.native
    def otherwise(handler: TargetState): Unit = js.native
    def otherwise(handler: UrlRuleHandlerFn): Unit = js.native
    /**
      * Internal API.
      *
      * Pushes a new location to the browser history.
      *
      * @internal
      * @param urlMatcher
      * @param params
      * @param options
      */
    def push(urlMatcher: UrlMatcher): Unit = js.native
    def push(urlMatcher: UrlMatcher, params: js.UndefOr[scala.Nothing], options: Replace): Unit = js.native
    def push(urlMatcher: UrlMatcher, params: RawParams): Unit = js.native
    def push(urlMatcher: UrlMatcher, params: RawParams, options: Replace): Unit = js.native
    /** @deprecated use [[UrlRules.removeRule]]*/
    def removeRule(rule: UrlRule): Unit = js.native
    /** @deprecated use [[UrlRules.rule]]*/
    def rule(rule: UrlRule): js.Function = js.native
    /** @deprecated use [[UrlRules.rules]]*/
    def rules(): js.Array[UrlRule] = js.native
    /** @deprecated use [[UrlRules.sort]]*/
    def sort(): Unit = js.native
    def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]): Unit = js.native
    /** @deprecated use [[UrlService.sync]]*/
    def sync(): Unit = js.native
    def sync(evt: js.Any): Unit = js.native
    /** Internal API. */
    def update(): Unit = js.native
    def update(read: Boolean): Unit = js.native
    def when(matcher: String, handler: String): UrlRule = js.native
    def when(matcher: String, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: String, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: String, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
    /** @deprecated use [[UrlRules.when]]*/
    def when(matcher: js.RegExp, handler: String): UrlRule = js.native
    def when(matcher: js.RegExp, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: js.RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: js.RegExp, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: String): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
  }
  
}

