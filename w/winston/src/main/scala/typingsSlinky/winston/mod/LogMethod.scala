package typingsSlinky.winston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogMethod extends js.Object {
  
  def apply(entry: LogEntry): Logger = js.native
  def apply(level: String, message: String, callback: LogCallback): Logger = js.native
  def apply(level: String, message: String, meta: js.Any*): Logger = js.native
  def apply(level: String, message: String, meta: js.Any, callback: LogCallback): Logger = js.native
  def apply(level: String, message: js.Any): Logger = js.native
}
