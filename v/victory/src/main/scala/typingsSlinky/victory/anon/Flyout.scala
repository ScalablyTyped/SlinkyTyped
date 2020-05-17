package typingsSlinky.victory.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flyout extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.native
  var flyout: js.UndefOr[CSSProperties] = js.native
  var labels: js.UndefOr[CSSProperties] = js.native
}

object Flyout {
  @scala.inline
  def apply(): Flyout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flyout]
  }
  @scala.inline
  implicit class FlyoutOps[Self <: Flyout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyout(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyout")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

