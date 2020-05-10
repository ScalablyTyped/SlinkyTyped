package typingsSlinky.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleServerEventsOptions extends js.Object {
  var handlers: js.UndefOr[StringDictionary[js.Function]] = js.native
  var heartbeatIntervalMs: js.UndefOr[Double] = js.native
  var heartbeatUrl: js.UndefOr[String] = js.native
  var receivers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var success: js.UndefOr[js.Function3[/* selector */ String, /* msg */ String, /* e */ js.Any, Unit]] = js.native
  var unRegisterUrl: js.UndefOr[String] = js.native
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[String], 
      /* target */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* json */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
}

object HandleServerEventsOptions {
  @scala.inline
  def apply(): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
  @scala.inline
  implicit class HandleServerEventsOptionsOps[Self <: HandleServerEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivers")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withUnRegisterUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unRegisterUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnRegisterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unRegisterUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(
      value: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

