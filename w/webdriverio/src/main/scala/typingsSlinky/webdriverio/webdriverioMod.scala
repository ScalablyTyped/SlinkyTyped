package typingsSlinky.webdriverio

import typingsSlinky.webdriver.WebDriver.AttachSessionOptions
import typingsSlinky.webdriverio.WebdriverIO.MultiRemoteOptions
import typingsSlinky.webdriverio.WebdriverIO.RemoteOptions
import typingsSlinky.webdriverio.WebdriverIOAsync.BrowserObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object webdriverioMod extends js.Object {
  def attach(options: AttachSessionOptions): BrowserObject = js.native
  @JSName("attach")
  def attach_BrowserObject(options: AttachSessionOptions): typingsSlinky.webdriverio.WebdriverIO.BrowserObject = js.native
  def multiremote(options: MultiRemoteOptions): BrowserObject = js.native
  @JSName("multiremote")
  def multiremote_BrowserObject(options: MultiRemoteOptions): typingsSlinky.webdriverio.WebdriverIO.BrowserObject = js.native
  def remote(): BrowserObject = js.native
  def remote(options: RemoteOptions): BrowserObject = js.native
  def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(): typingsSlinky.webdriverio.WebdriverIO.BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(options: RemoteOptions): typingsSlinky.webdriverio.WebdriverIO.BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): typingsSlinky.webdriverio.WebdriverIO.BrowserObject = js.native
}

