package typingsSlinky.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporaryDataDTO extends js.Object {
  var expirationSeconds: Double = js.native
  var origin: String = js.native
  var value: js.Any = js.native
}

object TemporaryDataDTO {
  @scala.inline
  def apply(expirationSeconds: Double, origin: String, value: js.Any): TemporaryDataDTO = {
    val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataDTO]
  }
  @scala.inline
  implicit class TemporaryDataDTOOps[Self <: TemporaryDataDTO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

