package typingsSlinky.zipkin.mod

import typingsSlinky.zipkin.zipkinBooleans.`false`
import typingsSlinky.zipkin.zipkinBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  @JSImport("zipkin", "option.None")
  @js.native
  val None: INone[scala.Nothing] = js.native
  
  @JSImport("zipkin", "option.Option")
  @js.native
  abstract class Option[T] () extends StObject {
    
    def equals(other: IOption[T]): Boolean = js.native
    
    def flatMap[V](fn: js.Function1[/* value */ T, IOption[V]]): IOption[V] = js.native
    
    def getOrElse(fnOrValue: T): T = js.native
    def getOrElse(fnOrValue: js.Function0[T]): T = js.native
    
    def ifPresent(fn: js.Function1[/* value */ T, _]): Unit = js.native
    
    def map[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
  }
  
  @JSImport("zipkin", "option.Some")
  @js.native
  class Some[T] protected ()
    extends Option[T]
       with IOption[T] {
    def this(value: T) = this()
    
    val present: `true` = js.native
    
    val `type`: typingsSlinky.zipkin.zipkinStrings.Some = js.native
  }
  
  // Throw error is not a valid option
  @JSImport("zipkin", "option.fromNullable")
  @js.native
  def fromNullable[V](nullable: V): IOption[V] = js.native
  
  @JSImport("zipkin", "option.isOptional")
  @js.native
  def isOptional(data: js.Any): Boolean = js.native
  
  @JSImport("zipkin", "option.verifyIsOptional")
  @js.native
  def verifyIsOptional(data: js.Any): Unit = js.native
  
  @js.native
  trait INone[T]
    extends Option[T]
       with IOption[T] {
    
    val present: `false` = js.native
    
    val `type`: typingsSlinky.zipkin.zipkinStrings.None = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.zipkin.mod.option.Some[T]
    - typingsSlinky.zipkin.mod.option.INone[T]
  */
  trait IOption[T] extends StObject
}
