package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressComponents.mod.ScrollLock.^
import typingsSlinky.wordpressComponents.scrollLockMod.ScrollLock.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollLock {
  @JSImport("@wordpress/components", "ScrollLock")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScrollLock.type): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, js.Dictionary.empty))()
}

