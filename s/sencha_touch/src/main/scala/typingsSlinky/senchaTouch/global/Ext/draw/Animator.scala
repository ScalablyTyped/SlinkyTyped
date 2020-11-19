package typingsSlinky.senchaTouch.global.Ext.draw

import typingsSlinky.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.draw.Animator")
@js.native
class Animator ()
  extends typingsSlinky.senchaTouch.Ext.draw.Animator
/* static members */
@JSGlobal("Ext.draw.Animator")
@js.native
object Animator extends js.Object {
  
  /** [Method] Adds an animated object to the animation pool
    * @param animation Object The animation descriptor to add to the pool.
    */
  def add(): Unit = js.native
  def add(animation: js.Any): Unit = js.native
  
  /** [Method] Register a recursive callback that will be called at every frame
    * @param callback Function
    * @param scope Object
    * @returns String
    */
  def addFrameCallback(): String = js.native
  def addFrameCallback(callback: js.UndefOr[scala.Nothing], scope: js.Any): String = js.native
  def addFrameCallback(callback: js.Any): String = js.native
  def addFrameCallback(callback: js.Any, scope: js.Any): String = js.native
  
  /** [Method] Cross platform animationTime implementation
    * @returns Number
    */
  def animationTime(): Double = js.native
  
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
  
  /** [Method] Cancel a registered one time callback
    * @param id String
    */
  def cancel(): Unit = js.native
  def cancel(id: String): Unit = js.native
  
  /** [Method] Returns true or false whether it contains the given animation or not
    * @param animation Object The animation to check for.
    * @returns Boolean
    */
  def contains(): Boolean = js.native
  def contains(animation: js.Any): Boolean = js.native
  
  /** [Method]  */
  def destroy(): Unit = js.native
  
  /** [Method] Returns true or false whether the pool is empty or not
    * @returns Boolean
    */
  def empty(): Boolean = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] Removes an animation from the pool
    * @param animation Object The animation to remove from the pool.
    */
  def remove(): Unit = js.native
  def remove(animation: js.Any): Unit = js.native
  
  /** [Method] Unregister a recursive callback
    * @param id String
    */
  def removeFrameCallback(): Unit = js.native
  def removeFrameCallback(id: String): Unit = js.native
  
  /** [Method] Register an one time callback that will be called at the next frame
    * @param callback Function
    * @param scope Object
    * @returns String
    */
  def schedule(): String = js.native
  def schedule(callback: js.UndefOr[scala.Nothing], scope: js.Any): String = js.native
  def schedule(callback: js.Any): String = js.native
  def schedule(callback: js.Any, scope: js.Any): String = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Method] Given a frame time it will filter out finished animations from the pool
    * @param frameTime Number The frame's start time, in milliseconds.
    */
  def step(): Unit = js.native
  def step(frameTime: Double): Unit = js.native
}
