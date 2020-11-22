package typingsSlinky.storybookCore.storyRendererMod

import typingsSlinky.storybookAddons.mod.Channel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview/StoryRenderer", "StoryRenderer")
@js.native
class StoryRenderer protected () extends js.Object {
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
