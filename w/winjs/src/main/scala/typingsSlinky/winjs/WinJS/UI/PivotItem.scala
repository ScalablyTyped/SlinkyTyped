package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item within a Pivot control.
  **/
@js.native
trait PivotItem extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the PivotItem control's content.
    **/
  var contentElement: HTMLElement = js.native
  /**
    * Gets the DOM element that hosts the PivotItem control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the header for this PivotItem.
    **/
  var header: String = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this PivotItem. Call this method when the PivotItem is no longer needed. After calling this method, the PivotItem becomes unusable.
    **/
  def dispose(): Unit = js.native
}

object PivotItem {
  @scala.inline
  def apply(contentElement: HTMLElement, dispose: () => Unit, element: HTMLElement, header: String): PivotItem = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotItem]
  }
  @scala.inline
  implicit class PivotItemOps[Self <: PivotItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

