package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.TouchableOpacityProps
import typingsSlinky.tuyaPanelKit.anon.BoardBg
import typingsSlinky.tuyaPanelKit.anon.Content
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.image
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYListItemProps extends TouchableOpacityProps {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Icon: js.UndefOr[js.Any] = js.native
  
  var actionDisabled: js.UndefOr[Boolean] = js.native
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var arrow: js.UndefOr[Boolean] = js.native
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  @JSName("disabled")
  var disabled_TYListItemProps: js.UndefOr[Boolean] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.native
  
  var needUpdate: js.UndefOr[Boolean] = js.native
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var styles: js.UndefOr[Content] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[BoardBg] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
}
object TYListItemProps {
  
  @scala.inline
  def apply(): TYListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYListItemProps]
  }
  
  @scala.inline
  implicit class TYListItemPropsMutableBuilder[Self <: TYListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDisabled(value: Boolean): Self = StObject.set(x, "actionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDisabledUndefined: Self = StObject.set(x, "actionDisabled", js.undefined)
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setArrowUseIcon(value: Boolean): Self = StObject.set(x, "arrowUseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUseIconUndefined: Self = StObject.set(x, "arrowUseIcon", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = StObject.set(x, "imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFollowIconColorUndefined: Self = StObject.set(x, "imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedUpdateUndefined: Self = StObject.set(x, "needUpdate", js.undefined)
    
    @scala.inline
    def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    @scala.inline
    def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTheme(value: BoardBg): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
  }
}
