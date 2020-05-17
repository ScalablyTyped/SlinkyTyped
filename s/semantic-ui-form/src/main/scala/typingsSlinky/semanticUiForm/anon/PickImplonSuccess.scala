package typingsSlinky.semanticUiForm.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.semanticUiForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onSuccess'> */
@js.native
trait PickImplonSuccess extends js.Object {
  @JSName("onSuccess")
  var onSuccess_Original: js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, _, _, _], 
    /* fields */ js.Any, 
    Unit
  ] = js.native
  def onSuccess(event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit = js.native
}

