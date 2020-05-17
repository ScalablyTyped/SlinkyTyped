package typingsSlinky.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collator extends js.Object {
  def compare(x: String, y: String): Double = js.native
  def resolvedOptions(): ResolvedCollatorOptions = js.native
}

object Collator {
  @scala.inline
  def apply(compare: (String, String) => Double, resolvedOptions: () => ResolvedCollatorOptions): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[Collator]
  }
  @scala.inline
  implicit class CollatorOps[Self <: Collator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolvedOptions(value: () => ResolvedCollatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

