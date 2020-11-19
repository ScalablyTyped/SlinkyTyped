package typingsSlinky.senchaTouch.global.Ext

import typingsSlinky.senchaTouch.Ext.IClass
import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentManager")
@js.native
class ComponentManager ()
  extends typingsSlinky.senchaTouch.Ext.ComponentManager
/* static members */
@JSGlobal("Ext.ComponentManager")
@js.native
object ComponentManager extends js.Object {
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
    * @param component Object A configuration object for the Component you wish to create.
    * @param defaultType Function The constructor to provide the default Component type if the config object does not contain a xtype. (Optional if the config contains an xtype).
    * @returns Ext.Component The newly instantiated Component.
    */
  def create(): IComponent = js.native
  def create(component: js.UndefOr[scala.Nothing], defaultType: js.Any): IComponent = js.native
  def create(component: js.Any): IComponent = js.native
  def create(component: js.Any, defaultType: js.Any): IComponent = js.native
  
  /** [Method]  */
  def destroy(): Unit = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item.
    * @returns Object The item, or undefined if not found.
    */
  def get(): js.Any = js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] Checks if an item type is registered
    * @param component String The mnemonic string by which the class may be looked up.
    * @returns Boolean Whether the type is registered.
    */
  def isRegistered(): Boolean = js.native
  def isRegistered(component: java.lang.String): Boolean = js.native
  
  /** [Method] Registers an item to be managed
    * @param component Object The item to register.
    */
  def register(): Unit = js.native
  def register(component: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param component Object The item to unregister.
    */
  def unregister(): Unit = js.native
  def unregister(component: js.Any): Unit = js.native
}
