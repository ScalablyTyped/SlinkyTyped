package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriver.AsyncClient
import typingsSlinky.webdriver.WebDriver.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.webdriverio.WebdriverIO.Browser because var conflicts: config, options. Inlined  */ @js.native
trait BrowserObject
  extends typingsSlinky.webdriverio.WebdriverIOAsync.Browser
     with ClientOptions
     with AsyncClient

