package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserverInit extends js.Object {
  var buffered: js.UndefOr[scala.Boolean] = js.native
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object PerformanceObserverInit {
  @scala.inline
  def apply(): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceObserverInit]
  }
  @scala.inline
  implicit class PerformanceObserverInitOps[Self <: PerformanceObserverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffered(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryTypes(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

