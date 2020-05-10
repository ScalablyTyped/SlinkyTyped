package typingsSlinky.wordpressBlockSerializationSpecParser.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var attrs: Record[String, _] = js.native
  var blockName: String | Null = js.native
  var innerBlocks: js.Array[Block] = js.native
  var innerContent: js.Array[String] = js.native
  var innerHTML: String = js.native
}

object Block {
  @scala.inline
  def apply(
    attrs: Record[String, _],
    innerBlocks: js.Array[Block],
    innerContent: js.Array[String],
    innerHTML: String
  ): Block = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerBlocks(value: js.Array[Block]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockName")(null)
        ret
    }
  }
  
}

