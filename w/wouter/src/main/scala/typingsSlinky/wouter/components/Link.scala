package typingsSlinky.wouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.wouter.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[typingsSlinky.wouter.mod.LinkProps[H]] because: IArray(Support for combinations of intersection and union types not implemented) */
object Link {
  @JSImport("wouter", "Link")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H](p: PropsWithChildren[LinkProps[H]]): Builder[H] = new Builder[H](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */ H](companion: Link.type): Builder[H] = new Builder[H](js.Array(this.component, js.Dictionary.empty))()
}

