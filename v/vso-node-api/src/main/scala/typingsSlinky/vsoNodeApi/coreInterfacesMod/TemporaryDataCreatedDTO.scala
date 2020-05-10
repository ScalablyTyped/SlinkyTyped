package typingsSlinky.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporaryDataCreatedDTO extends TemporaryDataDTO {
  var expirationDate: js.Date = js.native
  var id: String = js.native
  var url: String = js.native
}

object TemporaryDataCreatedDTO {
  @scala.inline
  def apply(
    expirationDate: js.Date,
    expirationSeconds: Double,
    id: String,
    origin: String,
    url: String,
    value: js.Any
  ): TemporaryDataCreatedDTO = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
  @scala.inline
  implicit class TemporaryDataCreatedDTOOps[Self <: TemporaryDataCreatedDTO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

