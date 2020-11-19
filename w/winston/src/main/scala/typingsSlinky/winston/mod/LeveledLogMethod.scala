package typingsSlinky.winston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeveledLogMethod extends js.Object {
  
  def apply(infoObject: js.Object): Logger = js.native
  def apply(message: String, callback: LogCallback): Logger = js.native
  def apply(message: String, meta: js.Any*): Logger = js.native
  def apply(message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def apply(message: js.Any): Logger = js.native
}
