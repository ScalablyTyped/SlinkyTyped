package typingsSlinky.webidl2.anon

import typingsSlinky.webidl2.mod.ValueDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BareMessage extends js.Object {
  var bareMessage: String = js.native
  var context: String = js.native
  var input: String = js.native
  var line: Double = js.native
  var message: String = js.native
  var sourceName: js.UndefOr[String] = js.native
  var tokens: js.Array[ValueDescription] = js.native
}

object BareMessage {
  @scala.inline
  def apply(
    bareMessage: String,
    context: String,
    input: String,
    line: Double,
    message: String,
    tokens: js.Array[ValueDescription]
  ): BareMessage = {
    val __obj = js.Dynamic.literal(bareMessage = bareMessage.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[BareMessage]
  }
  @scala.inline
  implicit class BareMessageOps[Self <: BareMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBareMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bareMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[ValueDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(js.undefined)
        ret
    }
  }
  
}

