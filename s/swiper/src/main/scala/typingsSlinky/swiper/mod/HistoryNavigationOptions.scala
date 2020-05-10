package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryNavigationOptions extends js.Object {
  /**
    * Url key for slides
    *
    * @default 'slides'
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Works in addition to hashnav or history to replace current url state with the
    * new one instead of adding it to history
    *
    * @default false
    */
  var replaceState: js.UndefOr[Boolean] = js.native
}

object HistoryNavigationOptions {
  @scala.inline
  def apply(): HistoryNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryNavigationOptions]
  }
  @scala.inline
  implicit class HistoryNavigationOptionsOps[Self <: HistoryNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceState")(js.undefined)
        ret
    }
  }
  
}

