package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section of a Hub.
  **/
@js.native
trait HubSection extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  var contentElement: HTMLElement = js.native
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the header for this HubSection.
    **/
  var header: String = js.native
  /**
    * Gets a value that specifies whether the header is static.
    **/
  var isHeaderStatic: Boolean = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  def dispose(): Unit = js.native
}

object HubSection {
  @scala.inline
  def apply(
    contentElement: HTMLElement,
    dispose: () => Unit,
    element: HTMLElement,
    header: String,
    isHeaderStatic: Boolean
  ): HubSection = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isHeaderStatic = isHeaderStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubSection]
  }
  @scala.inline
  implicit class HubSectionOps[Self <: HubSection] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withIsHeaderStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderStatic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

