package typingsSlinky.storybookApi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookApi.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("@storybook/api", "Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Provider] {
    @scala.inline
    def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def location(value: WindowLocation[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def navigate(value: NavigateFn): this.type = set("navigate", value.asInstanceOf[js.Any])
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def storyId(value: String): this.type = set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def uri(value: String): this.type = set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def viewMode(value: String): this.type = set("viewMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(docsMode: Boolean, provider: typingsSlinky.storybookApi.initProviderApiMod.Provider): Builder = {
    val __props = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

