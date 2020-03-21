package typingsSlinky.typescriptCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Any[Type] = typingsSlinky.typescriptLogic.mod.And[
    typingsSlinky.typescriptCompare.mod.prv.Extends[Type, typingsSlinky.typescriptCompare.typescriptCompareNumbers.`0`], 
    typingsSlinky.typescriptCompare.mod.prv.Extends[Type, typingsSlinky.typescriptCompare.typescriptCompareNumbers.`1`]
  ]
  type Compare[A, B, Options /* <: typingsSlinky.typescriptCompare.mod.Compare.Options */] = typingsSlinky.typescriptLogic.mod.If[
    typingsSlinky.typescriptCompare.mod.Extends[A, B], 
    typingsSlinky.typescriptLogic.mod.If[
      typingsSlinky.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typingsSlinky.typescriptLogic.mod.If[
      typingsSlinky.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = typingsSlinky.typescriptLogic.mod.Or[
    typingsSlinky.typescriptLogic.mod.And[
      typingsSlinky.typescriptCompare.mod.Any[A], 
      typingsSlinky.typescriptCompare.mod.Any[B]
    ], 
    typingsSlinky.typescriptLogic.mod.And[
      typingsSlinky.typescriptLogic.mod.And[
        typingsSlinky.typescriptCompare.mod.NotAny[
          A, 
          typingsSlinky.typescriptCompare.typescriptCompareBooleans.`true`, 
          typingsSlinky.typescriptCompare.typescriptCompareBooleans.`true`
        ], 
        typingsSlinky.typescriptCompare.mod.NotAny[
          B, 
          typingsSlinky.typescriptCompare.typescriptCompareBooleans.`true`, 
          typingsSlinky.typescriptCompare.typescriptCompareBooleans.`true`
        ]
      ], 
      typingsSlinky.typescriptLogic.mod.And[
        typingsSlinky.typescriptCompare.mod.Extends[A, B], 
        typingsSlinky.typescriptCompare.mod.Extends[B, A]
      ]
    ]
  ]
  type Extends[A, B] = typingsSlinky.typescriptLogic.mod.Or[
    typingsSlinky.typescriptCompare.mod.Any[B], 
    typingsSlinky.typescriptLogic.mod.If[
      typingsSlinky.typescriptCompare.mod.Any[A], 
      typingsSlinky.typescriptCompare.mod.Any[B], 
      typingsSlinky.typescriptCompare.mod.prv.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = typingsSlinky.typescriptLogic.mod.Not[typingsSlinky.typescriptCompare.mod.Any[Type]]
  type NotEqual[A, B] = typingsSlinky.typescriptLogic.mod.Not[typingsSlinky.typescriptCompare.mod.Equal[A, B]]
}
