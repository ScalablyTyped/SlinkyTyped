package typingsSlinky.teenyRequest.mod

import typingsSlinky.teenyRequest.teenyStatisticsMod.TeenyStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("teeny-request", "teenyRequest")
@js.native
object teenyRequest extends js.Object {
  
  def apply(reqOpts: Options): Request = js.native
  def apply(reqOpts: Options, callback: RequestCallback[_]): Unit = js.native
  
  var defaults: js.Function1[
    /* defaults */ CoreOptions, 
    js.Function2[
      /* reqOpts */ Options, 
      /* callback */ js.UndefOr[RequestCallback[js.Any]], 
      Unit | Request
    ]
  ] = js.native
  
  var resetStats: js.Function0[Unit] = js.native
  
  var stats: TeenyStatistics = js.native
}
