package typingsSlinky.typescriptCompare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Compare {
  type Options = typingsSlinky.typescriptCompare.mod.Compare.Options_
  type Strict[A, B, Options /* <: typingsSlinky.typescriptCompare.mod.Compare.Options */] = typingsSlinky.typescriptLogic.mod.If[
    typingsSlinky.typescriptCompare.mod.Extends[A, B], 
    typingsSlinky.typescriptLogic.mod.If[
      typingsSlinky.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typingsSlinky.typescriptLogic.mod.If[
      typingsSlinky.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
}
