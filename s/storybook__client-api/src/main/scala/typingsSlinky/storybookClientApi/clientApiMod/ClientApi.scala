package typingsSlinky.storybookClientApi.clientApiMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookClientApi.anon.FileName
import typingsSlinky.storybookClientApi.anon.HierarchyRootSeparator
import typingsSlinky.storybookClientApi.anon.HierarchySeparator
import typingsSlinky.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApi extends js.Object {
  
  var _addons: js.Any = js.native
  
  var _decorateStory: js.Any = js.native
  
  var _storyStore: js.Any = js.native
  
  def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  
  def addParameters(parameters: Parameters): Unit = js.native
  
  def clearDecorators(): Unit = js.native
  
  def clearParameters(): Unit = js.native
  
  def getSeparators(): HierarchyRootSeparator | HierarchySeparator = js.native
  
  def getStorybook(): js.Array[FileName] = js.native
  
  def raw(): js.Array[StoreItem] = js.native
  
  def setAddon(addon: js.Any): Unit = js.native
  
  def store(): typingsSlinky.storybookClientApi.storyStoreMod.default = js.native
  
  def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
}
object ClientApi {
  
  @scala.inline
  def apply(
    _addons: js.Any,
    _decorateStory: js.Any,
    _storyStore: js.Any,
    addDecorator: DecoratorFunction[_] => Unit,
    addParameters: Parameters => Unit,
    clearDecorators: () => Unit,
    clearParameters: () => Unit,
    getSeparators: () => HierarchyRootSeparator | HierarchySeparator,
    getStorybook: () => js.Array[FileName],
    raw: () => js.Array[StoreItem],
    setAddon: js.Any => Unit,
    store: () => typingsSlinky.storybookClientApi.storyStoreMod.default,
    storiesOf: (String, NodeModule) => StoryApi[js.Any]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(_addons = _addons.asInstanceOf[js.Any], _decorateStory = _decorateStory.asInstanceOf[js.Any], _storyStore = _storyStore.asInstanceOf[js.Any], addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), clearParameters = js.Any.fromFunction0(clearParameters), getSeparators = js.Any.fromFunction0(getSeparators), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), store = js.Any.fromFunction0(store), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientApi]
  }
  
  @scala.inline
  implicit class ClientApiOps[Self <: ClientApi] (val x: Self) extends AnyVal {
    
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
    def set_addons(value: js.Any): Self = this.set("_addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_decorateStory(value: js.Any): Self = this.set("_decorateStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_storyStore(value: js.Any): Self = this.set("_storyStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDecorator(value: DecoratorFunction[_] => Unit): Self = this.set("addDecorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddParameters(value: Parameters => Unit): Self = this.set("addParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearDecorators(value: () => Unit): Self = this.set("clearDecorators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearParameters(value: () => Unit): Self = this.set("clearParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeparators(value: () => HierarchyRootSeparator | HierarchySeparator): Self = this.set("getSeparators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStorybook(value: () => js.Array[FileName]): Self = this.set("getStorybook", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRaw(value: () => js.Array[StoreItem]): Self = this.set("raw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAddon(value: js.Any => Unit): Self = this.set("setAddon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStore(value: () => typingsSlinky.storybookClientApi.storyStoreMod.default): Self = this.set("store", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoriesOf(value: (String, NodeModule) => StoryApi[js.Any]): Self = this.set("storiesOf", js.Any.fromFunction2(value))
  }
}
