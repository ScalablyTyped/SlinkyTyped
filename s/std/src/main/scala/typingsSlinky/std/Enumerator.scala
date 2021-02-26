package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows enumerating over a COM collection, which may not have indexed item access.
  */
@js.native
trait Enumerator[T] extends StObject {
  
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  def atEnd(): scala.Boolean = js.native
  
  /**
    * Returns the current item in the collection
    */
  def item(): T = js.native
  
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  def moveFirst(): Unit = js.native
  
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  def moveNext(): Unit = js.native
}
object Enumerator {
  
  @scala.inline
  def apply[T](atEnd: () => scala.Boolean, item: () => T, moveFirst: () => Unit, moveNext: () => Unit): Enumerator[T] = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveFirst = js.Any.fromFunction0(moveFirst), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator[T]]
  }
  
  @scala.inline
  implicit class EnumeratorMutableBuilder[Self <: Enumerator[_], T] (val x: Self with Enumerator[T]) extends AnyVal {
    
    @scala.inline
    def setAtEnd(value: () => scala.Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: () => T): Self = StObject.set(x, "item", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = StObject.set(x, "moveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Unit): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
