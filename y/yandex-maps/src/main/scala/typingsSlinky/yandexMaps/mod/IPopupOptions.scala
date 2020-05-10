package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupOptions extends js.Object {
  var closeTimeout: js.UndefOr[Double] = js.native
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  var openTimeout: js.UndefOr[Double] = js.native
  var pane: js.UndefOr[IPane | String] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object IPopupOptions {
  @scala.inline
  def apply(): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupOptions]
  }
  @scala.inline
  implicit class IPopupOptionsOps[Self <: IPopupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractivityModel(value: InteractivityModelKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractivityModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityModel")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: IPane | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: IProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

