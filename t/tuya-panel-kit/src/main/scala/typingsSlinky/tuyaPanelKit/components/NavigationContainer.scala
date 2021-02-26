package typingsSlinky.tuyaPanelKit.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.tuyaPanelKit.anon.NavigationContainerPropst
import typingsSlinky.tuyaPanelKit.nativeTypesMod.DocumentTitleOptions
import typingsSlinky.tuyaPanelKit.nativeTypesMod.LinkingOptions
import typingsSlinky.tuyaPanelKit.routersTypesMod.InitialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationContainer {
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, NavigationContainerRef] {
    
    @scala.inline
    def documentTitle(value: DocumentTitleOptions): this.type = set("documentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallback(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallbackReactElement(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def independent(value: Boolean): this.type = set("independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: InitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linking(value: LinkingOptions): this.type = set("linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReady(value: () => Unit): this.type = set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def onStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): this.type = set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUnhandledAction(value: /* action */ NavigationAction => Unit): this.type = set("onUnhandledAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: typingsSlinky.tuyaPanelKit.nativeTypesMod.Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NavigationContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationContainerPropst): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
