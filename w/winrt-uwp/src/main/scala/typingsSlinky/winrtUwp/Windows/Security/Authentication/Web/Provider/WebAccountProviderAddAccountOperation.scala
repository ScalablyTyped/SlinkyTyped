package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an add account operation. */
@js.native
trait WebAccountProviderAddAccountOperation extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
}

object WebAccountProviderAddAccountOperation {
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind, reportCompleted: () => Unit): WebAccountProviderAddAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted))
    __obj.asInstanceOf[WebAccountProviderAddAccountOperation]
  }
  @scala.inline
  implicit class WebAccountProviderAddAccountOperationOps[Self <: WebAccountProviderAddAccountOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: WebAccountProviderOperationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportCompleted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompleted")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

