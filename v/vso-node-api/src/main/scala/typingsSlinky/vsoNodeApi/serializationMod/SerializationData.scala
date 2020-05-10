package typingsSlinky.vsoNodeApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationData extends js.Object {
  var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.native
  var responseIsCollection: Boolean = js.native
  var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.native
}

object SerializationData {
  @scala.inline
  def apply(responseIsCollection: Boolean): SerializationData = {
    val __obj = js.Dynamic.literal(responseIsCollection = responseIsCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationData]
  }
  @scala.inline
  implicit class SerializationDataOps[Self <: SerializationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseIsCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseIsCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTypeMetadata(value: ContractMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTypeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTypeMetadata(value: ContractMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTypeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTypeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTypeMetadata")(js.undefined)
        ret
    }
  }
  
}

