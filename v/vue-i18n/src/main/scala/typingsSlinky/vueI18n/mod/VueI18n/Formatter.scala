package typingsSlinky.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  def interpolate(message: String, values: js.UndefOr[Values], path: String): js.Array[_] | Null = js.native
}

object Formatter {
  @scala.inline
  def apply(interpolate: (String, js.UndefOr[Values], String) => js.Array[_] | Null): Formatter = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction3(interpolate))
    __obj.asInstanceOf[Formatter]
  }
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterpolate(value: (String, js.UndefOr[Values], String) => js.Array[_] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

