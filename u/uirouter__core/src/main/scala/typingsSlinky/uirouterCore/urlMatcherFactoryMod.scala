package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.TypeofParam
import typingsSlinky.uirouterCore.anon.TypeofUrlMatcher
import typingsSlinky.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import typingsSlinky.uirouterCore.paramsMod.Param
import typingsSlinky.uirouterCore.paramsMod.ParamType
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMatcherFactoryMod {
  
  @JSImport("@uirouter/core/lib/url/urlMatcherFactory", "ParamFactory")
  @js.native
  class ParamFactory protected () extends StObject {
    def this(router: UIRouter) = this()
    
    def fromConfig(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    def fromPath(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    def fromSearch(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    var router: js.Any = js.native
  }
  
  @JSImport("@uirouter/core/lib/url/urlMatcherFactory", "UrlMatcherFactory")
  @js.native
  class UrlMatcherFactory protected () extends StObject {
    def this(/** @internal */ router: UIRouter) = this()
    
    /** @internal */
    @JSName("$get")
    def $get(): this.type = js.native
    
    var Param: TypeofParam = js.native
    
    var UrlMatcher: TypeofUrlMatcher = js.native
    
    /** @deprecated use [[UrlConfig.caseInsensitive]] */
    def caseInsensitive(): Boolean = js.native
    def caseInsensitive(value: Boolean): Boolean = js.native
    
    /**
      * Creates a [[UrlMatcher]] for the specified pattern.
      *
      * @param pattern  The URL pattern.
      * @param config  The config object hash.
      * @returns The UrlMatcher.
      */
    def compile(pattern: String): UrlMatcher = js.native
    def compile(pattern: String, config: UrlMatcherCompileConfig): UrlMatcher = js.native
    
    /** @deprecated use [[UrlConfig.defaultSquashPolicy]] */
    def defaultSquashPolicy(): String | Boolean = js.native
    def defaultSquashPolicy(value: String): String | Boolean = js.native
    def defaultSquashPolicy(value: Boolean): String | Boolean = js.native
    
    /**
      * Returns true if the specified object is a [[UrlMatcher]], or false otherwise.
      *
      * @param object  The object to perform the type check against.
      * @returns `true` if the object matches the `UrlMatcher` interface, by
      *          implementing all the same methods.
      */
    def isMatcher(`object`: js.Any): Boolean = js.native
    
    /** Creates a new [[Param]] for a given location (DefType) */
    var paramFactory: ParamFactory = js.native
    
    var router: js.Any = js.native
    
    /** @deprecated use [[UrlConfig.strictMode]] */
    def strictMode(): Boolean = js.native
    def strictMode(value: Boolean): Boolean = js.native
    
    /** @deprecated use [[UrlConfig.type]] */
    def `type`(name: String): js.Any = js.native
    def `type`(
      name: String,
      definition: js.UndefOr[scala.Nothing],
      definitionFn: js.Function0[ParamTypeDefinition]
    ): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): js.Any = js.native
  }
}
