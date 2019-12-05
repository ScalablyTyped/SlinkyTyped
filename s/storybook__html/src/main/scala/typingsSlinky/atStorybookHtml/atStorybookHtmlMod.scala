package typingsSlinky.atStorybookHtml

import typingsSlinky.atStorybookAddons.distTypesMod.DecoratorFunction
import typingsSlinky.atStorybookAddons.distTypesMod.Loadable
import typingsSlinky.atStorybookAddons.distTypesMod.Parameters
import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi
import typingsSlinky.atStorybookHtml.distClientPreviewTypesMod.IStorybookSection
import typingsSlinky.atStorybookHtml.distClientPreviewTypesMod.StoryFnHtmlReturnType
import typingsSlinky.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/html", JSImport.Namespace)
@js.native
object atStorybookHtmlMod extends js.Object {
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnHtmlReturnType], 
    StoryApi[StoryFnHtmlReturnType]
  ] = js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnHtmlReturnType]] = js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  val forceReRender: js.Function0[Unit] = js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  val raw: js.Function0[js.Any] = js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  val storiesOf: js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnHtmlReturnType]] = js.native
}

