package typingsSlinky.wouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.wouter.mod.RedirectProps
import typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[typingsSlinky.wouter.mod.RedirectProps[H]] because: IArray(Support for combinations of intersection and union types not implemented) */
object Redirect {
  
  def apply[H /* <: BaseLocationHook */](p: PropsWithChildren[RedirectProps[H]]): Builder[H] = new Builder[H](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("wouter", "Redirect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[H /* <: BaseLocationHook */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[H /* <: BaseLocationHook */](companion: Redirect.type): Builder[H] = new Builder[H](js.Array(this.component, js.Dictionary.empty))()
}
