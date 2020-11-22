package typingsSlinky.yeomanEnvironment

import typingsSlinky.yeomanEnvironment.logMod.Logger
import typingsSlinky.yeomanEnvironment.logMod.LoggerOptions
import typingsSlinky.yeomanEnvironment.mod.Options
import typingsSlinky.yeomanEnvironment.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yeoman-environment/lib/util/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def duplicateEnv(initialEnv: ^[Options]): ^[Options] = js.native
  
  @js.native
  object log extends js.Object {
    
    def apply[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = js.native
  }
}
