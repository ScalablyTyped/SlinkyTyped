package typingsSlinky.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookApi.refsMod.ComposedRef
import typingsSlinky.storybookApi.refsMod.Refs
import typingsSlinky.storybookApi.storiesMod.StoryInput
import typingsSlinky.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  theme :@storybook/theming.@storybook/theming.ThemeVars | undefined,   refs :@storybook/api.@storybook/api/dist/modules/refs.Refs | undefined,   StoryMapper :@storybook/api.@storybook/api/dist/modules/refs.StoryMapper | undefined, [k: string] : any} & std.Partial<@storybook/api.@storybook/api/dist/modules/layout.UIOptions> */
@js.native
trait themeThemeVarsundefinedre
  extends /* key */ StringDictionary[js.Any] {
  
  var StoryMapper: js.UndefOr[typingsSlinky.storybookApi.refsMod.StoryMapper] = js.native
  
  var addonPanelInRight: js.UndefOr[Boolean] = js.native
  
  var goFullScreen: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var refs: js.UndefOr[Refs] = js.native
  
  var selectedPanel: js.UndefOr[String] = js.native
  
  var showAddonPanel: js.UndefOr[Boolean] = js.native
  
  var showStoriesPanel: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[ThemeVars] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object themeThemeVarsundefinedre {
  
  @scala.inline
  def apply(): themeThemeVarsundefinedre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[themeThemeVarsundefinedre]
  }
  
  @scala.inline
  implicit class themeThemeVarsundefinedreMutableBuilder[Self <: themeThemeVarsundefinedre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddonPanelInRight(value: Boolean): Self = StObject.set(x, "addonPanelInRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonPanelInRightUndefined: Self = StObject.set(x, "addonPanelInRight", js.undefined)
    
    @scala.inline
    def setGoFullScreen(value: Boolean): Self = StObject.set(x, "goFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoFullScreenUndefined: Self = StObject.set(x, "goFullScreen", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    @scala.inline
    def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
    
    @scala.inline
    def setShowAddonPanel(value: Boolean): Self = StObject.set(x, "showAddonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAddonPanelUndefined: Self = StObject.set(x, "showAddonPanel", js.undefined)
    
    @scala.inline
    def setShowStoriesPanel(value: Boolean): Self = StObject.set(x, "showStoriesPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStoriesPanelUndefined: Self = StObject.set(x, "showStoriesPanel", js.undefined)
    
    @scala.inline
    def setStoryMapper(value: (/* ref */ ComposedRef, /* story */ StoryInput) => StoryInput): Self = StObject.set(x, "StoryMapper", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryMapperUndefined: Self = StObject.set(x, "StoryMapper", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
