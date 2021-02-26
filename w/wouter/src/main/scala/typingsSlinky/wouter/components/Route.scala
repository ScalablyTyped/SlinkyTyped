package typingsSlinky.wouter.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.matcherMod.DefaultParams
import typingsSlinky.wouter.matcherMod.Params
import typingsSlinky.wouter.mod.RouteComponentProps
import typingsSlinky.wouter.mod.RouteProps
import typingsSlinky.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Route {
  
  @scala.inline
  def apply[T /* <: DefaultParams */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouteProps[T]]))
  }
  
  @JSImport("wouter", "Route")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: DefaultParams */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: (js.Function1[/* params */ Params[T], ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* params */ Params[T] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def path(value: Path): this.type = set("path", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T /* <: DefaultParams */](companion: Route.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: DefaultParams */](p: RouteProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
