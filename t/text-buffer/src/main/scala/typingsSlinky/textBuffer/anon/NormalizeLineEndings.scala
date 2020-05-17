package typingsSlinky.textBuffer.anon

import typingsSlinky.textBuffer.textBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.native
  var undo: js.UndefOr[skip] = js.native
}

object NormalizeLineEndings {
  @scala.inline
  def apply(): NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeLineEndings]
  }
  @scala.inline
  implicit class NormalizeLineEndingsOps[Self <: NormalizeLineEndings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizeLineEndings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeLineEndings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeLineEndings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeLineEndings")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: skip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
  }
  
}

