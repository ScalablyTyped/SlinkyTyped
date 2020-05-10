package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControl extends js.Object {
  /**
  		 * Optional accept input command.
  		 *
  		 * This command will be invoked when the user accepts the value
  		 * in the Source Control input.
  		 */
  var acceptInputCommand: js.UndefOr[Command] = js.native
  /**
  		 * Optional commit template string.
  		 *
  		 * The Source Control viewlet will populate the Source Control
  		 * input with this value when appropriate.
  		 */
  var commitTemplate: js.UndefOr[String] = js.native
  /**
  		 * The UI-visible count of [resource states](#SourceControlResourceState) of
  		 * this source control.
  		 *
  		 * Equals to the total number of [resource state](#SourceControlResourceState)
  		 * of this source control, if undefined.
  		 */
  var count: js.UndefOr[Double] = js.native
  /**
  		 * The id of this source control.
  		 */
  val id: String = js.native
  /**
  		 * The [input box](#SourceControlInputBox) for this source control.
  		 */
  val inputBox: SourceControlInputBox = js.native
  /**
  		 * The human-readable label of this source control.
  		 */
  val label: String = js.native
  /**
  		 * An optional [quick diff provider](#QuickDiffProvider).
  		 */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.native
  /**
  		 * The (optional) Uri of the root of this source control.
  		 */
  val rootUri: js.UndefOr[Uri] = js.native
  /**
  		 * Optional status bar commands.
  		 *
  		 * These commands will be displayed in the editor's status bar.
  		 */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.native
  /**
  		 * Create a new [resource group](#SourceControlResourceGroup).
  		 */
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup = js.native
  /**
  		 * Dispose this source control.
  		 */
  def dispose(): Unit = js.native
}

object SourceControl {
  @scala.inline
  def apply(
    createResourceGroup: (String, String) => SourceControlResourceGroup,
    dispose: () => Unit,
    id: String,
    inputBox: SourceControlInputBox,
    label: String
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], inputBox = inputBox.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControl]
  }
  @scala.inline
  implicit class SourceControlOps[Self <: SourceControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateResourceGroup(value: (String, String) => SourceControlResourceGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResourceGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBox(value: SourceControlInputBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptInputCommand(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInputCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptInputCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInputCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickDiffProvider(value: QuickDiffProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickDiffProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickDiffProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickDiffProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withRootUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUri")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarCommands(value: js.Array[Command]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarCommands")(js.undefined)
        ret
    }
  }
  
}

