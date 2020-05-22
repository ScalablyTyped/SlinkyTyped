package typingsSlinky.wordpressComponents.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.mod.Tooltip.^
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsSlinky.wordpressComponents.tooltipMod.Tooltip.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("@wordpress/components", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def shortcut(value: ShortcutType): this.type = set("shortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: TagMod[Any]): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

