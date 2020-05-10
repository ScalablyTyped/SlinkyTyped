package typingsSlinky.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var inertia: js.UndefOr[Boolean] = js.native
  var inertiaDuration: js.UndefOr[Double] = js.native
  var tremor: js.UndefOr[Double] = js.native
}

object IDragOptions {
  @scala.inline
  def apply(): IDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragOptions]
  }
  @scala.inline
  implicit class IDragOptionsOps[Self <: IDragOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTremor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tremor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTremor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tremor")(js.undefined)
        ret
    }
  }
  
}

