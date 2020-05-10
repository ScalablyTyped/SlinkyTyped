package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFontcolor extends js.Object {
  /**
    * To specify the font color of the context menu items. 'gray' | '##666699'
    */
  var `font-color`: js.UndefOr[js.Any] = js.native
  /**
    * To display or remove the Save Image context menu item. true | false
    */
  var image: js.UndefOr[Boolean] = js.native
  /**
    * To display or remove the Lock/Unlock Scrolling context menu item. true | false
    */
  var lock: js.UndefOr[Boolean] = js.native
  /**
    * Use the object to display or remove individual Share Image context menu items: email, facebook, twitter, and linkedin. {...}
    */
  var share: js.UndefOr[js.Any] = js.native
}

object AnonFontcolor {
  @scala.inline
  def apply(): AnonFontcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFontcolor]
  }
  @scala.inline
  implicit class AnonFontcolorOps[Self <: AnonFontcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFont-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-color")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withShare(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(js.undefined)
        ret
    }
  }
  
}

