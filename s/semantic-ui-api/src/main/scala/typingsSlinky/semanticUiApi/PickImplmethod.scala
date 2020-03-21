package typingsSlinky.semanticUiApi

import typingsSlinky.semanticUiApi.semanticUiApiStrings.delete
import typingsSlinky.semanticUiApi.semanticUiApiStrings.get
import typingsSlinky.semanticUiApi.semanticUiApiStrings.head
import typingsSlinky.semanticUiApi.semanticUiApiStrings.options
import typingsSlinky.semanticUiApi.semanticUiApiStrings.patch
import typingsSlinky.semanticUiApi.semanticUiApiStrings.post
import typingsSlinky.semanticUiApi.semanticUiApiStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'method'> */
trait PickImplmethod extends js.Object {
  var method: post | get | put | delete | head | options | patch
}

object PickImplmethod {
  @scala.inline
  def apply(method: post | get | put | delete | head | options | patch): PickImplmethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplmethod]
  }
}

