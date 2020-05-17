package typingsSlinky.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  var document: js.Array[_] = js.native
  var postProcessingSteps: js.Array[_] = js.native
  def buildHtml(): js.Array[_] = js.native
  def closeTag(name: String): Unit = js.native
  def extractOptions(args: js.Any): js.Any = js.native
  def openTag(name: String, attributes: js.Any): Unit = js.native
  def raw(str: String): Unit = js.native
  def subview(outletName: js.Any, subview: View): Unit = js.native
  def tag(name: String, args: js.Any*): Unit = js.native
  def text(str: String): Unit = js.native
}

object Builder {
  @scala.inline
  def apply(
    buildHtml: () => js.Array[_],
    closeTag: String => Unit,
    document: js.Array[_],
    extractOptions: js.Any => js.Any,
    openTag: (String, js.Any) => Unit,
    postProcessingSteps: js.Array[_],
    raw: String => Unit,
    subview: (js.Any, View) => Unit,
    tag: (String, /* repeated */ js.Any) => Unit,
    text: String => Unit
  ): Builder = {
    val __obj = js.Dynamic.literal(buildHtml = js.Any.fromFunction0(buildHtml), closeTag = js.Any.fromFunction1(closeTag), document = document.asInstanceOf[js.Any], extractOptions = js.Any.fromFunction1(extractOptions), openTag = js.Any.fromFunction2(openTag), postProcessingSteps = postProcessingSteps.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), subview = js.Any.fromFunction2(subview), tag = js.Any.fromFunction2(tag), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Builder]
  }
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildHtml(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloseTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDocument(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtractOptions(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenTag(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPostProcessingSteps(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessingSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubview(value: (js.Any, View) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subview")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTag(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

