package typingsSlinky.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stylableTransformerMod {
  
  type postProcessor[T] = js.Function2[
    /* stylableResults */ typingsSlinky.stylableCore.stylableTransformerMod.StylableResults, 
    /* transformer */ typingsSlinky.stylableCore.stylableTransformerMod.StylableTransformer, 
    typingsSlinky.stylableCore.stylableTransformerMod.StylableResults with T
  ]
  
  type replaceValueHook = js.Function4[
    /* value */ java.lang.String, 
    /* name */ java.lang.String | typingsSlinky.stylableCore.anon.Args, 
    /* isLocal */ scala.Boolean, 
    /* passedThrough */ js.Array[java.lang.String], 
    java.lang.String
  ]
}
