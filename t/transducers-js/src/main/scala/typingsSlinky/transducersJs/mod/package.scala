package typingsSlinky.transducersJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  type Transformer[TResult, TInput] = typingsSlinky.transducersJs.mod.CompletingTransformer[TResult, TResult, TInput]
}
