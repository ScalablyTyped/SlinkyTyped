package typingsSlinky.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleLineMenuOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.native
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  var nextPageHint: js.UndefOr[String] = js.native
  var previousPageHint: js.UndefOr[String] = js.native
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  var separator: js.UndefOr[String] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var y: js.UndefOr[Double] = js.native
}

object SingleLineMenuOptions {
  @scala.inline
  def apply(): SingleLineMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleLineMenuOptions]
  }
  @scala.inline
  implicit class SingleLineMenuOptionsOps[Self <: SingleLineMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnUnexpectedKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnUnexpectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnUnexpectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnUnexpectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageHint")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousPageHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPageHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousPageHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPageHint")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

