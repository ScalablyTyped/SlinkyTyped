package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceEntry extends DocumentSpan {
  var isDefinition: Boolean = js.native
  var isInString: js.UndefOr[`true`] = js.native
  var isWriteAccess: Boolean = js.native
}

object ReferenceEntry {
  @scala.inline
  def apply(fileName: java.lang.String, isDefinition: Boolean, isWriteAccess: Boolean, textSpan: TextSpan): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isDefinition = isDefinition.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  @scala.inline
  implicit class ReferenceEntryOps[Self <: ReferenceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefinition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWriteAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInString(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInString")(js.undefined)
        ret
    }
  }
  
}

