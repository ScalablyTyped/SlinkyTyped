package typingsSlinky.webdriverio

import typingsSlinky.webdriver.WebDriver.AttachSessionOptions
import typingsSlinky.webdriverio.WebdriverIO.BrowserObject
import typingsSlinky.webdriverio.WebdriverIO.Element
import typingsSlinky.webdriverio.WebdriverIO.ElementArray
import typingsSlinky.webdriverio.WebdriverIO.MultiRemoteOptions
import typingsSlinky.webdriverio.WebdriverIO.RemoteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
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
  /**
    * should replace `webdriverio.d.ts` in v6
    */
  @js.native
  object WebdriverIO extends js.Object {
    def attach(options: AttachSessionOptions): BrowserObject = js.native
    def multiremote(options: MultiRemoteOptions): BrowserObject = js.native
    def remote(): BrowserObject = js.native
    def remote(options: RemoteOptions): BrowserObject = js.native
    def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): BrowserObject = js.native
  }
  
  @js.native
  object WebdriverIOAsync extends js.Object {
    def attach(options: AttachSessionOptions): typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def multiremote(options: MultiRemoteOptions): typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(): typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(options: RemoteOptions): typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  }
  
}

