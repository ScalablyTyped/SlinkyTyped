package typingsSlinky.winjs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: Promise[HTMLElement]
  var renderComplete: Promise[_]
}

object Anon_Element {
  @scala.inline
  def apply(element: Promise[HTMLElement], renderComplete: Promise[_]): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Element]
  }
}

