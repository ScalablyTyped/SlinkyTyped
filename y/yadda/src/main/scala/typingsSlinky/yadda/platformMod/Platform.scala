package typingsSlinky.yadda.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  def get_container(): js.Any = js.native
  def is_browser(): Boolean = js.native
  def is_karma(): Boolean = js.native
   // Window | NodeJS.Global | Phantom
  def is_node(): Boolean = js.native
  def is_phantom(): Boolean = js.native
}

object Platform {
  @scala.inline
  def apply(
    get_container: () => js.Any,
    is_browser: () => Boolean,
    is_karma: () => Boolean,
    is_node: () => Boolean,
    is_phantom: () => Boolean
  ): Platform = {
    val __obj = js.Dynamic.literal(get_container = js.Any.fromFunction0(get_container), is_browser = js.Any.fromFunction0(is_browser), is_karma = js.Any.fromFunction0(is_karma), is_node = js.Any.fromFunction0(is_node), is_phantom = js.Any.fromFunction0(is_phantom))
    __obj.asInstanceOf[Platform]
  }
  @scala.inline
  implicit class PlatformOps[Self <: Platform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_container(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_container")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_browser(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_browser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_karma(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_karma")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_node(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_node")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_phantom(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_phantom")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

