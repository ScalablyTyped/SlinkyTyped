package typingsSlinky.sweetalert

import typingsSlinky.sweetalert.anon.PartialSwalOptions
import typingsSlinky.sweetalert.stateMod.ActionOptions
import typingsSlinky.sweetalert.stateMod.SwalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sweetalert/typings/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  val default: SweetAlert = js.native
  
  @js.native
  trait SweetAlert extends js.Object {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type SwalParams is not an array type */ params: SwalParams
    ): js.Promise[_] = js.native
    
    var close: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[String], Unit]] = js.native
    
    var getState: js.UndefOr[js.Function0[SwalState]] = js.native
    
    var setActionValue: js.UndefOr[js.Function1[/* opts */ String | ActionOptions, Unit]] = js.native
    
    var setDefaults: js.UndefOr[js.Function1[/* opts */ js.Object, Unit]] = js.native
    
    var stopLoading: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  type SwalParams = js.Array[String | PartialSwalOptions]
}
