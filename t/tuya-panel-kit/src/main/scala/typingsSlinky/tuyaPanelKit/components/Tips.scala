package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.MotionFadeProps
import typingsSlinky.tuyaPanelKit.mod.MotionPullUpProps
import typingsSlinky.tuyaPanelKit.mod.MotionPushDownProps
import typingsSlinky.tuyaPanelKit.mod.MotionScaleFadeInProps
import typingsSlinky.tuyaPanelKit.mod.MotionScalePullDownProps
import typingsSlinky.tuyaPanelKit.mod.TipsProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottomCenter
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottomLeft
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottomRight
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.topCenter
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.topLeft
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tips {
  
  @JSImport("tuya-panel-kit", "Tips")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Tips] {
    
    @scala.inline
    def bgColor(value: String): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyleNull: this.type = set("contentStyle", null)
    
    @scala.inline
    def cornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): this.type = set("cornerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): this.type = set("motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCorner(value: Boolean): this.type = set("showCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipStyle(value: StyleProp[ViewStyle]): this.type = set("tipStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipStyleNull: this.type = set("tipStyle", null)
    
    @scala.inline
    def withModal(value: Boolean): this.type = set("withModal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tips.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TipsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
