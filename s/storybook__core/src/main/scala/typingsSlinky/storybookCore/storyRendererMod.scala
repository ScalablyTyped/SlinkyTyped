package typingsSlinky.storybookCore

import typingsSlinky.storybookAddons.mod.Channel
import typingsSlinky.storybookAddons.typesMod.StoryFn
import typingsSlinky.storybookAddons.typesMod.StoryId
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookAddons.typesMod.ViewMode
import typingsSlinky.storybookCore.anon.Context
import typingsSlinky.storybookCore.anon.ContextRenderContextWithoutStoryContext
import typingsSlinky.storybookCore.anon.Description
import typingsSlinky.storybookCore.anon.Message
import typingsSlinky.storybookCore.anon.Render
import typingsSlinky.storybookCore.anon.StoryStore
import typingsSlinky.storybookCore.storybookCoreStrings.`sb-main-centered`
import typingsSlinky.storybookCore.storybookCoreStrings.`sb-main-fullscreen`
import typingsSlinky.storybookCore.storybookCoreStrings.`sb-main-padded`
import typingsSlinky.storybookCore.storybookCoreStrings.centered
import typingsSlinky.storybookCore.storybookCoreStrings.fullscreen
import typingsSlinky.storybookCore.storybookCoreStrings.padded
import typingsSlinky.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyRendererMod {
  
  @JSImport("@storybook/core/dist/client/preview/StoryRenderer", "StoryRenderer")
  @js.native
  class StoryRenderer protected () extends StObject {
    def this(hasRenderChannelStoryStore: Render) = this()
    
    def applyLayout(): Unit = js.native
    def applyLayout(layout: Layout): Unit = js.native
    
    var channel: js.UndefOr[Channel] = js.native
    
    def checkIfLayoutExists(layout: /* keyof @storybook/core.anon.Centered */ centered | fullscreen | padded): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    var previousLayoutClass: js.UndefOr[`sb-main-centered` | `sb-main-fullscreen` | `sb-main-padded` | Null] = js.native
    
    var previousMetadata: js.UndefOr[RenderMetadata] = js.native
    
    var render: RenderStoryFunction = js.native
    
    def renderCurrentStory(forceRender: Boolean): js.Promise[Unit] = js.native
    
    def renderDocs(hasContextStoryStore: StoryStore): Unit = js.native
    
    def renderError(hasTitleDescription: Description): Unit = js.native
    
    def renderException(err: js.Error): Unit = js.native
    
    def renderStory(hasContextContext: ContextRenderContextWithoutStoryContext): js.Promise[Unit] = js.native
    
    def renderStoryIfChanged(hasMetadataContext: Context): js.Promise[Unit] = js.native
    
    def setupListeners(): Unit = js.native
    
    def showDocs(): Unit = js.native
    
    def showErrorDisplay(hasMessageStack: Message): Unit = js.native
    
    def showMain(): Unit = js.native
    
    def showNoPreview(): Unit = js.native
    
    def showStory(): Unit = js.native
    
    var storyStore: typingsSlinky.storybookClientApi.mod.StoryStore = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookCore.storybookCoreStrings.centered
    - typingsSlinky.storybookCore.storybookCoreStrings.fullscreen
    - typingsSlinky.storybookCore.storybookCoreStrings.padded
    - typingsSlinky.storybookCore.storybookCoreStrings.none
  */
  trait Layout extends StObject
  
  @js.native
  trait RenderMetadata extends StObject {
    
    def getDecorated(): StoryFn[_] = js.native
    
    var id: StoryId = js.native
    
    var kind: StoryKind = js.native
    
    var viewMode: ViewMode = js.native
  }
  object RenderMetadata {
    
    @scala.inline
    def apply(getDecorated: () => StoryFn[_], id: StoryId, kind: StoryKind, viewMode: ViewMode): RenderMetadata = {
      val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMetadata]
    }
    
    @scala.inline
    implicit class RenderMetadataMutableBuilder[Self <: RenderMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDecorated(value: () => StoryFn[_]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
}
