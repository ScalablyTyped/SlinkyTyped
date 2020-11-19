package typingsSlinky.winston.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionHandler extends Instantiable1[/* logger */ Logger, ExceptionHandler] {
  
  var catcher: js.Function | Boolean = js.native
  
  def getAllInfo(err: String): js.Object = js.native
  def getAllInfo(err: js.Error): js.Object = js.native
  
  def getOsInfo(): js.Object = js.native
  
  def getProcessInfo(): js.Object = js.native
  
  def getTrace(err: js.Error): js.Object = js.native
  
  def handle(transports: typingsSlinky.winstonTransport.mod.^ *): Unit = js.native
  
  var handlers: Map[_, _] = js.native
  
  var logger: Logger = js.native
  
  def unhandle(transports: typingsSlinky.winstonTransport.mod.^ *): Unit = js.native
}
@JSImport("winston", "ExceptionHandler")
@js.native
object ExceptionHandler extends TopLevel[ExceptionHandler]
