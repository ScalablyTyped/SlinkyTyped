package typingsSlinky.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.mod.EventHash
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait submenuConfig extends js.Object {
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var autofit: js.UndefOr[Boolean] = js.native
  
  var autofocus: js.UndefOr[Boolean] = js.native
  
  var autoheight: js.UndefOr[Boolean] = js.native
  
  var autowidth: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[String | typingsSlinky.webix.webix.ui.baseview] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var click: js.UndefOr[String | WebixCallback] = js.native
  
  var clipboard: js.UndefOr[Boolean | String] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[String | js.Array[_]] = js.native
  
  var datathrottle: js.UndefOr[Double] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var drag: js.UndefOr[Boolean | String] = js.native
  
  var dragscroll: js.UndefOr[Boolean | String] = js.native
  
  var externalData: js.UndefOr[WebixCallback] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var head: js.UndefOr[js.Any] = js.native
  
  var headHeight: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  var keyPressTimeout: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var master: js.UndefOr[String] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var mouseEventDelay: js.UndefOr[Double] = js.native
  
  var move: js.UndefOr[Boolean] = js.native
  
  var multiselect: js.UndefOr[String | Boolean] = js.native
  
  var navigation: js.UndefOr[Boolean] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onDblClick: js.UndefOr[WebixCallback] = js.native
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.native
  
  var openAction: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[js.Any] = js.native
  
  var pager: js.UndefOr[js.Any] = js.native
  
  var point: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String | WebixCallback] = js.native
  
  var ready: js.UndefOr[WebixCallback] = js.native
  
  var relative: js.UndefOr[String] = js.native
  
  var removeMissed: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var rules: js.UndefOr[js.Any] = js.native
  
  var save: js.UndefOr[js.Any] = js.native
  
  var scheme: js.UndefOr[js.Any] = js.native
  
  var scroll: js.UndefOr[Boolean | String] = js.native
  
  var scrollSpeed: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[Boolean | String] = js.native
  
  var subMenuPos: js.UndefOr[String] = js.native
  
  var submenuConfig: js.UndefOr[js.Any] = js.native
  
  var template: js.UndefOr[String | WebixCallback] = js.native
  
  var templateCopy: js.UndefOr[WebixCallback] = js.native
  
  var toFront: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[js.Any] = js.native
  
  var url: js.UndefOr[js.Any] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var xCount: js.UndefOr[Double] = js.native
  
  var yCount: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object submenuConfig {
  
  @scala.inline
  def apply(): submenuConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[submenuConfig]
  }
  
  @scala.inline
  implicit class submenuConfigOps[Self <: submenuConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAutofit(value: Boolean): Self = this.set("autofit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofit: Self = this.set("autofit", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    
    @scala.inline
    def setAutoheight(value: Boolean): Self = this.set("autoheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoheight: Self = this.set("autoheight", js.undefined)
    
    @scala.inline
    def setAutowidth(value: Boolean): Self = this.set("autowidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutowidth: Self = this.set("autowidth", js.undefined)
    
    @scala.inline
    def setBody(value: String | typingsSlinky.webix.webix.ui.baseview): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setClickFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClick(value: String | WebixCallback): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClipboard(value: Boolean | String): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setContainerHTMLElement(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDatathrottle(value: Double): Self = this.set("datathrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatathrottle: Self = this.set("datathrottle", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean | String): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragscroll(value: Boolean | String): Self = this.set("dragscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragscroll: Self = this.set("dragscroll", js.undefined)
    
    @scala.inline
    def setExternalData(value: /* repeated */ js.Any => js.Any): Self = this.set("externalData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExternalData: Self = this.set("externalData", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHead(value: js.Any): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setHeadHeight(value: Double): Self = this.set("headHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadHeight: Self = this.set("headHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMaster(value: String): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = this.set("mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseEventDelay: Self = this.set("mouseEventDelay", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setMultiselect(value: String | Boolean): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = this.set("onContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContext: Self = this.set("onContext", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: /* repeated */ js.Any => js.Any): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* repeated */ js.Any => js.Any): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOpenAction(value: String): Self = this.set("openAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenAction: Self = this.set("openAction", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPager(value: js.Any): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setPoint(value: Boolean): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setPositionFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("position", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: String | WebixCallback): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReady(value: /* repeated */ js.Any => js.Any): Self = this.set("ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRelative(value: String): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = this.set("removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveMissed: Self = this.set("removeMissed", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setSave(value: js.Any): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean | String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: String): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | String): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSubMenuPos(value: String): Self = this.set("subMenuPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuPos: Self = this.set("subMenuPos", js.undefined)
    
    @scala.inline
    def setSubmenuConfig(value: js.Any): Self = this.set("submenuConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenuConfig: Self = this.set("submenuConfig", js.undefined)
    
    @scala.inline
    def setTemplateFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: String | WebixCallback): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateCopy(value: /* repeated */ js.Any => js.Any): Self = this.set("templateCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplateCopy: Self = this.set("templateCopy", js.undefined)
    
    @scala.inline
    def setToFront(value: Boolean): Self = this.set("toFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToFront: Self = this.set("toFront", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXCount(value: Double): Self = this.set("xCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXCount: Self = this.set("xCount", js.undefined)
    
    @scala.inline
    def setYCount(value: Double): Self = this.set("yCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYCount: Self = this.set("yCount", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
