package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArea extends js.Object {
  var area: Boolean = js.native
  var base: Boolean = js.native
  var br: Boolean = js.native
  var col: Boolean = js.native
  var command: Boolean = js.native
  var embed: Boolean = js.native
  var hr: Boolean = js.native
  var img: Boolean = js.native
  var input: Boolean = js.native
  var link: Boolean = js.native
  var meta: Boolean = js.native
  var param: Boolean = js.native
  var source: Boolean = js.native
  var wbr: Boolean = js.native
}

object AnonArea {
  @scala.inline
  def apply(
    area: Boolean,
    base: Boolean,
    br: Boolean,
    col: Boolean,
    command: Boolean,
    embed: Boolean,
    hr: Boolean,
    img: Boolean,
    input: Boolean,
    link: Boolean,
    meta: Boolean,
    param: Boolean,
    source: Boolean,
    wbr: Boolean
  ): AnonArea = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArea]
  }
  @scala.inline
  implicit class AnonAreaOps[Self <: AnonArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWbr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wbr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

