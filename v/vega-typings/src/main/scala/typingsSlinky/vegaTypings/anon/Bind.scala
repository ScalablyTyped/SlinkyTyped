package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.configMod.DefaultsConfig
import typingsSlinky.vegaTypings.vegaTypingsStrings.any
import typingsSlinky.vegaTypings.vegaTypingsStrings.container
import typingsSlinky.vegaTypings.vegaTypingsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bind extends js.Object {
  var bind: js.UndefOr[any | container | none] = js.native
  var defaults: js.UndefOr[DefaultsConfig] = js.native
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.native
  var timer: js.UndefOr[Boolean] = js.native
  var view: js.UndefOr[Boolean | js.Array[String]] = js.native
  var window: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object Bind {
  @scala.inline
  def apply(): Bind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bind]
  }
  @scala.inline
  implicit class BindOps[Self <: Bind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: any | container | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: DefaultsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

