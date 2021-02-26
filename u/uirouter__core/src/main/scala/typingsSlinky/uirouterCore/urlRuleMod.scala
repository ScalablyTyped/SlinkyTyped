package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.urlInterfaceMod.MatcherUrlRule
import typingsSlinky.uirouterCore.urlInterfaceMod.RegExpRule
import typingsSlinky.uirouterCore.urlInterfaceMod.StateRule
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRule
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlRuleMod {
  
  @JSImport("@uirouter/core/lib/url/urlRule", "BaseUrlRule")
  @js.native
  class BaseUrlRule protected () extends UrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory")
  @js.native
  class UrlRuleFactory protected () extends StObject {
    def this(router: UIRouter) = this()
    
    def compile(str: String): UrlMatcher = js.native
    
    def create(what: String): UrlRule = js.native
    def create(what: String, handler: String): UrlRule = js.native
    def create(what: String, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: js.RegExp): UrlRule = js.native
    def create(what: js.RegExp, handler: String): UrlRule = js.native
    def create(what: js.RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: StateDeclaration): UrlRule = js.native
    def create(what: StateDeclaration, handler: String): UrlRule = js.native
    def create(what: StateDeclaration, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: StateObject): UrlRule = js.native
    def create(what: StateObject, handler: String): UrlRule = js.native
    def create(what: StateObject, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: UrlRuleMatchFn): UrlRule = js.native
    def create(what: UrlRuleMatchFn, handler: String): UrlRule = js.native
    def create(what: UrlRuleMatchFn, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: UrlMatcher): UrlRule = js.native
    def create(what: UrlMatcher, handler: String): UrlRule = js.native
    def create(what: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
    
    /**
      * A UrlRule which matches based on a regular expression
      *
      * The `handler` may be either a [[UrlRuleHandlerFn]] or a string.
      *
      * ## Handler as a function
      *
      * If `handler` is a function, the function is invoked with:
      *
      * - regexp match array (from `regexp`)
      * - url: the current Url ([[UrlParts]])
      * - router: the router object ([[UIRouter]])
      *
      * #### Example:
      * ```js
      * var rule = factory.fromRegExp(/^\/foo\/(bar|baz)$/, match => "/home/" + match[1])
      * var match = rule.match('/foo/bar'); // results in [ '/foo/bar', 'bar' ]
      * var result = rule.handler(match); // '/home/bar'
      * ```
      *
      * ## Handler as string
      *
      * If `handler` is a string, the url is *replaced by the string* when the Rule is invoked.
      * The string is first interpolated using `string.replace()` style pattern.
      *
      * #### Example:
      * ```js
      * var rule = factory.fromRegExp(/^\/foo\/(bar|baz)$/, "/home/$1")
      * var match = rule.match('/foo/bar'); // results in [ '/foo/bar', 'bar' ]
      * var result = rule.handler(match); // '/home/bar'
      * ```
      */
    def fromRegExp(regexp: js.RegExp, handler: String): RegExpRule = js.native
    def fromRegExp(regexp: js.RegExp, handler: UrlRuleHandlerFn): RegExpRule = js.native
    
    def fromState(stateOrDecl: StateDeclaration, router: UIRouter): StateRule = js.native
    /**
      * A UrlRule which matches a state by its url
      *
      * #### Example:
      * ```js
      * var rule = factory.fromState($state.get('foo'), router);
      * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
      * var result = rule.handler(match);
      * // Starts a transition to 'foo' with params: { fooId: '123', barId: '456' }
      * ```
      */
    def fromState(stateOrDecl: StateObject, router: UIRouter): StateRule = js.native
    
    /**
      * A UrlRule which matches based on a UrlMatcher
      *
      * The `handler` may be either a `string`, a [[UrlRuleHandlerFn]] or another [[UrlMatcher]]
      *
      * ## Handler as a function
      *
      * If `handler` is a function, the function is invoked with:
      *
      * - matched parameter values ([[RawParams]] from [[UrlMatcher.exec]])
      * - url: the current Url ([[UrlParts]])
      * - router: the router object ([[UIRouter]])
      *
      * #### Example:
      * ```js
      * var urlMatcher = $umf.compile("/foo/:fooId/:barId");
      * var rule = factory.fromUrlMatcher(urlMatcher, match => "/home/" + match.fooId + "/" + match.barId);
      * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
      * var result = rule.handler(match); // '/home/123/456'
      * ```
      *
      * ## Handler as UrlMatcher
      *
      * If `handler` is a UrlMatcher, the handler matcher is used to create the new url.
      * The `handler` UrlMatcher is formatted using the matched param from the first matcher.
      * The url is replaced with the result.
      *
      * #### Example:
      * ```js
      * var urlMatcher = $umf.compile("/foo/:fooId/:barId");
      * var handler = $umf.compile("/home/:fooId/:barId");
      * var rule = factory.fromUrlMatcher(urlMatcher, handler);
      * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
      * var result = rule.handler(match); // '/home/123/456'
      * ```
      */
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: String): MatcherUrlRule = js.native
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: UrlRuleHandlerFn): MatcherUrlRule = js.native
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: UrlMatcher): MatcherUrlRule = js.native
    
    var router: UIRouter = js.native
  }
  /* static members */
  object UrlRuleFactory {
    
    @JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory.isUrlRule")
    @js.native
    def isUrlRule(obj: js.Any): Boolean = js.native
  }
}
