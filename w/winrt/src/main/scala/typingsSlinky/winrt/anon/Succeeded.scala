package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Data.Json.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Succeeded extends js.Object {
  var result: JsonObject = js.native
  var succeeded: Boolean = js.native
}

object Succeeded {
  @scala.inline
  def apply(result: JsonObject, succeeded: Boolean): Succeeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Succeeded]
  }
  @scala.inline
  implicit class SucceededOps[Self <: Succeeded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

