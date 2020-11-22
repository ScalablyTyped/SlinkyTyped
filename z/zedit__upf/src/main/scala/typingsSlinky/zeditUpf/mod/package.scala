package typingsSlinky.zeditUpf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExectuteCTX[S, L] = js.Tuple4[typingsSlinky.xelib.mod.FileHandle, typingsSlinky.zeditUpf.mod.Helpers, S, L]
  
  type JSONAble = scala.Double | scala.Boolean | java.lang.String | scala.Null | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @zedit/upf.@zedit/upf.JSONAble */ js.Object
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @zedit/upf.@zedit/upf.JSONAble */ js.Object
  ])
  
  type LegacyPatcher[S, L] = (typingsSlinky.zeditUpf.mod.Patcher[S, L]) with (typingsSlinky.zeditUpf.anon.RequiredFiles | (typingsSlinky.zeditUpf.anon.Execute[S, L]))
  
  type ProcessBlock[S, L] = (typingsSlinky.zeditUpf.anon.Load | (typingsSlinky.zeditUpf.anon.Records[S, L])) with (typingsSlinky.zeditUpf.anon.Patch[S, L])
}
