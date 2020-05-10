package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionProviderMetadata extends js.Object {
  /**
  		 * List of [CodeActionKinds](#CodeActionKind) that a [CodeActionProvider](#CodeActionProvider) may return.
  		 *
  		 * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
  		 * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
  		 * list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
  		 * such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
  		 */
  val providedCodeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.native
}

object CodeActionProviderMetadata {
  @scala.inline
  def apply(): CodeActionProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionProviderMetadata]
  }
  @scala.inline
  implicit class CodeActionProviderMetadataOps[Self <: CodeActionProviderMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvidedCodeActionKinds(value: js.Array[CodeActionKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedCodeActionKinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedCodeActionKinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedCodeActionKinds")(js.undefined)
        ret
    }
  }
  
}

