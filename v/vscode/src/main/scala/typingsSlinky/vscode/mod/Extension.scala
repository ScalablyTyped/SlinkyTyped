package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension[T] extends js.Object {
  /**
  		 * The public API exported by this extension. It is an invalid action
  		 * to access this field before this extension has been activated.
  		 */
  val exports: T = js.native
  /**
  		 * The extension kind describes if an extension runs where the UI runs
  		 * or if an extension runs where the remote extension host runs. The extension kind
  		 * is defined in the `package.json`-file of extensions but can also be refined
  		 * via the `remote.extensionKind`-setting. When no remote extension host exists,
  		 * the value is [`ExtensionKind.UI`](#ExtensionKind.UI).
  		 */
  var extensionKind: ExtensionKind = js.native
  /**
  		 * The absolute file path of the directory containing this extension.
  		 */
  val extensionPath: String = js.native
  /**
  		 * The canonical extension identifier in the form of: `publisher.name`.
  		 */
  val id: String = js.native
  /**
  		 * `true` if the extension has been activated.
  		 */
  val isActive: Boolean = js.native
  /**
  		 * The parsed contents of the extension's package.json.
  		 */
  val packageJSON: js.Any = js.native
  /**
  		 * Activates this extension and returns its public API.
  		 *
  		 * @return A promise that will resolve when this extension has been activated.
  		 */
  def activate(): Thenable[T] = js.native
}

object Extension {
  @scala.inline
  def apply[T](
    activate: () => Thenable[T],
    exports: T,
    extensionKind: ExtensionKind,
    extensionPath: String,
    id: String,
    isActive: Boolean,
    packageJSON: js.Any
  ): Extension[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), exports = exports.asInstanceOf[js.Any], extensionKind = extensionKind.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], packageJSON = packageJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension[T]]
  }
  @scala.inline
  implicit class ExtensionOps[Self[t] <: Extension[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActivate(value: () => Thenable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExports(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionKind(value: ExtensionKind): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionPath(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageJSON(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageJSON")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

