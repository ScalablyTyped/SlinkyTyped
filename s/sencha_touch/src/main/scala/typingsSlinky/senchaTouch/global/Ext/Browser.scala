package typingsSlinky.senchaTouch.global.Ext

import typingsSlinky.senchaTouch.Ext.IClass
import typingsSlinky.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Browser")
@js.native
class Browser ()
  extends typingsSlinky.senchaTouch.Ext.Browser
/* static members */
@JSGlobal("Ext.Browser")
@js.native
object Browser extends js.Object {
  
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
  
  /** [Method]  */
  def destroy(): Unit = js.native
  
  /** [Property] (String) */
  var engineName: java.lang.String = js.native
  
  /** [Property] (Ext.Version) */
  var engineVersion: IVersion = js.native
  
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
  
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
    * @param value String The OS name to check.
    * @returns Boolean
    */
  def is(): Boolean = js.native
  def is(value: java.lang.String): Boolean = js.native
  
  /** [Property] (Boolean) */
  var isSecure: Boolean = js.native
  
  /** [Property] (Boolean) */
  var isStrict: Boolean = js.native
  
  /** [Property] (String) */
  var name: java.lang.String = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Property] (String) */
  var userAgent: java.lang.String = js.native
  
  /** [Property] (Ext.Version) */
  var version: IVersion = js.native
}
