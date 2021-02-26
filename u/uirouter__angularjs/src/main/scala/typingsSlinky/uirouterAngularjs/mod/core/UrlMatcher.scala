package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.UrlMatcher")
@js.native
class UrlMatcher protected ()
  extends typingsSlinky.uirouterCore.mod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(
    pattern: String,
    paramTypes: typingsSlinky.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory
  ) = this()
  def this(
    pattern: String,
    paramTypes: typingsSlinky.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory,
    config: UrlMatcherCompileConfig
  ) = this()
}
/* static members */
object UrlMatcher {
  
  @JSImport("@uirouter/angularjs", "core.UrlMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compare two UrlMatchers
    *
    * This comparison function converts a UrlMatcher into static and dynamic path segments.
    * Each static path segment is a static string between a path separator (slash character).
    * Each dynamic segment is a path parameter.
    *
    * The comparison function sorts static segments before dynamic ones.
    */
  @JSImport("@uirouter/angularjs", "core.UrlMatcher.compare")
  @js.native
  def compare(
    a: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher,
    b: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
  ): Double = js.native
  
  /** @internal */
  @JSImport("@uirouter/angularjs", "core.UrlMatcher.encodeDashes")
  @js.native
  def encodeDashes(str: String): String = js.native
  
  /** @internal */
  @JSImport("@uirouter/angularjs", "core.UrlMatcher.nameValidator")
  @js.native
  def nameValidator: js.RegExp = js.native
  @scala.inline
  def nameValidator_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameValidator")(x.asInstanceOf[js.Any])
  
  /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
  @JSImport("@uirouter/angularjs", "core.UrlMatcher.pathSegmentsAndParams")
  @js.native
  def pathSegmentsAndParams(matcher: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher): js.Any = js.native
  
  /** @internal Given a matcher, return an array with the matcher's query params */
  @JSImport("@uirouter/angularjs", "core.UrlMatcher.queryParams")
  @js.native
  def queryParams(matcher: typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[typingsSlinky.uirouterCore.paramMod.Param] = js.native
}
