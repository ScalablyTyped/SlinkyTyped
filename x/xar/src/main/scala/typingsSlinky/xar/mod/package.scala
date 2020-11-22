package typingsSlinky.xar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* file */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    /* content */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GetTOCCallback = js.Function4[
    /* error */ js.Error | scala.Null, 
    /* xmlBuffer */ typingsSlinky.node.Buffer, 
    /* json */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    /* header */ typingsSlinky.xar.mod.TOCHeader, 
    scala.Unit
  ]
}
