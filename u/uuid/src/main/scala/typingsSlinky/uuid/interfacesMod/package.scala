package typingsSlinky.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type InputBuffer = typingsSlinky.std.ArrayLike[scala.Double]
  
  type OutputBuffer = typingsSlinky.std.ArrayLike[scala.Double]
  
  type v1 = typingsSlinky.uuid.interfacesMod.v1Buffer with typingsSlinky.uuid.interfacesMod.v1String
  
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[typingsSlinky.uuid.interfacesMod.V1Options | scala.Null], 
    /* buffer */ typingsSlinky.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.interfacesMod.OutputBuffer
  ]
  
  type v1String = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.uuid.interfacesMod.V1Options], 
    java.lang.String
  ]
  
  type v3 = typingsSlinky.uuid.interfacesMod.v3Buffer with typingsSlinky.uuid.interfacesMod.v3String with typingsSlinky.uuid.interfacesMod.v3Static
  
  type v3Buffer = js.Function4[
    /* name */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typingsSlinky.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.interfacesMod.OutputBuffer
  ]
  
  type v3String = js.Function2[
    /* name */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
  
  type v4 = typingsSlinky.uuid.interfacesMod.v4Buffer with typingsSlinky.uuid.interfacesMod.v4String
  
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[typingsSlinky.uuid.interfacesMod.V4Options | scala.Null], 
    /* buffer */ typingsSlinky.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.interfacesMod.OutputBuffer
  ]
  
  type v4String = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.uuid.interfacesMod.V4Options], 
    java.lang.String
  ]
  
  type v5 = typingsSlinky.uuid.interfacesMod.v5Buffer with typingsSlinky.uuid.interfacesMod.v5String with typingsSlinky.uuid.interfacesMod.v5Static
  
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typingsSlinky.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsSlinky.uuid.interfacesMod.OutputBuffer
  ]
  
  type v5String = js.Function2[
    /* name */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsSlinky.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
}
