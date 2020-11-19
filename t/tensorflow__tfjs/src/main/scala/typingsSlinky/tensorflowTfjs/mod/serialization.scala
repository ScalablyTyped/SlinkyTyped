package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "serialization")
@js.native
object serialization extends js.Object {
  
  def registerClass[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  
  @js.native
  abstract class Serializable ()
    extends typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
  /* static members */
  @js.native
  object Serializable extends js.Object {
    
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    def fromConfig[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  @js.native
  class SerializationMap protected ()
    extends typingsSlinky.tensorflowTfjsCore.mod.serialization.SerializationMap
  /* static members */
  @js.native
  object SerializationMap extends js.Object {
    
    /**
      * Returns the singleton instance of the map.
      */
    def getMap(): typingsSlinky.tensorflowTfjsCore.serializationMod.SerializationMap = js.native
    
    var instance: js.Any = js.native
    
    /**
      * Registers the class as serializable.
      */
    def register[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  }
}
