package typingsSlinky.storybookPreact

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Loadable
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookPreact.typesMod.IStorybookSection
import typingsSlinky.storybookPreact.typesMod.StoryFnPreactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/preact/dist/client/preview", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnPreactReturnType], 
    StoryApi[StoryFnPreactReturnType]
  ] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnPreactReturnType]] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "raw")
  @js.native
  val raw: js.Function0[js.Any] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/preact/dist/client/preview", "storiesOf")
  @js.native
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnPreactReturnType]] = js.native
}
