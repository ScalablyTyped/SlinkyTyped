package typingsSlinky.vuex.anon

import typingsSlinky.vuex.loggerMod.LoggerOption
import typingsSlinky.vuex.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[S](): Plugin[S] = js.native
  def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
}
