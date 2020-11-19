package typingsSlinky.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Array {
  
  type Chainable[T, RawValue] = (typingsSlinky.sugar.sugarjs.Array.ChainableBase[T, RawValue]) with typingsSlinky.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ typingsSlinky.sugar.Array[T], U]
  
  type searchFn[T] = js.Function3[
    /* el */ T, 
    /* i */ scala.Double, 
    /* arr */ typingsSlinky.sugar.Array[T], 
    scala.Boolean
  ]
  
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
