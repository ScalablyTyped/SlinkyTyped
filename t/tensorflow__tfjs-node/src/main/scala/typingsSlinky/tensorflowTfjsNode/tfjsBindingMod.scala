package typingsSlinky.tensorflowTfjsNode

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfjsBindingMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/tfjs_binding", "TFEOpAttr")
  @js.native
  class TFEOpAttr () extends StObject {
    
    var name: String = js.native
    
    var `type`: Double = js.native
    
    var value: Boolean | Double | js.Object | String | js.Array[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/tfjs_binding", "TensorMetadata")
  @js.native
  class TensorMetadata () extends StObject {
    
    var dtype: Double = js.native
    
    var id: Double = js.native
    
    var shape: js.Array[Double] = js.native
  }
  
  @js.native
  trait TFJSBinding extends StObject {
    
    var TFEOpAttr: Instantiable0[typingsSlinky.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr] = js.native
    
    var TF_ATTR_BOOL: Double = js.native
    
    var TF_ATTR_FLOAT: Double = js.native
    
    var TF_ATTR_INT: Double = js.native
    
    var TF_ATTR_RESOURCE: Double = js.native
    
    var TF_ATTR_SHAPE: Double = js.native
    
    var TF_ATTR_STRING: Double = js.native
    
    var TF_ATTR_TYPE: Double = js.native
    
    var TF_BOOL: Double = js.native
    
    var TF_COMPLEX64: Double = js.native
    
    var TF_FLOAT: Double = js.native
    
    var TF_INT32: Double = js.native
    
    var TF_INT64: Double = js.native
    
    var TF_RESOURCE: Double = js.native
    
    var TF_STRING: Double = js.native
    
    var TF_UINT8: Double = js.native
    
    var TF_Version: String = js.native
    
    var TensorMetadata: Instantiable0[typingsSlinky.tensorflowTfjsNode.tfjsBindingMod.TensorMetadata] = js.native
    
    def createTensor(shape: js.Array[Double], dtype: Double, buffer: BackendValues): Double = js.native
    
    def deleteSavedModel(savedModelId: Double): Unit = js.native
    
    def deleteTensor(tensorId: Double): Unit = js.native
    
    def executeOp(opName: String, opAttrs: js.Array[TFEOpAttr], inputTensorIds: js.Array[Double], numOutputs: Double): js.Array[TensorMetadata] = js.native
    
    def getNumOfSavedModels(): Double = js.native
    
    def isUsingGpuDevice(): Boolean = js.native
    
    def loadSavedModel(exportDir: String, tags: String): Double = js.native
    
    def runSavedModel(
      savedModelId: Double,
      inputTensorIds: js.Array[Double],
      inputOpNames: String,
      outputOpNames: String
    ): js.Array[TensorMetadata] = js.native
    
    def tensorDataSync(tensorId: Double): js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array = js.native
  }
  object TFJSBinding {
    
    @scala.inline
    def apply(
      TFEOpAttr: Instantiable0[TFEOpAttr],
      TF_ATTR_BOOL: Double,
      TF_ATTR_FLOAT: Double,
      TF_ATTR_INT: Double,
      TF_ATTR_RESOURCE: Double,
      TF_ATTR_SHAPE: Double,
      TF_ATTR_STRING: Double,
      TF_ATTR_TYPE: Double,
      TF_BOOL: Double,
      TF_COMPLEX64: Double,
      TF_FLOAT: Double,
      TF_INT32: Double,
      TF_INT64: Double,
      TF_RESOURCE: Double,
      TF_STRING: Double,
      TF_UINT8: Double,
      TF_Version: String,
      TensorMetadata: Instantiable0[TensorMetadata],
      createTensor: (js.Array[Double], Double, BackendValues) => Double,
      deleteSavedModel: Double => Unit,
      deleteTensor: Double => Unit,
      executeOp: (String, js.Array[TFEOpAttr], js.Array[Double], Double) => js.Array[TensorMetadata],
      getNumOfSavedModels: () => Double,
      isUsingGpuDevice: () => Boolean,
      loadSavedModel: (String, String) => Double,
      runSavedModel: (Double, js.Array[Double], String, String) => js.Array[TensorMetadata],
      tensorDataSync: Double => js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
    ): TFJSBinding = {
      val __obj = js.Dynamic.literal(TFEOpAttr = TFEOpAttr.asInstanceOf[js.Any], TF_ATTR_BOOL = TF_ATTR_BOOL.asInstanceOf[js.Any], TF_ATTR_FLOAT = TF_ATTR_FLOAT.asInstanceOf[js.Any], TF_ATTR_INT = TF_ATTR_INT.asInstanceOf[js.Any], TF_ATTR_RESOURCE = TF_ATTR_RESOURCE.asInstanceOf[js.Any], TF_ATTR_SHAPE = TF_ATTR_SHAPE.asInstanceOf[js.Any], TF_ATTR_STRING = TF_ATTR_STRING.asInstanceOf[js.Any], TF_ATTR_TYPE = TF_ATTR_TYPE.asInstanceOf[js.Any], TF_BOOL = TF_BOOL.asInstanceOf[js.Any], TF_COMPLEX64 = TF_COMPLEX64.asInstanceOf[js.Any], TF_FLOAT = TF_FLOAT.asInstanceOf[js.Any], TF_INT32 = TF_INT32.asInstanceOf[js.Any], TF_INT64 = TF_INT64.asInstanceOf[js.Any], TF_RESOURCE = TF_RESOURCE.asInstanceOf[js.Any], TF_STRING = TF_STRING.asInstanceOf[js.Any], TF_UINT8 = TF_UINT8.asInstanceOf[js.Any], TF_Version = TF_Version.asInstanceOf[js.Any], TensorMetadata = TensorMetadata.asInstanceOf[js.Any], createTensor = js.Any.fromFunction3(createTensor), deleteSavedModel = js.Any.fromFunction1(deleteSavedModel), deleteTensor = js.Any.fromFunction1(deleteTensor), executeOp = js.Any.fromFunction4(executeOp), getNumOfSavedModels = js.Any.fromFunction0(getNumOfSavedModels), isUsingGpuDevice = js.Any.fromFunction0(isUsingGpuDevice), loadSavedModel = js.Any.fromFunction2(loadSavedModel), runSavedModel = js.Any.fromFunction4(runSavedModel), tensorDataSync = js.Any.fromFunction1(tensorDataSync))
      __obj.asInstanceOf[TFJSBinding]
    }
    
    @scala.inline
    implicit class TFJSBindingMutableBuilder[Self <: TFJSBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTensor(value: (js.Array[Double], Double, BackendValues) => Double): Self = StObject.set(x, "createTensor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteSavedModel(value: Double => Unit): Self = StObject.set(x, "deleteSavedModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteTensor(value: Double => Unit): Self = StObject.set(x, "deleteTensor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecuteOp(value: (String, js.Array[TFEOpAttr], js.Array[Double], Double) => js.Array[TensorMetadata]): Self = StObject.set(x, "executeOp", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetNumOfSavedModels(value: () => Double): Self = StObject.set(x, "getNumOfSavedModels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUsingGpuDevice(value: () => Boolean): Self = StObject.set(x, "isUsingGpuDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadSavedModel(value: (String, String) => Double): Self = StObject.set(x, "loadSavedModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRunSavedModel(value: (Double, js.Array[Double], String, String) => js.Array[TensorMetadata]): Self = StObject.set(x, "runSavedModel", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTFEOpAttr(value: Instantiable0[TFEOpAttr]): Self = StObject.set(x, "TFEOpAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_BOOL(value: Double): Self = StObject.set(x, "TF_ATTR_BOOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_FLOAT(value: Double): Self = StObject.set(x, "TF_ATTR_FLOAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_INT(value: Double): Self = StObject.set(x, "TF_ATTR_INT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_RESOURCE(value: Double): Self = StObject.set(x, "TF_ATTR_RESOURCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_SHAPE(value: Double): Self = StObject.set(x, "TF_ATTR_SHAPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_STRING(value: Double): Self = StObject.set(x, "TF_ATTR_STRING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_ATTR_TYPE(value: Double): Self = StObject.set(x, "TF_ATTR_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_BOOL(value: Double): Self = StObject.set(x, "TF_BOOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_COMPLEX64(value: Double): Self = StObject.set(x, "TF_COMPLEX64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_FLOAT(value: Double): Self = StObject.set(x, "TF_FLOAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_INT32(value: Double): Self = StObject.set(x, "TF_INT32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_INT64(value: Double): Self = StObject.set(x, "TF_INT64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_RESOURCE(value: Double): Self = StObject.set(x, "TF_RESOURCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_STRING(value: Double): Self = StObject.set(x, "TF_STRING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_UINT8(value: Double): Self = StObject.set(x, "TF_UINT8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTF_Version(value: String): Self = StObject.set(x, "TF_Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensorDataSync(value: Double => js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array): Self = StObject.set(x, "tensorDataSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTensorMetadata(value: Instantiable0[TensorMetadata]): Self = StObject.set(x, "TensorMetadata", value.asInstanceOf[js.Any])
    }
  }
}
