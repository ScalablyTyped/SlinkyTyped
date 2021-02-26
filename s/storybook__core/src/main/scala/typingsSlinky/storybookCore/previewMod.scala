package typingsSlinky.storybookCore

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.storybookClientApi.anon.Channel
import typingsSlinky.storybookClientApi.typesMod.ClientApiParams
import typingsSlinky.storybookCore.anon.DecorateStory
import typingsSlinky.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  object default {
    
    @JSImport("@storybook/core/dist/client/preview", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core/dist/client/preview", "default.ClientApi")
    @js.native
    class ClientApi protected ()
      extends typingsSlinky.storybookClientApi.mod.ClientApi {
      def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
    }
    @JSImport("@storybook/core/dist/client/preview", "default.ClientApi")
    @js.native
    def ClientApi: Instantiable1[
        /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
        typingsSlinky.storybookClientApi.mod.ClientApi
      ] = js.native
    @scala.inline
    def ClientApi_=(
      x: Instantiable1[
          /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
          typingsSlinky.storybookClientApi.mod.ClientApi
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientApi")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core/dist/client/preview", "default.ConfigApi")
    @js.native
    class ConfigApi protected ()
      extends typingsSlinky.storybookClientApi.mod.ConfigApi {
      def this(hasStoryStore: typingsSlinky.storybookClientApi.anon.StoryStore) = this()
    }
    @JSImport("@storybook/core/dist/client/preview", "default.ConfigApi")
    @js.native
    def ConfigApi: Instantiable1[
        /* hasStoryStore */ typingsSlinky.storybookClientApi.anon.StoryStore, 
        typingsSlinky.storybookClientApi.mod.ConfigApi
      ] = js.native
    @scala.inline
    def ConfigApi_=(
      x: Instantiable1[
          /* hasStoryStore */ typingsSlinky.storybookClientApi.anon.StoryStore, 
          typingsSlinky.storybookClientApi.mod.ConfigApi
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigApi")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core/dist/client/preview", "default.StoryStore")
    @js.native
    class StoryStore protected ()
      extends typingsSlinky.storybookClientApi.mod.StoryStore {
      def this(params: Channel) = this()
    }
    @JSImport("@storybook/core/dist/client/preview", "default.StoryStore")
    @js.native
    def StoryStore: Instantiable1[/* params */ Channel, typingsSlinky.storybookClientApi.mod.StoryStore] = js.native
    @scala.inline
    def StoryStore_=(x: Instantiable1[/* params */ Channel, typingsSlinky.storybookClientApi.mod.StoryStore]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoryStore")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/core/dist/client/preview", "default.start")
    @js.native
    def start: js.Function2[
        /* render */ RenderStoryFunction, 
        /* hasDecorateStory */ js.UndefOr[DecorateStory], 
        typingsSlinky.storybookCore.anon.Channel
      ] = js.native
    @scala.inline
    def start_=(
      x: js.Function2[
          /* render */ RenderStoryFunction, 
          /* hasDecorateStory */ js.UndefOr[DecorateStory], 
          typingsSlinky.storybookCore.anon.Channel
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/core/dist/client/preview", "default.toId")
    @js.native
    def toId(kind: String, name: String): String = js.native
  }
}
