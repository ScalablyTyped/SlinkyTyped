package typingsSlinky.webcomponentsDotJs.webcomponentsDotJsMod._Global_

import typingsSlinky.webcomponentsDotJs.webcomponentsDotJsMod.CustomElementsPolyfill
import typingsSlinky.webcomponentsDotJs.webcomponentsDotJsMod.HTMLImportsPolyfill
import typingsSlinky.webcomponentsDotJs.webcomponentsDotJsMod.Polyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var CustomElements: CustomElementsPolyfill
  var HTMLImports: HTMLImportsPolyfill
  var WebComponents: Polyfill
  var customElements: CustomElementRegistry
}

object Window {
  @scala.inline
  def apply(
    CustomElements: CustomElementsPolyfill,
    HTMLImports: HTMLImportsPolyfill,
    WebComponents: Polyfill,
    customElements: CustomElementRegistry
  ): Window = {
    val __obj = js.Dynamic.literal(CustomElements = CustomElements.asInstanceOf[js.Any], HTMLImports = HTMLImports.asInstanceOf[js.Any], WebComponents = WebComponents.asInstanceOf[js.Any], customElements = customElements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

