package typingsSlinky.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIO {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Omit
  import typingsSlinky.webdriver.WebDriver.DesiredCapabilities
  import typingsSlinky.webdriverio.Anon_Capabilities
  import typingsSlinky.webdriverio.webdriverioStrings.after
  import typingsSlinky.webdriverio.webdriverioStrings.afterSession
  import typingsSlinky.webdriverio.webdriverioStrings.before
  import typingsSlinky.webdriverio.webdriverioStrings.beforeSession
  import typingsSlinky.webdriverio.webdriverioStrings.onComplete
  import typingsSlinky.webdriverio.webdriverioStrings.onPrepare

  type MultiRemoteCapabilities = StringDictionary[Anon_Capabilities]
  type MultiRemoteOptions = StringDictionary[DesiredCapabilities]
  type TouchActions = String | TouchAction | js.Array[TouchAction]
  type _Hooks = Omit[
    HookFunctions, 
    onPrepare | onComplete | before | after | beforeSession | afterSession
  ]
  type _HooksArray = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>}
    */ typingsSlinky.webdriverio.webdriverioStrings._HooksArray with js.Any
}
