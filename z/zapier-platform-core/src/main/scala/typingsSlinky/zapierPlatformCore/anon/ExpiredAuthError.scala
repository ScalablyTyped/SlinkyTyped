package typingsSlinky.zapierPlatformCore.anon

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredAuthError extends js.Object {
  var ExpiredAuthError: Instantiable0[js.Error] = js.native
  var HaltedError: Instantiable0[js.Error] = js.native
  var RefreshAuthError: Instantiable0[js.Error] = js.native
}

object ExpiredAuthError {
  @scala.inline
  def apply(
    ExpiredAuthError: Instantiable0[js.Error],
    HaltedError: Instantiable0[js.Error],
    RefreshAuthError: Instantiable0[js.Error]
  ): ExpiredAuthError = {
    val __obj = js.Dynamic.literal(ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredAuthError]
  }
  @scala.inline
  implicit class ExpiredAuthErrorOps[Self <: ExpiredAuthError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiredAuthError(value: Instantiable0[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiredAuthError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaltedError(value: Instantiable0[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HaltedError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshAuthError(value: Instantiable0[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshAuthError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

