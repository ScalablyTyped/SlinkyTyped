package typingsSlinky.senchaTouch.global.Ext

import typingsSlinky.senchaTouch.Ext.IClass
import typingsSlinky.senchaTouch.Ext.IClassManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ClassManager")
@js.native
class ClassManager ()
  extends typingsSlinky.senchaTouch.Ext.ClassManager
/* static members */
object ClassManager {
  
  /** [Method] Adds a batch of class name to alias mappings
    * @param aliases Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  @JSGlobal("Ext.ClassManager.addNameAliasMappings")
  @js.native
  def addNameAliasMappings(): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.addNameAliasMappings")
  @js.native
  def addNameAliasMappings(aliases: js.Any): IClassManager = js.native
  
  /** [Method]
    * @param alternates Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  @JSGlobal("Ext.ClassManager.addNameAlternateMappings")
  @js.native
  def addNameAlternateMappings(): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.addNameAlternateMappings")
  @js.native
  def addNameAlternateMappings(alternates: js.Any): IClassManager = js.native
  
  /** [Method] Retrieve a class by its name
    * @param name String
    * @returns Ext.Class class
    */
  @JSGlobal("Ext.ClassManager.get")
  @js.native
  def get(): IClass = js.native
  @JSGlobal("Ext.ClassManager.get")
  @js.native
  def get(name: java.lang.String): IClass = js.native
  
  /** [Method] Get the aliases of a class by the class name
    * @param name String
    * @returns Array aliases
    */
  @JSGlobal("Ext.ClassManager.getAliasesByName")
  @js.native
  def getAliasesByName(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.ClassManager.getAliasesByName")
  @js.native
  def getAliasesByName(name: java.lang.String): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Get a reference to the class by its alias
    * @param alias String
    * @returns Ext.Class class
    */
  @JSGlobal("Ext.ClassManager.getByAlias")
  @js.native
  def getByAlias(): IClass = js.native
  @JSGlobal("Ext.ClassManager.getByAlias")
  @js.native
  def getByAlias(alias: java.lang.String): IClass = js.native
  
  @JSGlobal("Ext.ClassManager.getClass")
  @js.native
  def getClass(`object`: js.Any): IClass = js.native
  
  /** [Method] Get the name of the class by its reference or its instance usually invoked by the shorthand Ext getClassName Ext Cl
    * @param object Ext.Class/Object
    * @returns String className
    */
  @JSGlobal("Ext.ClassManager.getName")
  @js.native
  def getName(): java.lang.String = js.native
  @JSGlobal("Ext.ClassManager.getName")
  @js.native
  def getName(`object`: js.Any): java.lang.String = js.native
  
  /** [Method] Get the name of a class by its alias
    * @param alias String
    * @returns String className
    */
  @JSGlobal("Ext.ClassManager.getNameByAlias")
  @js.native
  def getNameByAlias(): java.lang.String = js.native
  @JSGlobal("Ext.ClassManager.getNameByAlias")
  @js.native
  def getNameByAlias(alias: java.lang.String): java.lang.String = js.native
  
  /** [Method] Get the name of a class by its alternate name
    * @param alternate String
    * @returns String className
    */
  @JSGlobal("Ext.ClassManager.getNameByAlternate")
  @js.native
  def getNameByAlternate(): java.lang.String = js.native
  @JSGlobal("Ext.ClassManager.getNameByAlternate")
  @js.native
  def getNameByAlternate(alternate: java.lang.String): java.lang.String = js.native
  
  /** [Method] Converts a string expression to an array of matching class names
    * @param expression String
    * @returns Array classNames
    */
  @JSGlobal("Ext.ClassManager.getNamesByExpression")
  @js.native
  def getNamesByExpression(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.ClassManager.getNamesByExpression")
  @js.native
  def getNamesByExpression(expression: java.lang.String): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Instantiate a class by either full name alias or alternate name usually invoked by the convenient shorthand Ext cre
    * @param name String
    * @param args Mixed Additional arguments after the name will be passed to the class' constructor.
    * @returns Object instance
    */
  @JSGlobal("Ext.ClassManager.instantiate")
  @js.native
  def instantiate(): js.Any = js.native
  @JSGlobal("Ext.ClassManager.instantiate")
  @js.native
  def instantiate(name: js.UndefOr[scala.Nothing], args: js.Any): js.Any = js.native
  @JSGlobal("Ext.ClassManager.instantiate")
  @js.native
  def instantiate(name: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.ClassManager.instantiate")
  @js.native
  def instantiate(name: java.lang.String, args: js.Any): js.Any = js.native
  
  /** [Method] Instantiate a class by its alias usually invoked by the convenient shorthand Ext createByAlias If Ext Loader is enab
    * @param alias String
    * @param args Mixed... Additional arguments after the alias will be passed to the class constructor.
    * @returns Object instance
    */
  @JSGlobal("Ext.ClassManager.instantiateByAlias")
  @js.native
  def instantiateByAlias(alias: java.lang.String, args: js.Any*): js.Any = js.native
  
  /** [Method] Checks if a class has already been created
    * @param className String
    * @returns Boolean exist
    */
  @JSGlobal("Ext.ClassManager.isCreated")
  @js.native
  def isCreated(): Boolean = js.native
  @JSGlobal("Ext.ClassManager.isCreated")
  @js.native
  def isCreated(className: java.lang.String): Boolean = js.native
  
  /** [Method] Sets a name reference to a class
    * @param name String
    * @param value Object
    * @returns Ext.ClassManager this
    */
  @JSGlobal("Ext.ClassManager.set")
  @js.native
  def set(): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.set")
  @js.native
  def set(name: js.UndefOr[scala.Nothing], value: js.Any): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.set")
  @js.native
  def set(name: java.lang.String): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.set")
  @js.native
  def set(name: java.lang.String, value: js.Any): IClassManager = js.native
  
  /** [Method] Register the alias for a class
    * @param cls Ext.Class/String a reference to a class or a className.
    * @param alias String Alias to use when referring to this class.
    * @returns Ext.ClassManager this
    */
  @JSGlobal("Ext.ClassManager.setAlias")
  @js.native
  def setAlias(): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.setAlias")
  @js.native
  def setAlias(cls: js.UndefOr[scala.Nothing], alias: java.lang.String): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.setAlias")
  @js.native
  def setAlias(cls: js.Any): IClassManager = js.native
  @JSGlobal("Ext.ClassManager.setAlias")
  @js.native
  def setAlias(cls: js.Any, alias: java.lang.String): IClassManager = js.native
  
  /** [Method] Creates a namespace and assign the value to the created object
    * @param name String
    * @param value Mixed
    */
  @JSGlobal("Ext.ClassManager.setNamespace")
  @js.native
  def setNamespace(): Unit = js.native
  @JSGlobal("Ext.ClassManager.setNamespace")
  @js.native
  def setNamespace(name: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  @JSGlobal("Ext.ClassManager.setNamespace")
  @js.native
  def setNamespace(name: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ClassManager.setNamespace")
  @js.native
  def setNamespace(name: java.lang.String, value: js.Any): Unit = js.native
}
