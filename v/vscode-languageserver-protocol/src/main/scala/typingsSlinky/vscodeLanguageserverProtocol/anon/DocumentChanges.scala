package typingsSlinky.vscodeLanguageserverProtocol.anon

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ResourceOperationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChanges extends js.Object {
  /**
    * The client supports versioned document changes in `WorkspaceEdit`s
    */
  var documentChanges: js.UndefOr[Boolean] = js.native
  /**
    * The failure handling strategy of a client if applying the workspace edit
    * failes.
    */
  var failureHandling: js.UndefOr[FailureHandlingKind] = js.native
  /**
    * The resource operations the client supports. Clients should at least
    * support 'create', 'rename' and 'delete' files and folders.
    */
  var resourceOperations: js.UndefOr[js.Array[ResourceOperationKind]] = js.native
}

object DocumentChanges {
  @scala.inline
  def apply(): DocumentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChanges]
  }
  @scala.inline
  implicit class DocumentChangesOps[Self <: DocumentChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureHandling(value: FailureHandlingKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOperations(value: js.Array[ResourceOperationKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOperations")(js.undefined)
        ret
    }
  }
  
}

