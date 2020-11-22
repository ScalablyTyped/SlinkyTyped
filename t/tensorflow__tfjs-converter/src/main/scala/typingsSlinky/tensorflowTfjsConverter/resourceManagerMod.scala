package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.hashTableMod.HashTable
import typingsSlinky.tensorflowTfjsConverter.typesMod.HashTableMap
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/resource_manager", JSImport.Namespace)
@js.native
object resourceManagerMod extends js.Object {
  
  @js.native
  class ResourceManager () extends js.Object {
    def this(hashTableNameToHandle: NamedTensorMap) = this()
    def this(hashTableNameToHandle: js.UndefOr[scala.Nothing], hashTableMap: HashTableMap) = this()
    def this(hashTableNameToHandle: NamedTensorMap, hashTableMap: HashTableMap) = this()
    
    /**
      * Register a `HashTable` in the resource manager.
      *
      * The `HashTable` can be retrieved by `resourceManager.getHashTableById`,
      * where id is the table handle tensor's id.
      *
      * @param name Op node name that creates the `HashTable`.
      * @param hashTable The `HashTable` to be added to resource manager.
      */
    def addHashTable(name: String, hashTable: HashTable): Unit = js.native
    
    /**
      * Dispose `ResourceManager`, including its hashTables and tensors in them.
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the actual `HashTable` by its handle tensor's id.
      * @param id The id of the handle tensor.
      */
    def getHashTableById(id: Double): HashTable = js.native
    
    /**
      * Get the table handle by node name.
      * @param name Op node name that creates the `HashTable`. This name is also
      *     used in the inputs list of lookup and import `HashTable` ops.
      */
    def getHashTableHandleByName(name: String): Tensor[Rank] = js.native
    
    val hashTableMap: HashTableMap = js.native
    
    val hashTableNameToHandle: NamedTensorMap = js.native
  }
}
