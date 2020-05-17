package typingsSlinky.webgme.Gme

import typingsSlinky.webgme.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerMeta extends js.Object {
  var items: js.Array[Id] = js.native
  /**
    * the maximum allowed targets for a pointer is 1.
    * more than 1 requires a set.
    */
  var max: Double = js.native
}

object PointerMeta {
  @scala.inline
  def apply(items: js.Array[Id], max: Double): PointerMeta = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerMeta]
  }
  @scala.inline
  implicit class PointerMetaOps[Self <: PointerMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

