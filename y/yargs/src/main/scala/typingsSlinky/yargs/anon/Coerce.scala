package typingsSlinky.yargs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coerce extends js.Object {
  def coerce(arg: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
}

object Coerce {
  @scala.inline
  def apply(
    coerce: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): Coerce = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
    __obj.asInstanceOf[Coerce]
  }
  @scala.inline
  implicit class CoerceOps[Self <: Coerce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerce(
      value: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

