package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialization {
  
  @JSImport("@tensorflow/tfjs-node", "serialization.Serializable")
  @js.native
  abstract class Serializable ()
    extends typingsSlinky.tensorflowTfjs.mod.serialization.Serializable
  /* static members */
  object Serializable {
    
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-node", "serialization.Serializable.fromConfig")
    @js.native
    def fromConfig[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "serialization.SerializationMap")
  @js.native
  class SerializationMap protected ()
    extends typingsSlinky.tensorflowTfjs.mod.serialization.SerializationMap
  /* static members */
  object SerializationMap {
    
    @JSImport("@tensorflow/tfjs-node", "serialization.SerializationMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of the map.
      */
    @JSImport("@tensorflow/tfjs-node", "serialization.SerializationMap.getMap")
    @js.native
    def getMap(): typingsSlinky.tensorflowTfjsCore.serializationMod.SerializationMap = js.native
    
    @JSImport("@tensorflow/tfjs-node", "serialization.SerializationMap.instance")
    @js.native
    def instance: js.Any = js.native
    @scala.inline
    def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Registers the class as serializable.
      */
    @JSImport("@tensorflow/tfjs-node", "serialization.SerializationMap.register")
    @js.native
    def register[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "serialization.registerClass")
  @js.native
  def registerClass[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
}
