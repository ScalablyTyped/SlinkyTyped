package typingsSlinky.wouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.anon.PartialRouterPropschildre
import typingsSlinky.wouter.mod.DefaultParams
import typingsSlinky.wouter.mod.LocationHookOptions
import typingsSlinky.wouter.mod.LocationTuple
import typingsSlinky.wouter.mod.Match
import typingsSlinky.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  @JSImport("wouter", "Router")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def base(value: Path): this.type = set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def hook(value: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple): this.type = set("hook", js.Any.fromFunction1(value))
    @scala.inline
    def matcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): this.type = set("matcher", js.Any.fromFunction2(value))
  }
  
  def withProps(p: PartialRouterPropschildre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Router.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

