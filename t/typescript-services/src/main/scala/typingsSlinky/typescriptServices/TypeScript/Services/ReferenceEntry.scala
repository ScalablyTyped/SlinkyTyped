package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceEntry extends js.Object {
  var fileName: String = js.native
  var isWriteAccess: Boolean = js.native
  var limChar: Double = js.native
  var minChar: Double = js.native
}

object ReferenceEntry {
  @scala.inline
  def apply(fileName: String, isWriteAccess: Boolean, limChar: Double, minChar: Double): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  @scala.inline
  implicit class ReferenceEntryOps[Self <: ReferenceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWriteAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

