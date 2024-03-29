package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracer extends StObject {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  
  /**
    * Log the given data to the trace Log
    */
  def log(message: String): Unit = js.native
  def log(message: String, verbose: String): Unit = js.native
}
