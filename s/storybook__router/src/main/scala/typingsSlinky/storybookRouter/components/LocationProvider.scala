package typingsSlinky.storybookRouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRouter.mod.History
import typingsSlinky.reachRouter.mod.LocationContext
import typingsSlinky.reachRouter.mod.LocationProviderProps
import typingsSlinky.reachRouter.mod.LocationProviderRenderFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationProvider {
  
  @JSImport("@storybook/router", "LocationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookRouter.mod.LocationProvider] {
    
    @scala.inline
    def children(value: ReactElement | LocationProviderRenderFn): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* context */ LocationContext => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LocationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LocationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
