package typingsSlinky.webix.webix.ui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.webix.EventHash
import typingsSlinky.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait daterangepickerConfig extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var bottomLabel: js.UndefOr[String] = js.native
  
  var bottomPadding: js.UndefOr[Double] = js.native
  
  var click: js.UndefOr[WebixCallback] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hotkey: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var inputAlign: js.UndefOr[String] = js.native
  
  var inputHeight: js.UndefOr[Double] = js.native
  
  var inputWidth: js.UndefOr[Double] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var invalidMessage: js.UndefOr[String] = js.native
  
  var keyPressTimeout: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelAlign: js.UndefOr[String] = js.native
  
  var labelPosition: js.UndefOr[String] = js.native
  
  var labelWidth: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var pattern: js.UndefOr[js.Any] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var point: js.UndefOr[Boolean] = js.native
  
  var popup: js.UndefOr[String] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var relatedAction: js.UndefOr[String] = js.native
  
  var relatedView: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var stringResult: js.UndefOr[Boolean] = js.native
  
  var suggest: js.UndefOr[js.Any] = js.native
  
  var timeIcon: js.UndefOr[String] = js.native
  
  var timepicker: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var validate: js.UndefOr[WebixCallback] = js.native
  
  var validateEvent: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object daterangepickerConfig {
  
  @scala.inline
  def apply(): daterangepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[daterangepickerConfig]
  }
  
  @scala.inline
  implicit class daterangepickerConfigOps[Self <: daterangepickerConfig] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setBottomLabel(value: String): Self = this.set("bottomLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLabel: Self = this.set("bottomLabel", js.undefined)
    
    @scala.inline
    def setBottomPadding(value: Double): Self = this.set("bottomPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomPadding: Self = this.set("bottomPadding", js.undefined)
    
    @scala.inline
    def setClick(value: /* repeated */ js.Any => js.Any): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHotkey(value: String): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkey: Self = this.set("hotkey", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIcons(value: Boolean): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputAlign(value: String): Self = this.set("inputAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAlign: Self = this.set("inputAlign", js.undefined)
    
    @scala.inline
    def setInputHeight(value: Double): Self = this.set("inputHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputHeight: Self = this.set("inputHeight", js.undefined)
    
    @scala.inline
    def setInputWidth(value: Double): Self = this.set("inputWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputWidth: Self = this.set("inputWidth", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setInvalidMessage(value: String): Self = this.set("invalidMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMessage: Self = this.set("invalidMessage", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: String): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: Double): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setPattern(value: js.Any): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPoint(value: Boolean): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setRelatedAction(value: String): Self = this.set("relatedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedAction: Self = this.set("relatedAction", js.undefined)
    
    @scala.inline
    def setRelatedView(value: String): Self = this.set("relatedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedView: Self = this.set("relatedView", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setStringResult(value: Boolean): Self = this.set("stringResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringResult: Self = this.set("stringResult", js.undefined)
    
    @scala.inline
    def setSuggest(value: js.Any): Self = this.set("suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    
    @scala.inline
    def setTimeIcon(value: String): Self = this.set("timeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeIcon: Self = this.set("timeIcon", js.undefined)
    
    @scala.inline
    def setTimepicker(value: Boolean): Self = this.set("timepicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimepicker: Self = this.set("timepicker", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValidate(value: /* repeated */ js.Any => js.Any): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateEvent(value: String): Self = this.set("validateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateEvent: Self = this.set("validateEvent", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
