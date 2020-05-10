package typingsSlinky.storybookHtml.previewMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.ClientStoryApi
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Loadable
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookHtml.typesMod.IStorybookSection
import typingsSlinky.storybookHtml.typesMod.StoryFnHtmlReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi extends ClientStoryApi[StoryFnHtmlReturnType] {
  def clearDecorators(): Unit = js.native
  def configure(loader: Loadable, module: NodeModule): Unit = js.native
  def forceReRender(): Unit = js.native
  def getStorybook(): js.Array[IStorybookSection] = js.native
  def raw(): js.Any = js.native
  def setAddon(addon: js.Any): Unit = js.native
}

object ClientApi {
  @scala.inline
  def apply(
    addDecorator: DecoratorFunction[StoryFnHtmlReturnType] => StoryApi[StoryFnHtmlReturnType],
    addParameters: Parameters => StoryApi[StoryFnHtmlReturnType],
    clearDecorators: () => Unit,
    configure: (Loadable, NodeModule) => Unit,
    forceReRender: () => Unit,
    getStorybook: () => js.Array[IStorybookSection],
    raw: () => js.Any,
    setAddon: js.Any => Unit,
    storiesOf: (String, NodeModule) => StoryApi[StoryFnHtmlReturnType]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientApi]
  }
  @scala.inline
  implicit class ClientApiOps[Self <: ClientApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDecorators(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDecorators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfigure(value: (Loadable, NodeModule) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForceReRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceReRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorybook(value: () => js.Array[IStorybookSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorybook")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRaw(value: () => js.Any): Self = {
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
  }
  
}

