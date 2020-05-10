package typingsSlinky.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTabOptions extends js.Object {
  /** Decides whether the new tab should be focused */
  var active: js.UndefOr[Boolean] = js.native
  /** Inserts the new tab after the current one */
  var insert: js.UndefOr[Boolean] = js.native
  /** Makes the browser re-focus the current tab on close */
  var setParent: js.UndefOr[Boolean] = js.native
}

object OpenTabOptions {
  @scala.inline
  def apply(): OpenTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTabOptions]
  }
  @scala.inline
  implicit class OpenTabOptionsOps[Self <: OpenTabOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.undefined)
        ret
    }
  }
  
}

