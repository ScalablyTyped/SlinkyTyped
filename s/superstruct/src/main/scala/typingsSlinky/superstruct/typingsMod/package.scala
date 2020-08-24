package typingsSlinky.superstruct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsMod {
  type Coercer = js.Function1[/* value */ js.Any, js.Any]
  type Infer[T /* <: typingsSlinky.superstruct.structMod.Struct[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['TYPE'] */ js.Any
  type Refiner[T] = js.Function2[
    /* value */ T, 
    /* context */ typingsSlinky.superstruct.typingsMod.Context, 
    typingsSlinky.superstruct.typingsMod.Result
  ]
  type Result = scala.Boolean | js.Iterable[typingsSlinky.superstruct.typingsMod.Failure]
  type Validator = js.Function2[
    /* value */ js.Any, 
    /* context */ typingsSlinky.superstruct.typingsMod.Context, 
    typingsSlinky.superstruct.typingsMod.Result
  ]
}
