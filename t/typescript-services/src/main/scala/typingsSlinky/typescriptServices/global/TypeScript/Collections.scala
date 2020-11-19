package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Collections")
@js.native
object Collections extends js.Object {
  
  var DefaultHashTableCapacity: Double = js.native
  
  var DefaultStringTable: typingsSlinky.typescriptServices.TypeScript.Collections.StringTable = js.native
  
  var DefaultStringTableCapacity: Double = js.native
  
  def createHashTable[TKey, TValue](): typingsSlinky.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: js.UndefOr[scala.Nothing], hash: js.Function1[/* k */ TKey, Double]): typingsSlinky.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double): typingsSlinky.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typingsSlinky.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  
  def identityHashCode(value: js.Any): Double = js.native
  
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
  }
  
  @js.native
  class StringTable protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
  }
  /* static members */
  @js.native
  object StringTable extends js.Object {
    
    /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
}
