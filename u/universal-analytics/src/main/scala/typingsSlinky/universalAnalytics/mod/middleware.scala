package typingsSlinky.universalAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("universal-analytics", "middleware")
@js.native
object middleware extends js.Object {
  
  def apply(tid: String): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
  def apply(tid: String, options: MiddlewareOptions): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
}
