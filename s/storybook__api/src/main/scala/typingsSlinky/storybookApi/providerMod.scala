package typingsSlinky.storybookApi

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.std.Record
import typingsSlinky.storybookApi.anon.themeThemeVarsundefinedre
import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.mod.ModuleFn
import typingsSlinky.storybookChannels.mod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/api/dist/modules/provider", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type IframeRenderer = js.Function6[
    /* storyId */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, 
    /* id */ String, 
    /* baseUrl */ String, 
    /* scale */ Double, 
    /* queryParams */ Record[String, js.Any], 
    ReactElement
  ]
  
  @js.native
  trait Provider
    extends /* key */ StringDictionary[js.Any] {
    
    var channel: js.UndefOr[Channel] = js.native
    
    def getConfig(): themeThemeVarsundefinedre = js.native
    
    def handleAPI(api: API): Unit = js.native
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.native
  }
  object Provider {
    
    @scala.inline
    def apply(getConfig: () => themeThemeVarsundefinedre, handleAPI: API => Unit): Provider = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setGetConfig(value: () => themeThemeVarsundefinedre): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleAPI(value: API => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderPreview(
        value: (/* storyId */ String, /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactElement
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
    }
  }
  
  @js.native
  trait SubAPI extends StObject {
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.native
  }
  object SubAPI {
    
    @scala.inline
    def apply(): SubAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderPreview(
        value: (/* storyId */ String, /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactElement
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
    }
  }
}
