package typingsSlinky.sharepoint

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callout extends js.Object {
  /** Adds a link to the actions panel in the bottom part of the callout window */
  def addAction(action: CalloutAction): Unit = js.native
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  def addEventCallback(eventName: String, callback: js.Function1[/* callout */ this.type, Unit]): Unit = js.native
  /** Hide the callout. Animation can be used only for IE9+ */
  def close(useAnimation: Boolean): Unit = js.native
  /** Do not call this directly. Instead, use CalloutManager.remove */
  def destroy(): Unit = js.native
  /** Returns the callout actions menu */
  def getActionMenu(): CalloutActionMenu = js.native
  /** Returns the beak orientation defined for the callout during its creation. */
  def getBeakOrientation(): String = js.native
  /** Returns the bounding element defined for the callout during its creation. */
  def getBoundingBox(): HTMLElement = js.native
  /** Returns the contents of the callout. */
  def getContent(): String = js.native
  /** Returns the content element of the callout. */
  def getContentElement(): HTMLElement = js.native
  /** Returns the content width defined for the callout during its creation. */
  def getContentWidth(): Double = js.native
  /** Returns the ID of the callout. */
  def getID(): String = js.native
  /** Returns the launch point element of the callout. */
  def getLaunchPoint(): HTMLElement = js.native
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  def getOpenOptions(): CalloutOpenOptions = js.native
  /** Returns the position algorithm function defined for the callout during its creation. */
  def getPositionAlgorithm(): js.Any = js.native
  /** Returns the title of the callout. */
  def getTitle(): String = js.native
  /** Specifies wherever callout is in "Closed" state */
  def isClosed(): Boolean = js.native
  /** Specifies wherever callout is in "Closing" state */
  def isClosing(): Boolean = js.native
  /** Specifies wherever callout is in "Opened" state */
  def isOpen(): Boolean = js.native
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  def isOpenOrOpening(): Boolean = js.native
  /** Specifies wherever callout is in "Opening" state */
  def isOpening(): Boolean = js.native
  /** Display the callout. Animation can be used only for IE9+ */
  def open(useAnimation: Boolean): Unit = js.native
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  def refreshActions(): Unit = js.native
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  def set(options: CalloutOptions): js.Any = js.native
  /** Display if hidden, hide if shown. */
  def toggle(): Unit = js.native
}

object Callout {
  @scala.inline
  def apply(
    addAction: CalloutAction => Unit,
    addEventCallback: (String, js.Function1[Callout, Unit]) => Unit,
    close: Boolean => Unit,
    destroy: () => Unit,
    getActionMenu: () => CalloutActionMenu,
    getBeakOrientation: () => String,
    getBoundingBox: () => HTMLElement,
    getContent: () => String,
    getContentElement: () => HTMLElement,
    getContentWidth: () => Double,
    getID: () => String,
    getLaunchPoint: () => HTMLElement,
    getOpenOptions: () => CalloutOpenOptions,
    getPositionAlgorithm: () => js.Any,
    getTitle: () => String,
    isClosed: () => Boolean,
    isClosing: () => Boolean,
    isOpen: () => Boolean,
    isOpenOrOpening: () => Boolean,
    isOpening: () => Boolean,
    open: Boolean => Unit,
    refreshActions: () => Unit,
    set: CalloutOptions => js.Any,
    toggle: () => Unit
  ): Callout = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1(addAction), addEventCallback = js.Any.fromFunction2(addEventCallback), close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), getActionMenu = js.Any.fromFunction0(getActionMenu), getBeakOrientation = js.Any.fromFunction0(getBeakOrientation), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getContent = js.Any.fromFunction0(getContent), getContentElement = js.Any.fromFunction0(getContentElement), getContentWidth = js.Any.fromFunction0(getContentWidth), getID = js.Any.fromFunction0(getID), getLaunchPoint = js.Any.fromFunction0(getLaunchPoint), getOpenOptions = js.Any.fromFunction0(getOpenOptions), getPositionAlgorithm = js.Any.fromFunction0(getPositionAlgorithm), getTitle = js.Any.fromFunction0(getTitle), isClosed = js.Any.fromFunction0(isClosed), isClosing = js.Any.fromFunction0(isClosing), isOpen = js.Any.fromFunction0(isOpen), isOpenOrOpening = js.Any.fromFunction0(isOpenOrOpening), isOpening = js.Any.fromFunction0(isOpening), open = js.Any.fromFunction1(open), refreshActions = js.Any.fromFunction0(refreshActions), set = js.Any.fromFunction1(set), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Callout]
  }
  @scala.inline
  implicit class CalloutOps[Self <: Callout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAction(value: CalloutAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddEventCallback(value: (String, js.Function1[Callout, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClose(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActionMenu(value: () => CalloutActionMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBeakOrientation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeakOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoundingBox(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLaunchPoint(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLaunchPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpenOptions(value: () => CalloutOpenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPositionAlgorithm(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPositionAlgorithm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsClosed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsClosing(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpenOrOpening(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpenOrOpening")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpening(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpening")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefreshActions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: CalloutOptions => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

