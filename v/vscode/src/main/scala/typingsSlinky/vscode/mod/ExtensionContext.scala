package typingsSlinky.vscode.mod

import typingsSlinky.vscode.AnonDispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionContext extends js.Object {
  /**
  		 * The absolute file path of the directory containing the extension.
  		 */
  val extensionPath: String = js.native
  /**
  		 * A memento object that stores state independent
  		 * of the current opened [workspace](#workspace.workspaceFolders).
  		 */
  val globalState: Memento = js.native
  /**
  		 * An absolute file path in which the extension can store global state.
  		 * The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  val globalStoragePath: String = js.native
  /**
  		 * An absolute file path of a directory in which the extension can create log files.
  		 * The directory might not exist on disk and creation is up to the extension. However,
  		 * the parent directory is guaranteed to be existent.
  		 */
  val logPath: String = js.native
  /**
  		 * An absolute file path of a workspace specific directory in which the extension
  		 * can store private state. The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`workspaceState`](#ExtensionContext.workspaceState) or
  		 * [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  val storagePath: js.UndefOr[String] = js.native
  /**
  		 * An array to which disposables can be added. When this
  		 * extension is deactivated the disposables will be disposed.
  		 */
  val subscriptions: js.Array[AnonDispose] = js.native
  /**
  		 * A memento object that stores state in the context
  		 * of the currently opened [workspace](#workspace.workspaceFolders).
  		 */
  val workspaceState: Memento = js.native
  /**
  		 * Get the absolute path of a resource contained in the extension.
  		 *
  		 * @param relativePath A relative path to a resource contained in the extension.
  		 * @return The absolute path of the resource.
  		 */
  def asAbsolutePath(relativePath: String): String = js.native
}

object ExtensionContext {
  @scala.inline
  def apply(
    asAbsolutePath: String => String,
    extensionPath: String,
    globalState: Memento,
    globalStoragePath: String,
    logPath: String,
    subscriptions: js.Array[AnonDispose],
    workspaceState: Memento
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal(asAbsolutePath = js.Any.fromFunction1(asAbsolutePath), extensionPath = extensionPath.asInstanceOf[js.Any], globalState = globalState.asInstanceOf[js.Any], globalStoragePath = globalStoragePath.asInstanceOf[js.Any], logPath = logPath.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], workspaceState = workspaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionContext]
  }
  @scala.inline
  implicit class ExtensionContextOps[Self <: ExtensionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsAbsolutePath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asAbsolutePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtensionPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalState(value: Memento): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalStoragePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalStoragePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[AnonDispose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaceState(value: Memento): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoragePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePath")(js.undefined)
        ret
    }
  }
  
}

