package typingsSlinky.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMeta extends js.Object {
  var meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}

object AnonMeta {
  @scala.inline
  def apply(meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): AnonMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeta]
  }
  @scala.inline
  implicit class AnonMetaOps[Self <: AnonMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

