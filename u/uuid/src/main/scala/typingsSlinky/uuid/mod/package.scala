package typingsSlinky.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InputBuffer = typingsSlinky.std.ArrayLike[scala.Double]
  
  type NIL = java.lang.String
  
  // Uses ArrayLike to admit Unit8 and co.
  type OutputBuffer = typingsSlinky.std.ArrayLike[scala.Double]
  
  type parse = js.Function1[/* uuid */ java.lang.String, typingsSlinky.uuid.mod.OutputBuffer]
  
  type stringify = js.Function2[
    /* buffer */ typingsSlinky.uuid.mod.InputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  
  type v1 = typingsSlinky.uuid.mod.v1Buffer with typingsSlinky.uuid.mod.v1String
  
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[typingsSlinky.uuid.mod.V1Options | scala.Null], 
    /* buffer */ typingsSlinky.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.mod.OutputBuffer
  ]
  
  type v1String = js.Function1[/* options */ js.UndefOr[typingsSlinky.uuid.mod.V1Options], java.lang.String]
  
  type v3 = typingsSlinky.uuid.mod.v3Buffer with typingsSlinky.uuid.mod.v3String with typingsSlinky.uuid.mod.v3Static
  
  type v3Buffer = js.Function4[
    /* name */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* buffer */ typingsSlinky.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.mod.OutputBuffer
  ]
  
  type v3String = js.Function2[
    /* name */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    java.lang.String
  ]
  
  type v4 = typingsSlinky.uuid.mod.v4Buffer with typingsSlinky.uuid.mod.v4String
  
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[typingsSlinky.uuid.mod.V4Options | scala.Null], 
    /* buffer */ typingsSlinky.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.mod.OutputBuffer
  ]
  
  type v4String = js.Function1[/* options */ js.UndefOr[typingsSlinky.uuid.mod.V4Options], java.lang.String]
  
  type v5 = typingsSlinky.uuid.mod.v5Buffer with typingsSlinky.uuid.mod.v5String with typingsSlinky.uuid.mod.v5Static
  
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* buffer */ typingsSlinky.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.mod.OutputBuffer
  ]
  
  type v5String = js.Function2[
    /* name */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.mod.InputBuffer, 
    java.lang.String
  ]
  
  type validate = js.Function1[/* uuid */ java.lang.String, scala.Boolean]
  
  type version = js.Function1[/* uuid */ java.lang.String, scala.Double]
}
