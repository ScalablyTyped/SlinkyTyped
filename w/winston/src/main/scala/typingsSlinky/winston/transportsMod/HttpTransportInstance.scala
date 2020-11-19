package typingsSlinky.winston.transportsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.winston.anon.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpTransportInstance
  extends typingsSlinky.winstonTransport.mod.^
     with Instantiable0[HttpTransportInstance]
     with Instantiable1[/* options */ HttpTransportOptions, HttpTransportInstance] {
  
  var agent: js.UndefOr[Agent | Null] = js.native
  
  var auth: js.UndefOr[Bearer] = js.native
  
  var host: String = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var ssl: Boolean = js.native
}
