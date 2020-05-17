package typingsSlinky.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageComponent extends ICommandHandler {
  def getFocusedCommands(): js.Array[String] = js.native
  def getGlobalCommands(): js.Array[String] = js.native
  def getId(): String = js.native
  def init(): Unit = js.native
  def isFocusable(): Boolean = js.native
  def receiveFocus(): Boolean = js.native
  def yieldFocus(): Boolean = js.native
}

object PageComponent {
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    getFocusedCommands: () => js.Array[String],
    getGlobalCommands: () => js.Array[String],
    getId: () => String,
    handleCommand: (String, js.Any, Double) => Boolean,
    init: () => Unit,
    isFocusable: () => Boolean,
    receiveFocus: () => Boolean,
    yieldFocus: () => Boolean
  ): PageComponent = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
    __obj.asInstanceOf[PageComponent]
  }
  @scala.inline
  implicit class PageComponentOps[Self <: PageComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFocusedCommands(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedCommands")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGlobalCommands(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlobalCommands")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFocusable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReceiveFocus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYieldFocus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yieldFocus")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

