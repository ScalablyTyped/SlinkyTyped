package typingsSlinky.tuyaPanelKit.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.`21`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogCustomProps extends DialogProps {
  
  var cancelAccessibilityLabel: js.UndefOr[String] = js.native
  
  var cancelText: String = js.native
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.native
  
  var confirmText: String = js.native
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var content: js.UndefOr[js.Any] = js.native
  
  var footer: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var header: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
  
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.native
}
object DialogCustomProps {
  
  @scala.inline
  def apply(cancelText: String, confirmText: String, title: String): DialogCustomProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCustomProps]
  }
  
  @scala.inline
  implicit class DialogCustomPropsMutableBuilder[Self <: DialogCustomProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelAccessibilityLabel(value: String): Self = StObject.set(x, "cancelAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelAccessibilityLabelUndefined: Self = StObject.set(x, "cancelAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    @scala.inline
    def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    @scala.inline
    def setConfirmAccessibilityLabel(value: String): Self = StObject.set(x, "confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmAccessibilityLabelUndefined: Self = StObject.set(x, "confirmAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    @scala.inline
    def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction0(value: () => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFooterFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    @scala.inline
    def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setHeader(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction0(value: () => ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
