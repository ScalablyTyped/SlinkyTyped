package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serializationMod {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDictArray
    - typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
  */
  type ConfigDictValue = typingsSlinky.tensorflowTfjsCore.serializationMod._ConfigDictValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
  
  type FromConfigMethod[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */] = js.Function2[
    /* cls */ typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor[T], 
    /* config */ typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict, 
    T
  ]
}
