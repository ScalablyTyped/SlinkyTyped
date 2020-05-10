package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.AnonErrors
import typingsSlinky.yaml.utilMod.Type.QUOTE_DOUBLE
import typingsSlinky.yaml.utilMod.Type.QUOTE_SINGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuoteValue
  extends Scalar
     with Node {
  val strValue: Null | String | AnonErrors = js.native
  @JSName("type")
  var type_QuoteValue: QUOTE_DOUBLE | QUOTE_SINGLE = js.native
}

object QuoteValue {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteValue]
  }
  @scala.inline
  implicit class QuoteValueOps[Self <: QuoteValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: QUOTE_DOUBLE | QUOTE_SINGLE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrValue(value: String | AnonErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strValue")(null)
        ret
    }
  }
  
}

