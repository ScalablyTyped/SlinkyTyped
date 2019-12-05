package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverio {
  import typingsSlinky.std.Omit
  import typingsSlinky.std.Pick
  import typingsSlinky.webdriverio.WebdriverIO.Browser
  import typingsSlinky.webdriverio.WebdriverIO.TouchAction
  import typingsSlinky.webdriverio.WebdriverIOAsync.Element
  import typingsSlinky.webdriverio.webdriverioStrings.DOLLAR
  import typingsSlinky.webdriverio.webdriverioStrings.DOLLARDOLLAR
  import typingsSlinky.webdriverio.webdriverioStrings.ELEMENT
  import typingsSlinky.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf`
  import typingsSlinky.webdriverio.webdriverioStrings.addCommand
  import typingsSlinky.webdriverio.webdriverioStrings.config
  import typingsSlinky.webdriverio.webdriverioStrings.dragAndDrop
  import typingsSlinky.webdriverio.webdriverioStrings.elementId
  import typingsSlinky.webdriverio.webdriverioStrings.element_
  import typingsSlinky.webdriverio.webdriverioStrings.options
  import typingsSlinky.webdriverio.webdriverioStrings.overwriteCommand
  import typingsSlinky.webdriverio.webdriverioStrings.selector
  import typingsSlinky.webdriverio.webdriverioStrings.touchAction

  type $ = js.Function1[/* selector */ String | js.Function, js.Promise[Element]]
  type $$ = js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]
  // Browser commands wrapper with Promise
  type BrowserAsync = typingsSlinky.webdriverio.webdriverioStrings.BrowserAsync with js.Any with AsyncSelectors
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = Omit[
    Browser, 
    addCommand | overwriteCommand | options | config | DOLLAR | DOLLARDOLLAR | touchAction
  ]
  // Browser commands that should not be wrapper with promise
  type BrowserStatic = Pick[Browser, addCommand | overwriteCommand | options | config]
  // Element commands wrapper with Promise
  type ElementAsync = typingsSlinky.webdriverio.webdriverioStrings.ElementAsync with js.Any with AsyncSelectors
  // Element commands that should be wrapper with Promise
  type ElementPromise = Omit[
    typingsSlinky.webdriverio.WebdriverIO.Element, 
    addCommand | DOLLAR | DOLLARDOLLAR | selector | elementId | `element-6066-11e4-a52e-4f735466cecf` | ELEMENT | dragAndDrop | touchAction
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = Pick[
    typingsSlinky.webdriverio.WebdriverIO.Element, 
    addCommand | selector | elementId | `element-6066-11e4-a52e-4f735466cecf` | ELEMENT
  ]
  // Properties of TouchAction which are similar in sync and async mode
  type TouchActionSync = Omit[TouchAction, element_]
}
