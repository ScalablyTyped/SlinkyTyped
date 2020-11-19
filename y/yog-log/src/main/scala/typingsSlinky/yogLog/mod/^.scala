package typingsSlinky.yogLog.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yog-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  def apply(config: LogConfig): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
}
