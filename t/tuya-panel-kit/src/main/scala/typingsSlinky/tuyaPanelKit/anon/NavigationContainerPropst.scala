package typingsSlinky.tuyaPanelKit.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.tuyaPanelKit.nativeTypesMod.DocumentTitleOptions
import typingsSlinky.tuyaPanelKit.nativeTypesMod.LinkingOptions
import typingsSlinky.tuyaPanelKit.routersTypesMod.InitialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerProps & {  theme :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.Theme | undefined,   linking :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.LinkingOptions | undefined,   fallback :react.react.ReactNode | undefined,   documentTitle :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.DocumentTitleOptions | undefined,   onReady :(): void | undefined} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerRef> */
@js.native
trait NavigationContainerPropst extends js.Object {
  
  /**
    * Children elements to render.
    */
  var children: ReactElement = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.native
  
  var fallback: js.UndefOr[ReactElement] = js.native
  
  /**
    * Whether this navigation container should be independent of parent containers.
    * If this is not set to `true`, this container cannot be nested inside another container.
    * Setting it to `true` disconnects any children navigators from parent container.
    */
  var independent: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial navigation state for the child navigators.
    */
  var initialState: js.UndefOr[InitialState] = js.native
  
  var key: js.UndefOr[typingsSlinky.react.mod.Key | Null] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var linking: js.UndefOr[LinkingOptions] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback which is called with the latest navigation state when it changes.
    */
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.native
  
  /**
    * Callback which is called when an action is not handled.
    */
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.native
  
  var ref: js.UndefOr[Ref[NavigationContainerRef]] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var theme: js.UndefOr[typingsSlinky.tuyaPanelKit.nativeTypesMod.Theme] = js.native
}
object NavigationContainerPropst {
  
  @scala.inline
  def apply(): NavigationContainerPropst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerPropst]
  }
  
  @scala.inline
  implicit class NavigationContainerPropstOps[Self <: NavigationContainerPropst] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: DocumentTitleOptions): Self = this.set("documentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitle: Self = this.set("documentTitle", js.undefined)
    
    @scala.inline
    def setFallbackReactElement(value: ReactElement): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: ReactElement): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setIndependent(value: Boolean): Self = this.set("independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependent: Self = this.set("independent", js.undefined)
    
    @scala.inline
    def setInitialState(value: InitialState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setLinking(value: LinkingOptions): Self = this.set("linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinking: Self = this.set("linking", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = this.set("onUnhandledAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnhandledAction: Self = this.set("onUnhandledAction", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[NavigationContainerRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ NavigationContainerRef | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[NavigationContainerRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setTheme(value: typingsSlinky.tuyaPanelKit.nativeTypesMod.Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
