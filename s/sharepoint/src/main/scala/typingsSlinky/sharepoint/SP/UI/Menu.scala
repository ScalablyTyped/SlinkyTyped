package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu extends js.Object {
  def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement = js.native
  def addSeparator(): Unit = js.native
  def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): Menu = js.native
  def hideIcons(): Unit = js.native
  def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit = js.native
  def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit = js.native
  def showIcons(): Unit = js.native
}

object Menu {
  @scala.inline
  def apply(
    addMenuItem: (String, String, String, String, Double, String, String) => HTMLElement,
    addSeparator: () => Unit,
    addSubMenu: (String, String, String, Double, String, String) => Menu,
    hideIcons: () => Unit,
    show: (HTMLElement, Boolean, Boolean, Double) => Unit,
    showFilterMenu: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Unit,
    showIcons: () => Unit
  ): Menu = {
    val __obj = js.Dynamic.literal(addMenuItem = js.Any.fromFunction7(addMenuItem), addSeparator = js.Any.fromFunction0(addSeparator), addSubMenu = js.Any.fromFunction6(addSubMenu), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction4(show), showFilterMenu = js.Any.fromFunction6(showFilterMenu), showIcons = js.Any.fromFunction0(showIcons))
    __obj.asInstanceOf[Menu]
  }
  @scala.inline
  implicit class MenuOps[Self <: Menu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMenuItem(value: (String, String, String, String, Double, String, String) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMenuItem")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withAddSeparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddSubMenu(value: (String, String, String, Double, String, String) => Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSubMenu")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withHideIcons(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: (HTMLElement, Boolean, Boolean, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withShowFilterMenu(value: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterMenu")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withShowIcons(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

