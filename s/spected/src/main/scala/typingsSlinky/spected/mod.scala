package typingsSlinky.spected

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spected", JSImport.Default)
  @js.native
  def default[ROOTINPUT, SPEC /* <: SpecValue[ROOTINPUT, ROOTINPUT] */](spec: SPEC, input: ROOTINPUT): Result[ROOTINPUT, SPEC] = js.native
  
  type ErrorMsg[INPUT] = js.UndefOr[
    String | Double | Boolean | js.Symbol | Null | js.Object | (js.Function2[/* value */ INPUT, /* field */ String, js.Any])
  ]
  
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, Boolean]
  
  type Result[INPUT, SPEC] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: true | std.Array<any> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias spected.spected.Result<INPUT[key], any> * / object}
    */ typingsSlinky.spected.spectedStrings.Result with TopLevel[js.Any]
  
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[Predicate[INPUT, ROOTINPUT], ErrorMsg[INPUT]]
  
  type SpecArray[INPUT, ROOTINPUT] = js.Array[Spec[INPUT, ROOTINPUT]]
  
  type SpecFunction[INPUT, ROOTINPUT] = js.Function1[
    /* value */ INPUT, 
    (js.Array[SpecArray[js.Any, ROOTINPUT]]) | (SpecArray[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
  ]
  
  type SpecObject[INPUT, ROOTINPUT] = Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>}
    */ typingsSlinky.spected.spectedStrings.SpecObject with TopLevel[INPUT]
  ]
  
  type SpecValue[INPUT, ROOTINPUT] = (SpecArray[INPUT, ROOTINPUT]) | (SpecFunction[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
}
