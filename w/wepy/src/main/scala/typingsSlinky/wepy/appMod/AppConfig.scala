package typingsSlinky.wepy.appMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppConfig extends js.Object {
  var appEvents: js.UndefOr[js.Array[String]] = js.native
  var noPromiseAPI: js.UndefOr[js.Array[String] | StringDictionary[Boolean]] = js.native
  var pageEvents: js.UndefOr[js.Array[String]] = js.native
}

object AppConfig {
  @scala.inline
  def apply(): AppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfig]
  }
  @scala.inline
  implicit class AppConfigOps[Self <: AppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPromiseAPI(value: js.Array[String] | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPromiseAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPromiseAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPromiseAPI")(js.undefined)
        ret
    }
    @scala.inline
    def withPageEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageEvents")(js.undefined)
        ret
    }
  }
  
}

