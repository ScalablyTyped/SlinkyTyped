package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.paramMod.Param
import typingsSlinky.uirouterCore.paramTypesMod.ParamTypes
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url", JSImport.Namespace)
@js.native
object libUrlMod extends js.Object {
  @js.native
  class BaseUrlRule protected ()
    extends typingsSlinky.uirouterCore.urlRuleMod.BaseUrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @js.native
  class ParamFactory protected ()
    extends typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class UrlConfig protected ()
    extends typingsSlinky.uirouterCore.urlConfigMod.UrlConfig {
    /** @internal */ def this(/** @internal */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlMatcher protected ()
    extends typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory
    ) = this()
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
  }
  
  @js.native
  class UrlMatcherFactory protected ()
    extends typingsSlinky.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory {
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlRouter protected ()
    extends typingsSlinky.uirouterCore.urlRouterMod.UrlRouter {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlRuleFactory protected ()
    extends typingsSlinky.uirouterCore.urlRuleMod.UrlRuleFactory {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class UrlRules protected ()
    extends typingsSlinky.uirouterCore.urlRulesMod.UrlRules {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlService protected ()
    extends typingsSlinky.uirouterCore.urlServiceMod.UrlService {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  /* static members */
  @js.native
  object UrlMatcher extends js.Object {
    /** @internal */
    var nameValidator: js.RegExp = js.native
    /**
      * Compare two UrlMatchers
      *
      * This comparison function converts a UrlMatcher into static and dynamic path segments.
      * Each static path segment is a static string between a path separator (slash character).
      * Each dynamic segment is a path parameter.
      *
      * The comparison function sorts static segments before dynamic ones.
      */
    def compare(
      a: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher,
      b: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
    ): Double = js.native
    /** @internal */
    def encodeDashes(str: String): String = js.native
    /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
    def pathSegmentsAndParams(matcher: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher): js.Any = js.native
    /** @internal Given a matcher, return an array with the matcher's query params */
    def queryParams(matcher: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[Param] = js.native
  }
  
  /* static members */
  @js.native
  object UrlRuleFactory extends js.Object {
    def isUrlRule(obj: js.Any): Boolean = js.native
  }
  
}

