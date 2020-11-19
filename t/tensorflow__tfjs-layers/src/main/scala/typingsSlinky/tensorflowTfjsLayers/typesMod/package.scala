package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type PyJson[Keys /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    */ typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PyJson with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonArray
    - typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
  */
  type PyJsonValue = typingsSlinky.tensorflowTfjsLayers.typesMod._PyJsonValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
}
