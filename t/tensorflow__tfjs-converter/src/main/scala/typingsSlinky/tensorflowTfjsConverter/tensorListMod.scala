package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.std.Set
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorListMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "TensorList")
  @js.native
  class TensorList protected () extends StObject {
    /**
      *
      * @param tensors list of tensors
      * @param elementShape shape of each tensor
      * @param elementDtype data type of each tensor
      * @param maxNumElements The maximum allowed size of `tensors`. Defaults to -1
      *   meaning that the size of `tensors` is unbounded.
      */
    def this(tensors: js.Array[Tensor[Rank]], elementShape: js.Array[Double], elementDtype: DataType) = this()
    def this(
      tensors: js.Array[Tensor[Rank]],
      elementShape: js.Array[Double],
      elementDtype: DataType,
      maxNumElements: Double
    ) = this()
    
    /**
      * Dispose the tensors and idTensor and clear the tensor list.
      */
    def clearAndClose(): Unit = js.native
    def clearAndClose(keepIds: Set[Double]): Unit = js.native
    
    /**
      * Return the values in the TensorList as a concatenated Tensor.
      * @param elementDtype output tensor dtype
      * @param elementShape output tensor element shape
      */
    def concat(elementDtype: DataType, elementShape: js.Array[Double]): Tensor[Rank] = js.native
    
    /**
      * Get a new TensorList containing a copy of the underlying tensor container.
      */
    def copy(): TensorList = js.native
    
    val elementDtype: DataType = js.native
    
    val elementShape: js.Array[Double] = js.native
    
    /**
      * Return selected values in the TensorList as a stacked Tensor. All of
      * selected values must have been written and their shapes must all match.
      * @param indices indices of tensors to gather
      * @param elementDtype output tensor dtype
      * @param elementShape output tensor element shape
      */
    def gather(indices: js.Array[Double], elementDtype: DataType, elementShape: js.Array[Double]): Tensor[Rank] = js.native
    
    /**
      * Retrieve the element at the provided index
      * @param elementShape shape of the tensor
      * @param elementDtype dtype of the tensor
      * @param elementIndex index of the tensor
      */
    def getItem(elementIndex: Double, elementShape: js.Array[Double], elementDtype: DataType): Tensor[Rank] = js.native
    
    val id: Double = js.native
    
    val idTensor: Tensor[Rank] = js.native
    
    var maxNumElements: Double = js.native
    
    /**
      * Pop a tensor from the end of the list.
      * @param elementShape shape of the tensor
      * @param elementDtype data type of the tensor
      */
    def popBack(elementShape: js.Array[Double], elementDtype: DataType): Tensor[Rank] = js.native
    
    /**
      * Push a tensor to the end of the list.
      * @param tensor Tensor to be pushed.
      */
    def pushBack(tensor: Tensor[Rank]): Unit = js.native
    
    /**
      * Update the size of the list.
      * @param size the new size of the list.
      */
    def resize(size: Double): Unit = js.native
    
    /**
      * Set the tensor at the index
      * @param elementIndex index of the tensor
      * @param tensor the tensor to be inserted into the list
      */
    def setItem(elementIndex: Double, tensor: Tensor[Rank]): Unit = js.native
    
    /**
      * The size of the tensors in the tensor list.
      */
    def size(): Double = js.native
    
    /**
      * Return a tensor that stacks a list of rank-R tf.Tensors into one rank-(R+1)
      * tf.Tensor.
      * @param elementShape shape of each tensor
      * @param elementDtype data type of each tensor
      * @param numElements the number of elements to stack
      */
    def stack(elementShape: js.Array[Double], elementDtype: DataType): Tensor[Rank] = js.native
    def stack(elementShape: js.Array[Double], elementDtype: DataType, numElements: Double): Tensor[Rank] = js.native
    
    val tensors: js.Array[Tensor[Rank]] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "fromTensor")
  @js.native
  def fromTensor(tensor: Tensor[Rank], elementShape: js.Array[Double], elementDtype: DataType): TensorList = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "reserve")
  @js.native
  def reserve(elementShape: js.Array[Double], elementDtype: DataType, numElements: Double): TensorList = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "scatter")
  @js.native
  def scatter(tensor: Tensor[Rank], indices: js.Array[Double], elementShape: js.Array[Double]): TensorList = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "scatter")
  @js.native
  def scatter(
    tensor: Tensor[Rank],
    indices: js.Array[Double],
    elementShape: js.Array[Double],
    numElements: Double
  ): TensorList = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_list", "split")
  @js.native
  def split(tensor: Tensor[Rank], length: js.Array[Double], elementShape: js.Array[Double]): TensorList = js.native
}
