package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.yandexMapsStrings.always
import typingsSlinky.yandexMaps.yandexMapsStrings.ifNull
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFitToViewport extends js.Object {
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.native
  var controls: js.UndefOr[js.Array[String]] = js.native
  var direction: js.UndefOr[js.Array[Double] | String] = js.native
  var hotkeysEnabled: js.UndefOr[Boolean] = js.native
  var scrollZoomBehavior: js.UndefOr[Boolean] = js.native
  var span: js.UndefOr[js.Array[Double] | String] = js.native
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.native
}

object AutoFitToViewport {
  @scala.inline
  def apply(): AutoFitToViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFitToViewport]
  }
  @scala.inline
  implicit class AutoFitToViewportOps[Self <: AutoFitToViewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFitToViewport(value: none | ifNull | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitToViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFitToViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitToViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHotkeysEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotkeysEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotkeysEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotkeysEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoomBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoomBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoomBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoomBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMapOpenBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMapOpenBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMapOpenBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMapOpenBlock")(js.undefined)
        ret
    }
  }
  
}

