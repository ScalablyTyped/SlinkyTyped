package typingsSlinky.semanticUiProgress.anon

import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'value'> */
@js.native
trait PickImplvalue extends js.Object {
  var value: `false` | Double = js.native
}

object PickImplvalue {
  @scala.inline
  def apply(value: `false` | Double): PickImplvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvalue]
  }
  @scala.inline
  implicit class PickImplvalueOps[Self <: PickImplvalue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

