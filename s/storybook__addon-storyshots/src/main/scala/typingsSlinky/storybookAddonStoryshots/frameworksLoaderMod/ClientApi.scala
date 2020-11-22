package typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typingsSlinky.storybookAddons.typesMod.ClientStoryApi
import typingsSlinky.storybookAddons.typesMod.Loadable
import typingsSlinky.storybookClientApi.typesMod.ArgTypesEnhancer
import typingsSlinky.storybookClientApi.typesMod.GetStorybookKind
import typingsSlinky.storybookClientApi.typesMod.PublishedStoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApi
  extends ClientStoryApi[js.Any] {
  
  var addArgTypesEnhancer: js.Function1[/* enhancer */ ArgTypesEnhancer, Unit] = js.native
  
  var clearDecorators: js.Function0[Unit] = js.native
  
  def configure(loader: Loadable, module: NodeModule): Unit = js.native
  def configure(loader: Loadable, module: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
  @JSName("configure")
  def configure_false(loader: Loadable, module: `false`): Unit = js.native
  @JSName("configure")
  def configure_false(loader: Loadable, module: `false`, showDeprecationWarning: Boolean): Unit = js.native
  
  def forceReRender(): Unit = js.native
  
  var getStorybook: js.Function0[js.Array[GetStorybookKind]] = js.native
  
  var raw: js.Function0[js.Array[PublishedStoreItem]] = js.native
  
  var setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
}
