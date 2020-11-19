package typingsSlinky.streamjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Stream {
  
  type Accumulator[T] = js.Function2[/* e1 */ T, /* e2 */ T, T]
  
  type Comparator[T] = js.Function2[/* e1 */ T, /* e2 */ T, scala.Double]
  
  type Consumer[T] = js.Function1[/* elem */ T, scala.Unit]
  
  type Function[T, U] = js.Function1[/* elem */ T, U]
  
  type GroupingResult[T] = org.scalablytyped.runtime.StringDictionary[js.Array[T]]
  
  type Map[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Predicate[T] = js.Function1[/* elem */ T, scala.Boolean]
  
  type Sample = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Supplier[T] = js.Function0[T]
}
