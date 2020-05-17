package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlBuilder extends js.Object {
  def addAttribute(name: String, value: String): Unit = js.native
  def addCommunitiesCssClass(cssClassName: String): Unit = js.native
  def addCssClass(cssClassName: String): Unit = js.native
  def renderBeginTag(tagName: String): Unit = js.native
  def renderEndTag(): Unit = js.native
  def write(s: String): Unit = js.native
  def writeEncoded(s: String): Unit = js.native
}

object HtmlBuilder {
  @scala.inline
  def apply(
    addAttribute: (String, String) => Unit,
    addCommunitiesCssClass: String => Unit,
    addCssClass: String => Unit,
    renderBeginTag: String => Unit,
    renderEndTag: () => Unit,
    write: String => Unit,
    writeEncoded: String => Unit
  ): HtmlBuilder = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addCommunitiesCssClass = js.Any.fromFunction1(addCommunitiesCssClass), addCssClass = js.Any.fromFunction1(addCssClass), renderBeginTag = js.Any.fromFunction1(renderBeginTag), renderEndTag = js.Any.fromFunction0(renderEndTag), write = js.Any.fromFunction1(write), writeEncoded = js.Any.fromFunction1(writeEncoded))
    __obj.asInstanceOf[HtmlBuilder]
  }
  @scala.inline
  implicit class HtmlBuilderOps[Self <: HtmlBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAttribute(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddCommunitiesCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommunitiesCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderBeginTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBeginTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderEndTag(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEndTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteEncoded(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeEncoded")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

