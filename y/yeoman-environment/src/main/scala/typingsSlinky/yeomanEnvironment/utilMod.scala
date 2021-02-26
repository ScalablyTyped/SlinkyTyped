package typingsSlinky.yeomanEnvironment

import typingsSlinky.yeomanEnvironment.logMod.Logger
import typingsSlinky.yeomanEnvironment.logMod.LoggerOptions
import typingsSlinky.yeomanEnvironment.mod.Options
import typingsSlinky.yeomanEnvironment.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("yeoman-environment/lib/util/util", "duplicateEnv")
  @js.native
  def duplicateEnv(initialEnv: ^[Options]): ^[Options] = js.native
  
  @JSImport("yeoman-environment/lib/util/util", "log")
  @js.native
  def log[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = js.native
}
