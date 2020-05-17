package typingsSlinky.tabris

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Navigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var cordova: Cordova = js.native
  var document: Document = js.native
  var navigator: Navigator = js.native
  var plugins: CordovaPlugins = js.native
  var window: Window = js.native
}

object Window {
  @scala.inline
  def apply(
    cordova: Cordova,
    document: Document,
    navigator: Navigator,
    plugins: CordovaPlugins,
    window: Window
  ): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCordova(value: Cordova): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigator(value: Navigator): Self = {
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
    def withWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

