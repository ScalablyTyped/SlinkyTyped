package typingsSlinky.winrtUwp.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential operation. */
@js.native
trait KeyCredentialOperationResult extends js.Object {
  /** Gets the result of the key credential operation. */
  var result: IBuffer = js.native
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}

object KeyCredentialOperationResult {
  @scala.inline
  def apply(result: IBuffer, status: KeyCredentialStatus): KeyCredentialOperationResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialOperationResult]
  }
  @scala.inline
  implicit class KeyCredentialOperationResultOps[Self <: KeyCredentialOperationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: KeyCredentialStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

