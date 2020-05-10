package typingsSlinky.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovieStarOptions extends js.Object {
  var bufferTime: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double | Null] = js.native
  var onconnect: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var serverURL: js.UndefOr[String | Null] = js.native
}

object MovieStarOptions {
  @scala.inline
  def apply(): MovieStarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovieStarOptions]
  }
  @scala.inline
  implicit class MovieStarOptionsOps[Self <: MovieStarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(null)
        ret
    }
    @scala.inline
    def withOnconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnconnectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconnect")(null)
        ret
    }
    @scala.inline
    def withServerURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(js.undefined)
        ret
    }
    @scala.inline
    def withServerURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(null)
        ret
    }
  }
  
}

