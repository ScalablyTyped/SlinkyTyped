package typingsSlinky.wouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.wouter.mod.RedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[typingsSlinky.wouter.mod.RedirectProps[H]] because: IArray(Support for combinations of intersection and union types not implemented) */
object Redirect {
  @JSImport("wouter", "Redirect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H](p: PropsWithChildren[RedirectProps[H]]): Builder[H] = new Builder[H](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H](companion: Redirect.type): Builder[H] = new Builder[H](js.Array(this.component, js.Dictionary.empty))()
}

