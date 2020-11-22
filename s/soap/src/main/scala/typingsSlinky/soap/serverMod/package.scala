package typingsSlinky.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverMod {
  
  type Response = typingsSlinky.node.httpMod.ServerResponse
  
  type ServerType = typingsSlinky.node.httpMod.Server | typingsSlinky.soap.serverMod.IExpressApp
}
