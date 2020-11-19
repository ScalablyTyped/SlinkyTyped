package typingsSlinky.xmlrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlrpc", "dateFormatter")
@js.native
object dateFormatter extends js.Object {
  
  def decodeIso8601(time: String): js.Date = js.native
  
  def encodeIso8601(date: js.Date): String = js.native
  
  def setOpts(opts: DateFormatterOptions): Unit = js.native
}
