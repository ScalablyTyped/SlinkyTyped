package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultDocument extends js.Object {
  var operationReference: TestOperationReference = js.native
  var payload: TestResultPayload = js.native
}

object TestResultDocument {
  @scala.inline
  def apply(operationReference: TestOperationReference, payload: TestResultPayload): TestResultDocument = {
    val __obj = js.Dynamic.literal(operationReference = operationReference.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultDocument]
  }
  @scala.inline
  implicit class TestResultDocumentOps[Self <: TestResultDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationReference(value: TestOperationReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: TestResultPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

