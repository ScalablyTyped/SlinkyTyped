package typingsSlinky.winrt.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.anon.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAuthenticationOperation
  extends IAsyncOperation[UserIdentity]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
  
  def getResults(): UserIdentity = js.native
  
  @JSName("operation")
  var operation_UserAuthenticationOperation: `6` = js.native
}
