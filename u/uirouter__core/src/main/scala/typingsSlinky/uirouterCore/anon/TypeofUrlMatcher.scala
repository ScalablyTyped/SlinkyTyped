package typingsSlinky.uirouterCore.anon

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.uirouterCore.paramMod.Param
import typingsSlinky.uirouterCore.paramTypesMod.ParamTypes
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typingsSlinky.uirouterCore.urlMatcherFactoryMod.ParamFactory
import typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUrlMatcher
  extends Instantiable3[
      /* pattern */ String, 
      /* paramTypes */ ParamTypes, 
      /* paramFactory */ ParamFactory, 
      UrlMatcher
    ]
     with Instantiable4[
      /* pattern */ String, 
      /* paramTypes */ ParamTypes, 
      /* paramFactory */ ParamFactory, 
      /* config */ UrlMatcherCompileConfig, 
      UrlMatcher
    ] {
  
  /**
    * Compare two UrlMatchers
    *
    * This comparison function converts a UrlMatcher into static and dynamic path segments.
    * Each static path segment is a static string between a path separator (slash character).
    * Each dynamic segment is a path parameter.
    *
    * The comparison function sorts static segments before dynamic ones.
    */
  def compare(a: UrlMatcher, b: UrlMatcher): Double = js.native
  
  /** @internal */
  def encodeDashes(str: String): String = js.native
  
  /** @internal */
  var nameValidator: js.RegExp = js.native
  
  /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
  def pathSegmentsAndParams(matcher: UrlMatcher): js.Any = js.native
  
  /** @internal Given a matcher, return an array with the matcher's query params */
  def queryParams(matcher: UrlMatcher): js.Array[Param] = js.native
}
