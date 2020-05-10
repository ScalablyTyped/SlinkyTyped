package typingsSlinky.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure represents information about the length of an SmsTextMessage object when it is encoded as a PDU. */
@js.native
trait SmsEncodedLength extends js.Object {
  /** The number of bytes in the last segment of the encoded message. */
  var byteCountLastSegment: Double = js.native
  /** The number of bytes in each segment of the message. */
  var bytesPerSegment: Double = js.native
  /** The number of characters in the last segment of the encoded message. */
  var characterCountLastSegment: Double = js.native
  /** The estimated number of characters that can fit in one segment of the message. */
  var charactersPerSegment: Double = js.native
  /** The number of segments needed to encode the message. */
  var segmentCount: Double = js.native
}

object SmsEncodedLength {
  @scala.inline
  def apply(
    byteCountLastSegment: Double,
    bytesPerSegment: Double,
    characterCountLastSegment: Double,
    charactersPerSegment: Double,
    segmentCount: Double
  ): SmsEncodedLength = {
    val __obj = js.Dynamic.literal(byteCountLastSegment = byteCountLastSegment.asInstanceOf[js.Any], bytesPerSegment = bytesPerSegment.asInstanceOf[js.Any], characterCountLastSegment = characterCountLastSegment.asInstanceOf[js.Any], charactersPerSegment = charactersPerSegment.asInstanceOf[js.Any], segmentCount = segmentCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsEncodedLength]
  }
  @scala.inline
  implicit class SmsEncodedLengthOps[Self <: SmsEncodedLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteCountLastSegment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteCountLastSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesPerSegment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesPerSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterCountLastSegment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterCountLastSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharactersPerSegment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charactersPerSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

