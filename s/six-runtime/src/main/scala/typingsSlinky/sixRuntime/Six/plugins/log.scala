package typingsSlinky.sixRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait log extends js.Object {
  
  def debug(msg: String, restOfVar: js.Any*): Unit = js.native
  
  def error(msg: String, restOfVar: js.Any*): Unit = js.native
  def error(msg: js.Error, restOfVar: js.Any*): Unit = js.native
  
  def info(msg: String, restOfVar: js.Any*): Unit = js.native
  
  def warn(msg: String, restOfVar: js.Any*): Unit = js.native
}
