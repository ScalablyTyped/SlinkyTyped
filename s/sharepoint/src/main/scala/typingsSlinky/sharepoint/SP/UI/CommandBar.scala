package typingsSlinky.sharepoint.SP.UI

import typingsSlinky.sharepoint.SP.HtmlBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBar extends js.Object {
  def addCommand(action: Command): Unit = js.native
  def attachEvents(): Unit = js.native
  def findCommandByName(name: String): Command = js.native
  def get_commands(): js.Array[Command] = js.native
  def get_dropDownThreshold(): Double = js.native
  def get_elementID(): String = js.native
  def get_overrideClass(): String = js.native
  def insertCommand(action: Command, position: Double): Unit = js.native
  def render(builder: HtmlBuilder): Unit = js.native
  def set_dropDownThreshold(value: Double): Double = js.native
  def set_overrideClass(value: String): String = js.native
}

object CommandBar {
  @scala.inline
  def apply(
    addCommand: Command => Unit,
    attachEvents: () => Unit,
    findCommandByName: String => Command,
    get_commands: () => js.Array[Command],
    get_dropDownThreshold: () => Double,
    get_elementID: () => String,
    get_overrideClass: () => String,
    insertCommand: (Command, Double) => Unit,
    render: HtmlBuilder => Unit,
    set_dropDownThreshold: Double => Double,
    set_overrideClass: String => String
  ): CommandBar = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), attachEvents = js.Any.fromFunction0(attachEvents), findCommandByName = js.Any.fromFunction1(findCommandByName), get_commands = js.Any.fromFunction0(get_commands), get_dropDownThreshold = js.Any.fromFunction0(get_dropDownThreshold), get_elementID = js.Any.fromFunction0(get_elementID), get_overrideClass = js.Any.fromFunction0(get_overrideClass), insertCommand = js.Any.fromFunction2(insertCommand), render = js.Any.fromFunction1(render), set_dropDownThreshold = js.Any.fromFunction1(set_dropDownThreshold), set_overrideClass = js.Any.fromFunction1(set_overrideClass))
    __obj.asInstanceOf[CommandBar]
  }
  @scala.inline
  implicit class CommandBarOps[Self <: CommandBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCommand(value: Command => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindCommandByName(value: String => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findCommandByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_commands(value: () => js.Array[Command]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_commands")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_dropDownThreshold(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_dropDownThreshold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_elementID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_elementID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_overrideClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_overrideClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertCommand(value: (Command, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRender(value: HtmlBuilder => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_dropDownThreshold(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_dropDownThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_overrideClass(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_overrideClass")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

