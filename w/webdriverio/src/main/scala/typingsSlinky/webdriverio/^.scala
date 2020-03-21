package typingsSlinky.webdriverio

import typingsSlinky.webdriverio.WebdriverIO.BrowserObject
import typingsSlinky.webdriverio.WebdriverIO.Element
import typingsSlinky.webdriverio.WebdriverIO.ElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * find multiple elements on the page.
    */
  @JSName("$$")
  var $: (js.Function1[/* selector */ String | js.Function, js.Promise[ElementArray]]) with typingsSlinky.webdriverio.$ = js.native
  /**
    * find a single element on the page.
    */
  @JSName("$")
  var _empty: (js.Function1[/* selector */ String | js.Function, js.Promise[Element]]) with typingsSlinky.webdriverio._empty = js.native
  var browser: BrowserObject with typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
}

