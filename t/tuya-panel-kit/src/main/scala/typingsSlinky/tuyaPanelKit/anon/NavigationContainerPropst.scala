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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerProps & {  theme :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.Theme | undefined,   linking :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.LinkingOptions | undefined,   fallback :react.react.ReactNode | undefined,   documentTitle :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.DocumentTitleOptions | undefined,   onReady :(): void | undefined} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerRef> */
@js.native
trait NavigationContainerPropst extends StObject {
  
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
  implicit class NavigationContainerPropstMutableBuilder[Self <: NavigationContainerPropst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    @scala.inline
    def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackReactElement(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    @scala.inline
    def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLinking(value: LinkingOptions): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[NavigationContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ NavigationContainerRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[NavigationContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setTheme(value: typingsSlinky.tuyaPanelKit.nativeTypesMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
