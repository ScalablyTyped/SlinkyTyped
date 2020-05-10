package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarItem extends js.Object {
  /**
  		 * The alignment of this item.
  		 */
  val alignment: StatusBarAlignment = js.native
  /**
  		 * The foreground color for this entry.
  		 */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * [`Command`](#Command) or identifier of a command to run on click.
  		 *
  		 * The command must be [known](#commands.getCommands).
  		 *
  		 * Note that if this is a [`Command`](#Command) object, only the [`command`](#Command.command) and [`arguments`](#Command.arguments)
  		 * are used by VS Code.
  		 */
  var command: js.UndefOr[String | Command] = js.native
  /**
  		 * The priority of this item. Higher value means the item should
  		 * be shown more to the left.
  		 */
  val priority: js.UndefOr[Double] = js.native
  /**
  		 * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
  		 *
  		 * `My text $(icon-name) contains icons like $(icon-name) this one.`
  		 *
  		 * Where the icon-name is taken from the [codicon](https://microsoft.github.io/vscode-codicons/dist/codicon.html) icon set, e.g.
  		 * `light-bulb`, `thumbsup`, `zap` etc.
  		 */
  var text: String = js.native
  /**
  		 * The tooltip text when you hover over this entry.
  		 */
  var tooltip: js.UndefOr[String] = js.native
  /**
  		 * Dispose and free associated resources. Call
  		 * [hide](#StatusBarItem.hide).
  		 */
  def dispose(): Unit = js.native
  /**
  		 * Hide the entry in the status bar.
  		 */
  def hide(): Unit = js.native
  /**
  		 * Shows the entry in the status bar.
  		 */
  def show(): Unit = js.native
}

object StatusBarItem {
  @scala.inline
  def apply(
    alignment: StatusBarAlignment,
    dispose: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    text: String
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarItem]
  }
  @scala.inline
  implicit class StatusBarItemOps[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: StatusBarAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: String | Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

