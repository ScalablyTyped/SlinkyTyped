package typingsSlinky.vuex.loggerMod

import typingsSlinky.vuex.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vuex/types/logger", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[S](): Plugin[S] = js.native
  def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
}
