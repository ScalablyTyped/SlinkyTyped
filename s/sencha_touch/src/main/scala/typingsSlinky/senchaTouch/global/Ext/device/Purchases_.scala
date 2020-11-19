package typingsSlinky.senchaTouch.global.Ext.device

import typingsSlinky.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.device.Purchases")
@js.native
class Purchases_ ()
  extends typingsSlinky.senchaTouch.Ext.device.Purchases_
/* static members */
@JSGlobal("Ext.device.Purchases")
@js.native
object Purchases_ extends js.Object {
  
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
  
  /** [Method] Checks if the current user is able to make payments
    * @param config Object
    */
  def canMakePayments(): Unit = js.native
  def canMakePayments(config: js.Any): Unit = js.native
  
  /** [Method]  */
  def destroy(): Unit = js.native
  
  /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
    * @param config Object
    */
  def getCompletedPurchases(): Unit = js.native
  def getCompletedPurchases(config: js.Any): Unit = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  
  /** [Method] Returns a Ext data Store instance of all products available to purchase
    * @param config Object
    */
  def getProducts(): Unit = js.native
  def getProducts(config: js.Any): Unit = js.native
  
  /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
    * @param config Object
    */
  def getPurchases(): Unit = js.native
  def getPurchases(config: js.Any): Unit = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
}
