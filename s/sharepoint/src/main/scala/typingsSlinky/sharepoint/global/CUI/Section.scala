package typingsSlinky.sharepoint.global.CUI

import org.scalajs.dom.raw.Element
import typingsSlinky.sharepoint.CUI.Alignment
import typingsSlinky.sharepoint.CUI.RowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Section")
@js.native
class Section protected ()
  extends typingsSlinky.sharepoint.CUI.Section {
  /**
    * @param type  2 - OneRow, 3 - TwoRow, 4 - ThreeRow.
    * @param alignment 0 - Top, 2  - Middle,
    */
  def this(ribbon: typingsSlinky.sharepoint.CUI.Ribbon, id: String, `type`: RowType, alignment: Alignment) = this()
  /* CompleteClass */
  override var _lastHeightUpdate: Double = js.native
  /* CompleteClass */
  override var _lastLeftUpdate: Double = js.native
  /* CompleteClass */
  override var _lastTopUpdate: Double = js.native
  /* tslint:disable:variable-name */
  /* CompleteClass */
  override var _lastWidthUpdate: Double = js.native
  /* CompleteClass */
  override def addChild(child: typingsSlinky.sharepoint.CUI.Component): scala.Unit = js.native
  /* CompleteClass */
  override def addChildAtIndex(child: typingsSlinky.sharepoint.CUI.Component, index: Double): js.Any = js.native
  /* CompleteClass */
  override def appendChildrenToElement(elm: Element): scala.Unit = js.native
  /* CompleteClass */
  override def createChildArray(): scala.Unit = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def doDelayedInit(): scala.Unit = js.native
  /* CompleteClass */
  override def ensureCorrectChildType(): scala.Unit = js.native
  /* CompleteClass */
  override def ensureDOMElementAndEmpty(): scala.Unit = js.native
  /* CompleteClass */
  override def getChild(id: String): typingsSlinky.sharepoint.CUI.Component = js.native
  /* CompleteClass */
  override def getChildByTitle(title: String): typingsSlinky.sharepoint.CUI.Component = js.native
  /* CompleteClass */
  override def getRow(rowIndex: Double): typingsSlinky.sharepoint.CUI.Row = js.native
  /* CompleteClass */
  override def getTextValue(): String = js.native
  /* CompleteClass */
  override def get_alignment(): Double = js.native
  /* CompleteClass */
  override def get_cssClass(): String = js.native
  /* CompleteClass */
  override def get_description(): String = js.native
  /* CompleteClass */
  override def get_domElementTagName(): String = js.native
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  /* CompleteClass */
  override def get_id(): String = js.native
  /* CompleteClass */
  override def get_needsDelayIniting(): Boolean = js.native
  /* CompleteClass */
  override def get_parent(): typingsSlinky.sharepoint.CUI.Component = js.native
  /* CompleteClass */
  override def get_ribbon(): typingsSlinky.sharepoint.CUI.Ribbon = js.native
  /* CompleteClass */
  override def get_root(): typingsSlinky.sharepoint.CUI.Component = js.native
  /* CompleteClass */
  override def get_title(): String = js.native
  /* CompleteClass */
  override def get_type(): Double = js.native
  /* CompleteClass */
  override def get_visible(): Boolean = js.native
  /* CompleteClass */
  override def get_visibleInDOM(): Boolean = js.native
  /* CompleteClass */
  override def initRootMember(root: typingsSlinky.sharepoint.CUI.Component): js.Any = js.native
  /* CompleteClass */
  override def onEnabledChanged(enabled: Boolean): js.Any = js.native
  /* CompleteClass */
  override def onMenuClosed(): scala.Unit = js.native
  /* CompleteClass */
  override def raiseCommandEvent(commandId: String, `type`: typingsSlinky.sharepoint.CUI.CommandType, properties: js.Any): js.Any = js.native
  /* CompleteClass */
  override def receiveFocus(): scala.Unit = js.native
  /* CompleteClass */
  override def removeChild(id: String): scala.Unit = js.native
  /* CompleteClass */
  override def removeChildren(): scala.Unit = js.native
  /* CompleteClass */
  override def set_description(description: String): String = js.native
  /* CompleteClass */
  override def set_enabled(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_id(id: String): scala.Unit = js.native
  /* CompleteClass */
  override def set_parent(value: typingsSlinky.sharepoint.CUI.Component): typingsSlinky.sharepoint.CUI.Component = js.native
  /* CompleteClass */
  override def set_title(title: String): String = js.native
  /* CompleteClass */
  override def set_visible(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def valueIsDirty(lastUpdate: Double): Boolean = js.native
}

