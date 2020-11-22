package typingsSlinky.storybookReact

import slinky.core.facade.ReactElement
import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.Loadable
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookReact.typesMod.IStorybookSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val addDecorator: js.Function1[/* decorator */ DecoratorFunction[ReactElement], StoryApi[ReactElement]] = js.native
  
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[ReactElement]] = js.native
  
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  val forceReRender: js.Function0[Unit] = js.native
  
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  val raw: js.Function0[js.Any] = js.native
  
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[ReactElement]] = js.native
}
