package typingsSlinky.spected

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, scala.Boolean]
  type Result[INPUT, SPEC] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: true | std.Array<any> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias spected.spected.Result<INPUT[key], any> * / object}
    */ typingsSlinky.spected.spectedStrings.Result with org.scalablytyped.runtime.TopLevel[js.Any]
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[
    typingsSlinky.spected.mod.Predicate[INPUT, ROOTINPUT], 
    typingsSlinky.spected.mod.ErrorMsg[INPUT]
  ]
  type SpecArray[INPUT, ROOTINPUT] = js.Array[typingsSlinky.spected.mod.Spec[INPUT, ROOTINPUT]]
  type SpecFunction[INPUT, ROOTINPUT] = js.Function1[
    /* value */ INPUT, 
    (js.Array[typingsSlinky.spected.mod.SpecArray[js.Any, ROOTINPUT]]) | (typingsSlinky.spected.mod.SpecArray[INPUT, ROOTINPUT]) | (typingsSlinky.spected.mod.SpecObject[INPUT, ROOTINPUT])
  ]
  type SpecObject[INPUT, ROOTINPUT] = typingsSlinky.std.Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>}
    */ typingsSlinky.spected.spectedStrings.SpecObject with org.scalablytyped.runtime.TopLevel[INPUT]
  ]
}
