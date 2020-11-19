package typingsSlinky.transducersJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  type Transducer[TInput, TOutput] = js.Function1[
    /* xf */ typingsSlinky.transducersJs.mod.Transformer_[js.Any, TOutput], 
    typingsSlinky.transducersJs.mod.Transformer_[js.Any, TInput]
  ]
  
  type Transformer_[TResult, TInput] = typingsSlinky.transducersJs.mod.CompletingTransformer[TResult, TResult, TInput]
}
