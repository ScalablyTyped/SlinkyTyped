package typingsSlinky.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversonMethods extends js.Object {
  def from(uri: String): Builder = js.native
  def registerMediaType(name: String, handler: js.Any): TraversonMethods = js.native
}

object TraversonMethods {
  @scala.inline
  def apply(from: String => Builder, registerMediaType: (String, js.Any) => TraversonMethods): TraversonMethods = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), registerMediaType = js.Any.fromFunction2(registerMediaType))
    __obj.asInstanceOf[TraversonMethods]
  }
  @scala.inline
  implicit class TraversonMethodsOps[Self <: TraversonMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterMediaType(value: (String, js.Any) => TraversonMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerMediaType")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

