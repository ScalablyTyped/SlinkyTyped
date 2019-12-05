package typingsSlinky.webdriverio

import typingsSlinky.webdriverio.WebdriverIO.BrowserObject
import typingsSlinky.webdriverio.WebdriverIO.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * find a single element on the page.
    */
  @JSName("$")
  var $: (js.Function1[/* selector */ String | js.Function, js.Promise[Element]]) with typingsSlinky.webdriverio.$ = js.native
  /**
    * find multiple elements on the page.
    */
  @JSName("$$")
  var $$: (js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]) with typingsSlinky.webdriverio.$$ = js.native
  var browser: BrowserObject with typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
}

