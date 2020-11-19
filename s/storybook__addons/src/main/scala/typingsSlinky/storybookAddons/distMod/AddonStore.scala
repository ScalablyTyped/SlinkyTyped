package typingsSlinky.storybookAddons.distMod

import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addons/dist", "AddonStore")
@js.native
class AddonStore () extends js.Object {
  
  def add(name: String, addon: Addon): Unit = js.native
  
  def addPanel(name: String, options: Addon): Unit = js.native
  
  var channel: js.Any = js.native
  
  var config: js.Any = js.native
  
  var elements: js.Any = js.native
  
  def getChannel(): Channel = js.native
  
  def getConfig(): Config = js.native
  
  def getElements(`type`: String): Collection = js.native
  
  def hasChannel(): Boolean = js.native
  
  def loadAddons(api: js.Any): Unit = js.native
  
  var loaders: js.Any = js.native
  
  var promise: js.Any = js.native
  
  def ready(): js.Promise[Channel] = js.native
  
  def register(name: String, registerCallback: js.Function1[/* api */ API, Unit]): Unit = js.native
  
  var resolve: js.Any = js.native
  
  def setChannel(channel: Channel): Unit = js.native
  
  def setConfig(value: Config): Unit = js.native
}
