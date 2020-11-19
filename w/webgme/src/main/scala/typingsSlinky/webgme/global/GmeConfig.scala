package typingsSlinky.webgme.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
@JSGlobal("GmeConfig")
@js.native
object GmeConfig extends js.Object {
  
  var config: typingsSlinky.webgme.GmeConfig.PluginConfig = js.native
  
  @js.native
  class GmeConfig ()
    extends typingsSlinky.webgme.GmeConfig.GmeConfig
  
  @js.native
  class PluginConfig ()
    extends typingsSlinky.webgme.GmeConfig.PluginConfig
}
