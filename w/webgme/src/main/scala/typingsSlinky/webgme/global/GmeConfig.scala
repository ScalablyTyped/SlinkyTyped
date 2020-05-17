package typingsSlinky.webgme.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
@JSGlobal("GmeConfig")
@js.native
object GmeConfig extends js.Object {
  @js.native
  class GmeConfig ()
    extends typingsSlinky.webgme.GmeConfig.GmeConfig
  
  @js.native
  class PluginConfig ()
    extends typingsSlinky.webgme.GmeConfig.PluginConfig
  
  var config: typingsSlinky.webgme.GmeConfig.PluginConfig = js.native
}

