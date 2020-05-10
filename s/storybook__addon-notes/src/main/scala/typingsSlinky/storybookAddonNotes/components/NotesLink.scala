package typingsSlinky.storybookAddonNotes.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonNotes.panelMod.NotesLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NotesLink {
  @JSImport("@storybook/addon-notes/dist/Panel", "NotesLink")
  @js.native
  object component extends js.Object
  
  def withProps(p: NotesLinkProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(href: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[NotesLinkProps]))
  }
}

