package typingsSlinky.typedoc.cliMod

import typingsSlinky.typedoc.applicationMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/cli", "CliApplication")
@js.native
class CliApplication () extends Application {
  
  var help: Boolean = js.native
  
  var json: String = js.native
  
  var out: String = js.native
  
  var version: Boolean = js.native
}
