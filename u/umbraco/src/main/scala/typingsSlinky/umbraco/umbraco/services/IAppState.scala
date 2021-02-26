package typingsSlinky.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.appState
  * @function
  *
  * @description
  * Tracks the various application state variables when working in the back office, raises events when state changes.
  */
@js.native
trait IAppState extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current global state value by key - we do not return an object reference here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getGlobalState(key: String): IGlobalState = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current menu state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getMenuState(key: String): IStateObject = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current section state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getSectionState(key: String): ISectionState = js.native
  
  /** function to validate and set the state on a state object */
  def getState(stateObj: IStateObject, key: String, stateObjName: String): IStateObject = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current tree state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getTreeState(key: String): ITreeState = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a global state value by key
    */
  def setGlobalState(key: String, value: Boolean): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setMenuState(key: String, value: IMenuState): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setSectionState(key: String, value: ISectionState): Unit = js.native
  
  /** function to validate and set the state on a state object */
  def setState(stateObj: IStateObject, key: String, value: js.Any, stateObjName: String): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setTreeState(key: String, value: ITreeState): Unit = js.native
}
object IAppState {
  
  @scala.inline
  def apply(
    getGlobalState: String => IGlobalState,
    getMenuState: String => IStateObject,
    getSectionState: String => ISectionState,
    getState: (IStateObject, String, String) => IStateObject,
    getTreeState: String => ITreeState,
    setGlobalState: (String, Boolean) => Unit,
    setMenuState: (String, IMenuState) => Unit,
    setSectionState: (String, ISectionState) => Unit,
    setState: (IStateObject, String, js.Any, String) => Unit,
    setTreeState: (String, ITreeState) => Unit
  ): IAppState = {
    val __obj = js.Dynamic.literal(getGlobalState = js.Any.fromFunction1(getGlobalState), getMenuState = js.Any.fromFunction1(getMenuState), getSectionState = js.Any.fromFunction1(getSectionState), getState = js.Any.fromFunction3(getState), getTreeState = js.Any.fromFunction1(getTreeState), setGlobalState = js.Any.fromFunction2(setGlobalState), setMenuState = js.Any.fromFunction2(setMenuState), setSectionState = js.Any.fromFunction2(setSectionState), setState = js.Any.fromFunction4(setState), setTreeState = js.Any.fromFunction2(setTreeState))
    __obj.asInstanceOf[IAppState]
  }
  
  @scala.inline
  implicit class IAppStateMutableBuilder[Self <: IAppState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGlobalState(value: String => IGlobalState): Self = StObject.set(x, "getGlobalState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuState(value: String => IStateObject): Self = StObject.set(x, "getMenuState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSectionState(value: String => ISectionState): Self = StObject.set(x, "getSectionState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: (IStateObject, String, String) => IStateObject): Self = StObject.set(x, "getState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetTreeState(value: String => ITreeState): Self = StObject.set(x, "getTreeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGlobalState(value: (String, Boolean) => Unit): Self = StObject.set(x, "setGlobalState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMenuState(value: (String, IMenuState) => Unit): Self = StObject.set(x, "setMenuState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSectionState(value: (String, ISectionState) => Unit): Self = StObject.set(x, "setSectionState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetState(value: (IStateObject, String, js.Any, String) => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetTreeState(value: (String, ITreeState) => Unit): Self = StObject.set(x, "setTreeState", js.Any.fromFunction2(value))
  }
}
