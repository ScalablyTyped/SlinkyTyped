package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneInformation extends ClientValueObject {
  def get_bias(): Double = js.native
  def get_daylightBias(): Double = js.native
  def get_standardBias(): Double = js.native
}

object TimeZoneInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_bias: () => Double,
    get_daylightBias: () => Double,
    get_standardBias: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): TimeZoneInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_bias = js.Any.fromFunction0(get_bias), get_daylightBias = js.Any.fromFunction0(get_daylightBias), get_standardBias = js.Any.fromFunction0(get_standardBias), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[TimeZoneInformation]
  }
  @scala.inline
  implicit class TimeZoneInformationOps[Self <: TimeZoneInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_bias(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_bias")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_daylightBias(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_daylightBias")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_standardBias(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_standardBias")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

