package typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO

import typingsSlinky.std.Array
import typingsSlinky.webdriverio.WebdriverIO.BrowserObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementArray extends Array[Element] {
  
  var foundWith: String = js.native
  
  var parent: Element | BrowserObject = js.native
  
  var props: js.Array[_] = js.native
  
  var selector: String | js.Function = js.native
}
