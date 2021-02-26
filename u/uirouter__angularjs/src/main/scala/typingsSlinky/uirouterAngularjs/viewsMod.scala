package typingsSlinky.uirouterAngularjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterAngularjs.interfaceMod.Ng1ViewDeclaration
import typingsSlinky.uirouterAngularjs.templateFactoryMod.TemplateFactory
import typingsSlinky.uirouterCore.commonCommonMod.IInjectable
import typingsSlinky.uirouterCore.mod.PathNode
import typingsSlinky.uirouterCore.mod.ResolveContext
import typingsSlinky.uirouterCore.mod.StateObject
import typingsSlinky.uirouterCore.viewInterfaceMod.ViewConfig
import typingsSlinky.uirouterCore.viewViewMod.ViewConfigFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("@uirouter/angularjs/lib/statebuilders/views", "Ng1ViewConfig")
  @js.native
  class Ng1ViewConfig protected () extends ViewConfig {
    def this(path: js.Array[PathNode], viewDecl: Ng1ViewDeclaration, factory: TemplateFactory) = this()
    
    var component: String = js.native
    
    var controller: js.Function = js.native
    
    var factory: TemplateFactory = js.native
    
    /**
      * Gets the controller for a view configuration.
      *
      * @returns {Function|Promise.<Function>} Returns a controller, or a promise that resolves to a controller.
      */
    def getController(context: ResolveContext): IInjectable | String | (js.Promise[IInjectable | String]) = js.native
    
    def getTemplate(uiView: js.Any, context: ResolveContext): String = js.native
    
    var locals: js.Any = js.native
    
    @JSName("path")
    var path_Ng1ViewConfig: js.Array[PathNode] = js.native
    
    var template: String = js.native
    
    @JSName("viewDecl")
    var viewDecl_Ng1ViewConfig: Ng1ViewDeclaration = js.native
  }
  
  @JSImport("@uirouter/angularjs/lib/statebuilders/views", "getNg1ViewConfigFactory")
  @js.native
  def getNg1ViewConfigFactory(): ViewConfigFactory = js.native
  
  @JSImport("@uirouter/angularjs/lib/statebuilders/views", "ng1ViewsBuilder")
  @js.native
  def ng1ViewsBuilder(state: StateObject): StringDictionary[Ng1ViewDeclaration] = js.native
}
