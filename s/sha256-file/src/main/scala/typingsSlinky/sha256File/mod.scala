package typingsSlinky.sha256File

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha256-file", JSImport.Namespace)
  @js.native
  def apply(filename: String): String = js.native
  @JSImport("sha256-file", JSImport.Namespace)
  @js.native
  def apply(filename: String, callback: CallbackFunction): Unit = js.native
  
  type CallbackFunction = js.Function2[/* error */ js.Error | Null, /* sum */ String, Unit]
}
