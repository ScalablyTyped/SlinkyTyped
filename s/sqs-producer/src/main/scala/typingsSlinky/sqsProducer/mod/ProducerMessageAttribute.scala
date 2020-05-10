package typingsSlinky.sqsProducer.mod

import typingsSlinky.node.Buffer
import typingsSlinky.sqsProducer.sqsProducerStrings.Binary
import typingsSlinky.sqsProducer.sqsProducerStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerMessageAttribute extends js.Object {
  var BinaryValue: js.UndefOr[Buffer] = js.native
  var DataType: String | Binary = js.native
  var StringValue: js.UndefOr[java.lang.String] = js.native
}

object ProducerMessageAttribute {
  @scala.inline
  def apply(DataType: String | Binary): ProducerMessageAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessageAttribute]
  }
  @scala.inline
  implicit class ProducerMessageAttributeOps[Self <: ProducerMessageAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: String | Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryValue(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(js.undefined)
        ret
    }
  }
  
}

