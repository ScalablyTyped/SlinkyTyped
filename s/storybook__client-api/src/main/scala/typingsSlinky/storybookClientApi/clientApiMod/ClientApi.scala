package typingsSlinky.storybookClientApi.clientApiMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookClientApi.AnonFileName
import typingsSlinky.storybookClientApi.AnonHierarchyRootSeparator
import typingsSlinky.storybookClientApi.AnonHierarchySeparator
import typingsSlinky.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi extends js.Object {
  var _addons: js.Any = js.native
  var _decorateStory: js.Any = js.native
  var _storyStore: js.Any = js.native
  def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  def addParameters(parameters: Parameters): Unit = js.native
  def clearDecorators(): Unit = js.native
  def clearParameters(): Unit = js.native
  def getSeparators(): AnonHierarchyRootSeparator | AnonHierarchySeparator = js.native
  def getStorybook(): js.Array[AnonFileName] = js.native
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
    getSeparators: () => AnonHierarchyRootSeparator | AnonHierarchySeparator,
    getStorybook: () => js.Array[AnonFileName],
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
    def with_addons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_decorateStory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_decorateStory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_storyStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_storyStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDecorator(value: DecoratorFunction[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDecorator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddParameters(value: Parameters => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearDecorators(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDecorators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearParameters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSeparators(value: () => AnonHierarchyRootSeparator | AnonHierarchySeparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeparators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorybook(value: () => js.Array[AnonFileName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorybook")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRaw(value: () => js.Array[StoreItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAddon(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAddon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStore(value: () => typingsSlinky.storybookClientApi.storyStoreMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStoriesOf(value: (String, NodeModule) => StoryApi[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesOf")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

