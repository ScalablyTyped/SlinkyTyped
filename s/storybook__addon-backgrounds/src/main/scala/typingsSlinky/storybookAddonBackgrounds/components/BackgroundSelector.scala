package typingsSlinky.storybookAddonBackgrounds.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.Props
import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackgroundSelector {
  @JSImport("@storybook/addon-backgrounds/dist/containers/BackgroundSelector", "BackgroundSelector")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[
    tag.type, 
    typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
  ] = new Default[
    tag.type, 
    typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(api: API): Default[
    tag.type, 
    typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
  ] = {
    val __props = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    new Default[
      tag.type, 
      typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
    ](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

