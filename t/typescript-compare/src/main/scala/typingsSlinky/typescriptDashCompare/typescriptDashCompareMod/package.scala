package typingsSlinky.typescriptDashCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashCompareMod {
  import typingsSlinky.typescriptDashCompare.typescriptDashCompareBooleans.`true`
  import typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.Compare.Options
  import typingsSlinky.typescriptDashCompare.typescriptDashCompareNumbers.`0`
  import typingsSlinky.typescriptDashCompare.typescriptDashCompareNumbers.`1`
  import typingsSlinky.typescriptDashLogic.typescriptDashLogicMod.And
  import typingsSlinky.typescriptDashLogic.typescriptDashLogicMod.If
  import typingsSlinky.typescriptDashLogic.typescriptDashLogicMod.Not
  import typingsSlinky.typescriptDashLogic.typescriptDashLogicMod.Or

  type Any[Type] = And[
    typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[Type, `0`], 
    typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[Type, `1`]
  ]
  type Compare[A, B, Options /* <: Options */] = If[
    Extends[A, B], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = Or[
    And[Any[A], Any[B]], 
    And[
      And[NotAny[A, `true`, `true`], NotAny[B, `true`, `true`]], 
      And[Extends[A, B], Extends[B, A]]
    ]
  ]
  type Extends[A, B] = Or[
    Any[B], 
    If[
      Any[A], 
      Any[B], 
      typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = Not[Any[Type]]
  type NotEqual[A, B] = Not[Equal[A, B]]
}
