package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.Dispose
import typingsSlinky.vscode.anon.MementosetKeysForSynckeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionContext extends js.Object {
  
  /**
    * Get the absolute path of a resource contained in the extension.
    *
    * *Note* that an absolute uri can be constructed via [`Uri.joinPath`](#Uri.joinPath) and
    * [`extensionUri`](#ExtensionContext.extensionUri), e.g. `vscode.Uri.joinPath(context.extensionUri, relativePath);`
    *
    * @param relativePath A relative path to a resource contained in the extension.
    * @return The absolute path of the resource.
    */
  def asAbsolutePath(relativePath: String): String = js.native
  
  /**
    * Gets the extension's environment variable collection for this workspace, enabling changes
    * to be applied to terminal environment variables.
    */
  val environmentVariableCollection: EnvironmentVariableCollection = js.native
  
  /**
    * The mode the extension is running in. This is specific to the current
    * extension. One extension may be in `ExtensionMode.Development` while
    * other extensions in the host run in `ExtensionMode.Release`.
    */
  val extensionMode: ExtensionMode = js.native
  
  /**
    * The absolute file path of the directory containing the extension. Shorthand
    * notation for [ExtensionContext.extensionUri.fsPath](#TextDocument.uri) (independent of the uri scheme).
    */
  val extensionPath: String = js.native
  
  /**
    * The uri of the directory containing the extension.
    */
  val extensionUri: Uri = js.native
  
  /**
    * A memento object that stores state independent
    * of the current opened [workspace](#workspace.workspaceFolders).
    */
  val globalState: MementosetKeysForSynckeys = js.native
  
  /**
    * An absolute file path in which the extension can store global state.
    * The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use [`globalState`](#ExtensionContext.globalState) to store key value data.
    *
    * @deprecated Use [globalStorageUri](#ExtensionContext.globalStorageUri) instead.
    */
  val globalStoragePath: String = js.native
  
  /**
    * The uri of a directory in which the extension can store global state.
    * The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use [`globalState`](#ExtensionContext.globalState) to store key value data.
    *
    * @see [`workspace.fs`](#FileSystem) for how to read and write files and folders from
    *  an uri.
    */
  val globalStorageUri: Uri = js.native
  
  /**
    * An absolute file path of a directory in which the extension can create log files.
    * The directory might not exist on disk and creation is up to the extension. However,
    * the parent directory is guaranteed to be existent.
    *
    * @deprecated Use [logUri](#ExtensionContext.logUri) instead.
    */
  val logPath: String = js.native
  
  /**
    * The uri of a directory in which the extension can create log files.
    * The directory might not exist on disk and creation is up to the extension. However,
    * the parent directory is guaranteed to be existent.
    *
    * @see [`workspace.fs`](#FileSystem) for how to read and write files and folders from
    *  an uri.
    */
  val logUri: Uri = js.native
  
  /**
    * An absolute file path of a workspace specific directory in which the extension
    * can store private state. The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use [`workspaceState`](#ExtensionContext.workspaceState) or
    * [`globalState`](#ExtensionContext.globalState) to store key value data.
    *
    * @deprecated Use [storageUri](#ExtensionContext.storageUri) instead.
    */
  val storagePath: js.UndefOr[String] = js.native
  
  /**
    * The uri of a workspace specific directory in which the extension
    * can store private state. The directory might not exist and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    * The value is `undefined` when no workspace nor folder has been opened.
    *
    * Use [`workspaceState`](#ExtensionContext.workspaceState) or
    * [`globalState`](#ExtensionContext.globalState) to store key value data.
    *
    * @see [`workspace.fs`](#FileSystem) for how to read and write files and folders from
    *  an uri.
    */
  val storageUri: js.UndefOr[Uri] = js.native
  
  /**
    * An array to which disposables can be added. When this
    * extension is deactivated the disposables will be disposed.
    */
  val subscriptions: js.Array[Dispose] = js.native
  
  /**
    * A memento object that stores state in the context
    * of the currently opened [workspace](#workspace.workspaceFolders).
    */
  val workspaceState: Memento = js.native
}
object ExtensionContext {
  
  @scala.inline
  def apply(
    asAbsolutePath: String => String,
    environmentVariableCollection: EnvironmentVariableCollection,
    extensionMode: ExtensionMode,
    extensionPath: String,
    extensionUri: Uri,
    globalState: MementosetKeysForSynckeys,
    globalStoragePath: String,
    globalStorageUri: Uri,
    logPath: String,
    logUri: Uri,
    subscriptions: js.Array[Dispose],
    workspaceState: Memento
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal(asAbsolutePath = js.Any.fromFunction1(asAbsolutePath), environmentVariableCollection = environmentVariableCollection.asInstanceOf[js.Any], extensionMode = extensionMode.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], extensionUri = extensionUri.asInstanceOf[js.Any], globalState = globalState.asInstanceOf[js.Any], globalStoragePath = globalStoragePath.asInstanceOf[js.Any], globalStorageUri = globalStorageUri.asInstanceOf[js.Any], logPath = logPath.asInstanceOf[js.Any], logUri = logUri.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], workspaceState = workspaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionContext]
  }
  
  @scala.inline
  implicit class ExtensionContextOps[Self <: ExtensionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsAbsolutePath(value: String => String): Self = this.set("asAbsolutePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnvironmentVariableCollection(value: EnvironmentVariableCollection): Self = this.set("environmentVariableCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionMode(value: ExtensionMode): Self = this.set("extensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionPath(value: String): Self = this.set("extensionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUri(value: Uri): Self = this.set("extensionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalState(value: MementosetKeysForSynckeys): Self = this.set("globalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalStoragePath(value: String): Self = this.set("globalStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalStorageUri(value: Uri): Self = this.set("globalStorageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPath(value: String): Self = this.set("logPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUri(value: Uri): Self = this.set("logUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: Dispose*): Self = this.set("subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: js.Array[Dispose]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceState(value: Memento): Self = this.set("workspaceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragePath(value: String): Self = this.set("storagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoragePath: Self = this.set("storagePath", js.undefined)
    
    @scala.inline
    def setStorageUri(value: Uri): Self = this.set("storageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageUri: Self = this.set("storageUri", js.undefined)
  }
}
