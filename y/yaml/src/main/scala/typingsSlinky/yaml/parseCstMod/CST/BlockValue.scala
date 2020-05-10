package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.BLOCK_FOLDED
import typingsSlinky.yaml.utilMod.Type.BLOCK_LITERAL
import typingsSlinky.yaml.yamlStrings.CLIP
import typingsSlinky.yaml.yamlStrings.KEEP
import typingsSlinky.yaml.yamlStrings.STRIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockValue
  extends Scalar
     with Node {
  var blockIndent: Double | Null = js.native
  var chomping: CLIP | KEEP | STRIP = js.native
  var header: Range = js.native
  val strValue: String | Null = js.native
  @JSName("type")
  var type_BlockValue: BLOCK_FOLDED | BLOCK_LITERAL = js.native
}

object BlockValue {
  @scala.inline
  def apply(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED | BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean
  ): BlockValue = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockValue]
  }
  @scala.inline
  implicit class BlockValueOps[Self <: BlockValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChomping(value: CLIP | KEEP | STRIP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chomping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: BLOCK_FOLDED | BLOCK_LITERAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockIndentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIndent")(null)
        ret
    }
    @scala.inline
    def withStrValue(value: String): Self = {
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

