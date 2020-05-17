package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cscrequired extends js.Object {
  var allowed: Boolean = js.native
  var csc_required: Boolean = js.native
  var items: js.Array[Id] = js.native
}

object Cscrequired {
  @scala.inline
  def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[Id]): Cscrequired = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], csc_required = csc_required.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cscrequired]
  }
  @scala.inline
  implicit class CscrequiredOps[Self <: Cscrequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsc_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

