package typingsSlinky.webcomponentsJs.mod._Global_

import typingsSlinky.webcomponentsJs.mod.CustomElementsPolyfill
import typingsSlinky.webcomponentsJs.mod.HTMLImportsPolyfill
import typingsSlinky.webcomponentsJs.mod.Polyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var CustomElements: CustomElementsPolyfill = js.native
  var HTMLImports: HTMLImportsPolyfill = js.native
  var WebComponents: Polyfill = js.native
  var customElements: CustomElementRegistry = js.native
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
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomElements(value: CustomElementsPolyfill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLImports(value: HTMLImportsPolyfill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebComponents(value: Polyfill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebComponents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

