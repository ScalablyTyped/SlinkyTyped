package typingsSlinky.sharepoint.CUI

import org.scalajs.dom.raw.Element
import typingsSlinky.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component
  extends IMenuItem
     with IDisposable {
  var _lastHeightUpdate: Double = js.native
  var _lastLeftUpdate: Double = js.native
  var _lastTopUpdate: Double = js.native
  /* tslint:disable:variable-name */
  var _lastWidthUpdate: Double = js.native
  def addChild(child: Component): scala.Unit = js.native
  def addChildAtIndex(child: Component, index: Double): js.Any = js.native
  def appendChildrenToElement(elm: Element): scala.Unit = js.native
  def createChildArray(): scala.Unit = js.native
  def doDelayedInit(): scala.Unit = js.native
  def ensureCorrectChildType(): scala.Unit = js.native
  def ensureDOMElementAndEmpty(): scala.Unit = js.native
  def getChild(id: String): Component = js.native
  def getChildByTitle(title: String): Component = js.native
  def getTextValue(): String = js.native
  def get_cssClass(): String = js.native
  def get_description(): String = js.native
  def get_domElementTagName(): String = js.native
  def get_enabled(): Boolean = js.native
  def get_id(): String = js.native
  def get_needsDelayIniting(): Boolean = js.native
  def get_parent(): Component = js.native
  def get_root(): Component = js.native
  def get_title(): String = js.native
  def get_visible(): Boolean = js.native
  def get_visibleInDOM(): Boolean = js.native
  def initRootMember(root: Component): js.Any = js.native
  def onEnabledChanged(enabled: Boolean): js.Any = js.native
  def onMenuClosed(): scala.Unit = js.native
  def raiseCommandEvent(commandId: String, `type`: CommandType, properties: js.Any): js.Any = js.native
  def receiveFocus(): scala.Unit = js.native
  def removeChild(id: String): scala.Unit = js.native
  def removeChildren(): scala.Unit = js.native
  def set_description(description: String): String = js.native
  def set_enabled(value: Boolean): Boolean = js.native
  def set_id(id: String): scala.Unit = js.native
  def set_parent(value: Component): Component = js.native
  def set_title(title: String): String = js.native
  def set_visible(value: Boolean): Boolean = js.native
  def valueIsDirty(lastUpdate: Double): Boolean = js.native
}

object Component {
  @scala.inline
  def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => scala.Unit,
    addChildAtIndex: (Component, Double) => js.Any,
    appendChildrenToElement: Element => scala.Unit,
    createChildArray: () => scala.Unit,
    dispose: () => scala.Unit,
    doDelayedInit: () => scala.Unit,
    ensureCorrectChildType: () => scala.Unit,
    ensureDOMElementAndEmpty: () => scala.Unit,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: () => String,
    get_cssClass: () => String,
    get_description: () => String,
    get_domElementTagName: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_needsDelayIniting: () => Boolean,
    get_parent: () => Component,
    get_root: () => Component,
    get_title: () => String,
    get_visible: () => Boolean,
    get_visibleInDOM: () => Boolean,
    initRootMember: Component => js.Any,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => scala.Unit,
    raiseCommandEvent: (String, CommandType, js.Any) => js.Any,
    receiveFocus: () => scala.Unit,
    removeChild: String => scala.Unit,
    removeChildren: () => scala.Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => scala.Unit,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    valueIsDirty: Double => Boolean
  ): Component = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_lastHeightUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastHeightUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lastLeftUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastLeftUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lastTopUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastTopUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lastWidthUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastWidthUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddChild(value: Component => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddChildAtIndex(value: (Component, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppendChildrenToElement(value: Element => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChildrenToElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateChildArray(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChildArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoDelayedInit(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doDelayedInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnsureCorrectChildType(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureCorrectChildType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnsureDOMElementAndEmpty(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureDOMElementAndEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChild(value: String => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildByTitle(value: String => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildByTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTextValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_cssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_cssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_description(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_description")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_domElementTagName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_domElementTagName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_enabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_enabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_needsDelayIniting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_needsDelayIniting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_parent(value: () => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_parent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_root(value: () => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_root")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_visible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_visible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_visibleInDOM(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_visibleInDOM")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitRootMember(value: Component => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initRootMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEnabledChanged(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnabledChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMenuClosed(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRaiseCommandEvent(value: (String, CommandType, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseCommandEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReceiveFocus(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveChild(value: String => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveChildren(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_description(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_enabled(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_enabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_id(value: String => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_id")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_parent(value: Component => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_parent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_title(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_visible(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_visible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueIsDirty(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIsDirty")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

