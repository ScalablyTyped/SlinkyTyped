package typingsSlinky.wouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.anon.PartialRouterPropschildre
import typingsSlinky.wouter.matcherMod.DefaultParams
import typingsSlinky.wouter.matcherMod.Match
import typingsSlinky.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @JSImport("wouter", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def base(value: Path): this.type = set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hook(
      value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
    ): this.type = set("hook", js.Any.fromFunction1(value))
    
    @scala.inline
    def matcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): this.type = set("matcher", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: Router.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialRouterPropschildre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
