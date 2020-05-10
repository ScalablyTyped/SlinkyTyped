package typingsSlinky.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsDocTags extends js.Object {
  var params: js.UndefOr[js.Array[JsDocParam]] = js.native
  var returns: js.UndefOr[JsDocReturns] = js.native
}

object JsDocTags {
  @scala.inline
  def apply(): JsDocTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsDocTags]
  }
  @scala.inline
  implicit class JsDocTagsOps[Self <: JsDocTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: js.Array[JsDocParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withReturns(value: JsDocReturns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(js.undefined)
        ret
    }
  }
  
}

