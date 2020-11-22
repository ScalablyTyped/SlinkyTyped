package typingsSlinky.storybookApi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookApi.mod.Combo
import typingsSlinky.storybookApi.mod.ManagerProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@storybook/api", "Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Provider] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ Combo => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: ReactElement | (js.Function1[/* props */ Combo, ReactElement])): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def navigate(value: NavigateFn): this.type = set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refId(value: String): this.type = set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def storyId(value: String): this.type = set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewMode(value: String): this.type = set("viewMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ManagerProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    docsMode: Boolean,
    location: WindowLocation[LocationState],
    path: String,
    provider: typingsSlinky.storybookApi.providerMod.Provider
  ): Builder = {
    val __props = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ManagerProviderProps]))
  }
}
