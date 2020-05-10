package typingsSlinky.tabris

import typingsSlinky.std.Document_
import typingsSlinky.std.Navigator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window_ extends js.Object {
  var cordova: Cordova_ = js.native
  var document: Document_ = js.native
  var navigator: Navigator_ = js.native
  var plugins: CordovaPlugins = js.native
  var window: Window_ = js.native
}

object Window_ {
  @scala.inline
  def apply(
    cordova: Cordova_,
    document: Document_,
    navigator: Navigator_,
    plugins: CordovaPlugins,
    window: Window_
  ): Window_ = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_]
  }
  @scala.inline
  implicit class Window_Ops[Self <: Window_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCordova(value: Cordova_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigator(value: Navigator_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: CordovaPlugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

