package typingsSlinky.storybookAddonNotes.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonNotes.giphyMod.Props
import typingsSlinky.storybookAddonNotes.giphyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Giphy {
  @JSImport("@storybook/addon-notes/dist/giphy", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(query: String): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

