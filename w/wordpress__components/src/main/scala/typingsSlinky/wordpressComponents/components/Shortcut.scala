package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.Props
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsSlinky.wordpressComponents.shortcutMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Shortcut {
  @JSImport("@wordpress/components/shortcut", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def shortcut(value: ShortcutType): this.type = set("shortcut", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Shortcut.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

