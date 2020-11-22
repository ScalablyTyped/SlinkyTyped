package typingsSlinky.storybookApi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  docsMode :boolean,   children :react.react.ReactNode | (props : @storybook/api.@storybook/api.Combo): react.react.ReactNode} */
@js.native
trait ManagerProviderProps extends js.Object {
  
  var children: ReactElement | (js.Function1[/* props */ Combo, ReactElement]) = js.native
  
  var docsMode: Boolean = js.native
  
  var location: WindowLocation[LocationState] = js.native
  
  var navigate: js.UndefOr[NavigateFn] = js.native
  
  var path: String = js.native
  
  var provider: typingsSlinky.storybookApi.providerMod.Provider = js.native
  
  var refId: js.UndefOr[String] = js.native
  
  var storyId: js.UndefOr[String] = js.native
  
  var viewMode: js.UndefOr[String] = js.native
}
object ManagerProviderProps {
  
  @scala.inline
  def apply(
    docsMode: Boolean,
    location: WindowLocation[LocationState],
    path: String,
    provider: typingsSlinky.storybookApi.providerMod.Provider
  ): ManagerProviderProps = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerProviderProps]
  }
  
  @scala.inline
  implicit class ManagerProviderPropsOps[Self <: ManagerProviderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocsMode(value: Boolean): Self = this.set("docsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: typingsSlinky.storybookApi.providerMod.Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ Combo => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement | (js.Function1[/* props */ Combo, ReactElement])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
