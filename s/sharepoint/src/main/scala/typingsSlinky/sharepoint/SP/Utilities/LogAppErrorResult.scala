package typingsSlinky.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogAppErrorResult extends js.Object
@JSGlobal("SP.Utilities.LogAppErrorResult")
@js.native
object LogAppErrorResult extends js.Object {
  
  @js.native
  sealed trait accessDenied extends LogAppErrorResult
  
  @js.native
  sealed trait errorsThrottled extends LogAppErrorResult
  
  @js.native
  sealed trait success extends LogAppErrorResult
}
