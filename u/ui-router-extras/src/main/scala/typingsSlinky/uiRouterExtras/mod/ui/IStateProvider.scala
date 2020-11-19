package typingsSlinky.uiRouterExtras.mod.ui

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateProvider extends IServiceProvider {
  
  def state(config: IStickyState): IStateProvider = js.native
  def state(name: String, config: IStickyState): IStateProvider = js.native
}
