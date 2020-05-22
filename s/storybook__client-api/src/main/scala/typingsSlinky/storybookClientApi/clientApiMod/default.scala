package typingsSlinky.storybookClientApi.clientApiMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookClientApi.anon.FileName
import typingsSlinky.storybookClientApi.anon.HierarchyRootSeparator
import typingsSlinky.storybookClientApi.anon.HierarchySeparator
import typingsSlinky.storybookClientApi.typesMod.ClientApiParams
import typingsSlinky.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/client_api", JSImport.Default)
@js.native
class default protected () extends ClientApi {
  def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  /* CompleteClass */
  override var _addons: js.Any = js.native
  /* CompleteClass */
  override var _decorateStory: js.Any = js.native
  /* CompleteClass */
  override var _storyStore: js.Any = js.native
  /* CompleteClass */
  override def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  /* CompleteClass */
  override def addParameters(parameters: Parameters): Unit = js.native
  /* CompleteClass */
  override def clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def clearParameters(): Unit = js.native
  /* CompleteClass */
  override def getSeparators(): HierarchyRootSeparator | HierarchySeparator = js.native
  /* CompleteClass */
  override def getStorybook(): js.Array[FileName] = js.native
  /* CompleteClass */
  override def raw(): js.Array[StoreItem] = js.native
  /* CompleteClass */
  override def setAddon(addon: js.Any): Unit = js.native
  /* CompleteClass */
  override def store(): typingsSlinky.storybookClientApi.storyStoreMod.default = js.native
  /* CompleteClass */
  override def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
}

