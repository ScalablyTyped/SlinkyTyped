package typingsSlinky.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toolbar extends js.Object {
  def add(item: ToolbarItem): ToolbarButton = js.native
  def addButton(params: ToolbarParams): ToolbarButton = js.native
  def addCheckBox(): ToolbarCheckBox = js.native
  def addColorPicker(params: ToolbarParams): ToolbarColorPicker = js.native
  def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton = js.native
  def addLabel(): ToolbarLabel = js.native
  def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup = js.native
  def addSeparator(): ToolbarSeparator = js.native
  def addTextBox(params: ToolbarParams): ToolbarTextBox = js.native
  def addToggleButton(params: ToolbarParams): ToolbarToggleButton = js.native
  def refresh(): Unit = js.native
}

object Toolbar {
  @scala.inline
  def apply(
    add: ToolbarItem => ToolbarButton,
    addButton: ToolbarParams => ToolbarButton,
    addCheckBox: () => ToolbarCheckBox,
    addColorPicker: ToolbarParams => ToolbarColorPicker,
    addDropDownButton: ToolbarParams => ToolbarDropDownButton,
    addLabel: () => ToolbarLabel,
    addRadioButtonGroup: ClickFn => ToolbarRadioButtonGroup,
    addSeparator: () => ToolbarSeparator,
    addTextBox: ToolbarParams => ToolbarTextBox,
    addToggleButton: ToolbarParams => ToolbarToggleButton,
    refresh: () => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addButton = js.Any.fromFunction1(addButton), addCheckBox = js.Any.fromFunction0(addCheckBox), addColorPicker = js.Any.fromFunction1(addColorPicker), addDropDownButton = js.Any.fromFunction1(addDropDownButton), addLabel = js.Any.fromFunction0(addLabel), addRadioButtonGroup = js.Any.fromFunction1(addRadioButtonGroup), addSeparator = js.Any.fromFunction0(addSeparator), addTextBox = js.Any.fromFunction1(addTextBox), addToggleButton = js.Any.fromFunction1(addToggleButton), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Toolbar]
  }
  @scala.inline
  implicit class ToolbarOps[Self <: typingsSlinky.webgme.Toolbar.Toolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: ToolbarItem => ToolbarButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddButton(value: ToolbarParams => ToolbarButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCheckBox(value: () => ToolbarCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddColorPicker(value: ToolbarParams => ToolbarColorPicker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColorPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddDropDownButton(value: ToolbarParams => ToolbarDropDownButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDropDownButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddLabel(value: () => ToolbarLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddRadioButtonGroup(value: ClickFn => ToolbarRadioButtonGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRadioButtonGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSeparator(value: () => ToolbarSeparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddTextBox(value: ToolbarParams => ToolbarTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTextBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddToggleButton(value: ToolbarParams => ToolbarToggleButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToggleButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

