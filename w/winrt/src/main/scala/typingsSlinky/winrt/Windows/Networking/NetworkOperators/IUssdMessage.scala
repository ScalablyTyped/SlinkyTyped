package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUssdMessage extends js.Object {
  var dataCodingScheme: Double = js.native
  var payloadAsText: String = js.native
  def getPayload(): js.typedarray.Uint8Array = js.native
  def setPayload(value: js.typedarray.Uint8Array): Unit = js.native
}

object IUssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => js.typedarray.Uint8Array,
    payloadAsText: String,
    setPayload: js.typedarray.Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[IUssdMessage]
  }
  @scala.inline
  implicit class IUssdMessageOps[Self <: IUssdMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataCodingScheme(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCodingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPayload(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPayload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPayloadAsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadAsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPayload(value: js.typedarray.Uint8Array => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPayload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

