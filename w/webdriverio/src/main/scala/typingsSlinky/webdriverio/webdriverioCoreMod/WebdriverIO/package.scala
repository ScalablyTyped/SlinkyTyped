package typingsSlinky.webdriverio.webdriverioCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIO {
  type MockOverwrite = java.lang.String | (typingsSlinky.std.Record[java.lang.String, js.Any]) | typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.MockOverwriteFunction
  type MockOverwriteFunction = js.Function2[
    /* request */ typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.Request, 
    /* client */ typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.CDPSession, 
    js.Promise[java.lang.String | (typingsSlinky.std.Record[java.lang.String, js.Any])]
  ]
  type MultiRemoteCapabilities = org.scalablytyped.runtime.StringDictionary[typingsSlinky.webdriverio.anon.Capabilities]
  type MultiRemoteOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.webdriver.WebDriver.DesiredCapabilities]
  type ServiceEntry = java.lang.String | typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.HookFunctions | (js.Tuple2[
    java.lang.String, 
    typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceOption
  ]) | js.Object
  type ServiceOption = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TouchActions = java.lang.String | typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction | js.Array[typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction]
}
