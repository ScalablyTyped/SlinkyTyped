package typingsSlinky.sqsProducer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerMessage extends js.Object {
  var body: String = js.native
  var deduplicationId: js.UndefOr[String] = js.native
  var delaySeconds: js.UndefOr[Double] = js.native
  var groupId: js.UndefOr[String] = js.native
  var id: String = js.native
  var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.native
}

object ProducerMessage {
  @scala.inline
  def apply(body: String, id: String): ProducerMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
  @scala.inline
  implicit class ProducerMessageOps[Self <: ProducerMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeduplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeduplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDelaySeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelaySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delaySeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAttributes(value: StringDictionary[ProducerMessageAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAttributes")(js.undefined)
        ret
    }
  }
  
}

