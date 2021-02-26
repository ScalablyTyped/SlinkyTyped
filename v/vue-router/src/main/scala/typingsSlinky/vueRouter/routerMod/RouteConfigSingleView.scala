package typingsSlinky.vueRouter.routerMod

import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.EsModuleComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteConfigSingleView
  extends RouteConfigBase
     with RouteConfig {
  
  var component: js.UndefOr[Component] = js.native
  
  var props: js.UndefOr[Boolean | js.Object | RoutePropsFunction] = js.native
}
object RouteConfigSingleView {
  
  @scala.inline
  def apply(path: String): RouteConfigSingleView = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigSingleView]
  }
  
  @scala.inline
  implicit class RouteConfigSingleViewMutableBuilder[Self <: RouteConfigSingleView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFunction0(
      value: () => typingsSlinky.vue.anon.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
    ): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentFunction2(
      value: (/* resolve */ js.Function1[
          /* component */ typingsSlinky.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ], 
          Unit
        ], /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => (js.Promise[
          (typingsSlinky.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | EsModuleComponent
        ]) | Unit
    ): Self = StObject.set(x, "component", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setProps(value: Boolean | js.Object | RoutePropsFunction): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsFunction1(value: /* route */ Route => js.Object): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
