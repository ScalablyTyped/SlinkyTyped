package typingsSlinky.wouter.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.matcherMod.Params
import typingsSlinky.wouter.mod.RouteComponentProps
import typingsSlinky.wouter.mod.RouteProps
import typingsSlinky.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  @JSImport("wouter", "Route")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.wouter.matcherMod.DefaultParams */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenFunction1(value: /* params */ Params[T] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def children(value: (js.Function1[/* params */ Params[T], ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def path(value: Path): this.type = set("path", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: typingsSlinky.wouter.matcherMod.DefaultParams */ T](p: RouteProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.wouter.matcherMod.DefaultParams */ T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouteProps[T]]))
  }
  implicit def make[/* <: typingsSlinky.wouter.matcherMod.DefaultParams */ T](companion: Route.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

