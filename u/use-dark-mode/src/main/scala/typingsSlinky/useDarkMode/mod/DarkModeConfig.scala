package typingsSlinky.useDarkMode.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.WindowLocalStorage
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DarkModeConfig extends js.Object {
  var classNameDark: js.UndefOr[String] = js.native
   // A className to set "dark mode". Default = "dark-mode".
  var classNameLight: js.UndefOr[String] = js.native
   // A className to set "light mode". Default = "light-mode".
  var element: js.UndefOr[HTMLElement] = js.native
   // A storage provider. Default = `localStorage`.
  var global: js.UndefOr[Window_] = js.native
   // The element to apply the className. Default = `document.body`
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[Boolean], Unit]] = js.native
   // Overide the default className handler with a custom callback.
  var storageKey: js.UndefOr[String] = js.native
   // Specify the `localStorage` key. Default = "darkMode". Sewt to `null` to disable persistent storage.
  var storageProvider: js.UndefOr[WindowLocalStorage] = js.native
}

object DarkModeConfig {
  @scala.inline
  def apply(): DarkModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeConfig]
  }
  @scala.inline
  implicit class DarkModeConfigOps[Self <: DarkModeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNameDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameDark")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameLight")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* val */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageProvider(value: WindowLocalStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageProvider")(js.undefined)
        ret
    }
  }
  
}

