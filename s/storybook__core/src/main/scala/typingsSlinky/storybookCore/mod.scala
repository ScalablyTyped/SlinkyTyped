package typingsSlinky.storybookCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.storybookClientApi.typesMod.ClientApiParams
import typingsSlinky.storybookCore.anon.Channel
import typingsSlinky.storybookCore.anon.DecorateStory
import typingsSlinky.storybookCore.typesMod.RenderStoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var start: js.Function2[
        /* render */ RenderStoryFunction, 
        /* hasDecorateStory */ js.UndefOr[DecorateStory], 
        Channel
      ] = js.native
    
    def toId(kind: String, name: String): String = js.native
    
    @js.native
    class ClientApi protected ()
      extends typingsSlinky.storybookClientApi.mod.ClientApi {
      def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
    }
    @js.native
    object ClientApi
      extends TopLevel[
              Instantiable1[
                /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
                typingsSlinky.storybookClientApi.mod.ClientApi
              ]
            ]
    
    @js.native
    class ConfigApi protected ()
      extends typingsSlinky.storybookClientApi.mod.ConfigApi {
      def this(hasStoryStore: typingsSlinky.storybookClientApi.anon.StoryStore) = this()
    }
    @js.native
    object ConfigApi
      extends TopLevel[
              Instantiable1[
                /* hasStoryStore */ typingsSlinky.storybookClientApi.anon.StoryStore, 
                typingsSlinky.storybookClientApi.mod.ConfigApi
              ]
            ]
    
    @js.native
    class StoryStore protected ()
      extends typingsSlinky.storybookClientApi.mod.StoryStore {
      def this(params: typingsSlinky.storybookClientApi.anon.Channel) = this()
    }
    @js.native
    object StoryStore
      extends TopLevel[
              Instantiable1[
                /* params */ typingsSlinky.storybookClientApi.anon.Channel, 
                typingsSlinky.storybookClientApi.mod.StoryStore
              ]
            ]
  }
}
