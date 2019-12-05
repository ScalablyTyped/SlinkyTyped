package typingsSlinky.webdriverio.WebdriverIOAsync

import typingsSlinky.webdriver.WebDriver.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriver.WebDriver.Client ]: (args : std.Parameters<webdriver.WebDriver.Client[K]>): std.Promise<std.ReturnType<webdriver.WebDriver.Client[K]>>} */ @js.native
trait BrowserObject
  extends Browser
     with ClientOptions

