package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventParams
  extends /* key */ StringDictionary[js.Any] {
  var dp: js.UndefOr[String] = js.native
  /**
    * Event Action
    *
    * **Required for event hit type.**
    *
    * Specifies the event action. Must not be empty.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Action`
    */
  var ea: js.UndefOr[String] = js.native
  /**
    * Event Category
    *
    * **Required for event hit type.**
    *
    * Specifies the event category. Must not be empty.
    *
    * Max length: 150 Bytes
    *
    * Example value: `Category`
    */
  var ec: js.UndefOr[String] = js.native
  /**
    * Event Label
    *
    * Specifies the event label.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Label`
    */
  var el: js.UndefOr[String] = js.native
  /**
    * Event Value
    *
    * Specifies the event value. Values must be non-negative.
    *
    * Example value: `55`
    */
  var ev: js.UndefOr[String | Double] = js.native
  var p: js.UndefOr[String] = js.native
}

object EventParams {
  @scala.inline
  def apply(): EventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventParams]
  }
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(js.undefined)
        ret
    }
    @scala.inline
    def withEa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ea")(js.undefined)
        ret
    }
    @scala.inline
    def withEc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withEv(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ev")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
  }
  
}

