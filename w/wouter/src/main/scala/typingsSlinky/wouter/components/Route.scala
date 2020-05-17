package typingsSlinky.wouter.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.mod.DefaultParams
import typingsSlinky.wouter.mod.Path
import typingsSlinky.wouter.mod.RouteComponentProps
import typingsSlinky.wouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  @JSImport("wouter", "Route")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: DefaultParams] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: DefaultParams](p: RouteProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: DefaultParams](path: Path): Builder[T] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouteProps[T]]))
  }
}

