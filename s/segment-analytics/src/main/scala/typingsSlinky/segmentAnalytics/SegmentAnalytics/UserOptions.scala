package typingsSlinky.segmentAnalytics.SegmentAnalytics

import typingsSlinky.segmentAnalytics.anon.Key
import typingsSlinky.segmentAnalytics.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOptions extends js.Object {
  var cookie: js.UndefOr[Key] = js.native
  var localStorage: js.UndefOr[KeyString] = js.native
  var persist: js.UndefOr[Boolean] = js.native
}

object UserOptions {
  @scala.inline
  def apply(): UserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOptions]
  }
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorage(value: KeyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
  }
  
}

