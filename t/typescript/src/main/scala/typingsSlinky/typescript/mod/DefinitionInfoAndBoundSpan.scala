package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionInfoAndBoundSpan extends js.Object {
  var definitions: js.UndefOr[js.Array[DefinitionInfo]] = js.native
  var textSpan: TextSpan = js.native
}

object DefinitionInfoAndBoundSpan {
  @scala.inline
  def apply(textSpan: TextSpan): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
  @scala.inline
  implicit class DefinitionInfoAndBoundSpanOps[Self <: DefinitionInfoAndBoundSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitions(value: js.Array[DefinitionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
  }
  
}

