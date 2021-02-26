package typingsSlinky.typedarrayPool

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typedarray-pool", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  
  @JSImport("typedarray-pool", "free")
  @js.native
  def free(array: js.Any): Unit = js.native
  
  @JSImport("typedarray-pool", "freeArrayBuffer")
  @js.native
  def freeArrayBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
  
  @JSImport("typedarray-pool", "freeBuffer")
  @js.native
  def freeBuffer(buffer: js.Any): Unit = js.native
  
  @JSImport("typedarray-pool", "freeDataView")
  @js.native
  def freeDataView(view: js.typedarray.DataView): Unit = js.native
  
  @JSImport("typedarray-pool", "freeDouble")
  @js.native
  def freeDouble(array: js.typedarray.Float64Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeFloat")
  @js.native
  def freeFloat(array: js.typedarray.Float32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt16")
  @js.native
  def freeInt16(array: js.typedarray.Int16Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt32")
  @js.native
  def freeInt32(array: js.typedarray.Int32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt8")
  @js.native
  def freeInt8(array: js.typedarray.Int8Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint16")
  @js.native
  def freeUint16(array: js.typedarray.Uint16Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint32")
  @js.native
  def freeUint32(array: js.typedarray.Uint32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint8")
  @js.native
  def freeUint8(array: js.typedarray.Uint8Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint8Clamped")
  @js.native
  def freeUint8Clamped(array: js.typedarray.Uint8ClampedArray): Unit = js.native
  
  @JSImport("typedarray-pool", "malloc")
  @js.native
  def malloc(n: Double): js.Any = js.native
  @JSImport("typedarray-pool", "malloc")
  @js.native
  def malloc(n: Double, dtype: DataType): js.Any = js.native
  
  @JSImport("typedarray-pool", "mallocArrayBuffer")
  @js.native
  def mallocArrayBuffer(n: Double): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("typedarray-pool", "mallocBuffer")
  @js.native
  def mallocBuffer(n: Double): js.Any = js.native
  
  @JSImport("typedarray-pool", "mallocDataView")
  @js.native
  def mallocDataView(n: Double): js.typedarray.DataView = js.native
  
  @JSImport("typedarray-pool", "mallocDouble")
  @js.native
  def mallocDouble(n: Double): js.typedarray.Float64Array = js.native
  
  @JSImport("typedarray-pool", "mallocFloat")
  @js.native
  def mallocFloat(n: Double): js.typedarray.Float32Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt16")
  @js.native
  def mallocInt16(n: Double): js.typedarray.Int16Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt32")
  @js.native
  def mallocInt32(n: Double): js.typedarray.Int32Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt8")
  @js.native
  def mallocInt8(n: Double): js.typedarray.Int8Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint16")
  @js.native
  def mallocUint16(n: Double): js.typedarray.Uint16Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint32")
  @js.native
  def mallocUint32(n: Double): js.typedarray.Uint32Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint8")
  @js.native
  def mallocUint8(n: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint8Clamped")
  @js.native
  def mallocUint8Clamped(n: Double): js.typedarray.Uint8ClampedArray = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint16
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint32
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.int8
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.int16
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.int32
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.float
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.float32
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.double
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.float64
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.arraybuffer
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.data
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.dataview
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8_clamped
    - typingsSlinky.typedarrayPool.typedarrayPoolStrings.buffer
  */
  trait DataType extends StObject
  object DataType {
    
    @scala.inline
    def arraybuffer: typingsSlinky.typedarrayPool.typedarrayPoolStrings.arraybuffer = "arraybuffer".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.arraybuffer]
    
    @scala.inline
    def buffer: typingsSlinky.typedarrayPool.typedarrayPoolStrings.buffer = "buffer".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.buffer]
    
    @scala.inline
    def data: typingsSlinky.typedarrayPool.typedarrayPoolStrings.data = "data".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.data]
    
    @scala.inline
    def dataview: typingsSlinky.typedarrayPool.typedarrayPoolStrings.dataview = "dataview".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.dataview]
    
    @scala.inline
    def double: typingsSlinky.typedarrayPool.typedarrayPoolStrings.double = "double".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.double]
    
    @scala.inline
    def float: typingsSlinky.typedarrayPool.typedarrayPoolStrings.float = "float".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.float]
    
    @scala.inline
    def float32: typingsSlinky.typedarrayPool.typedarrayPoolStrings.float32 = "float32".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.float32]
    
    @scala.inline
    def float64: typingsSlinky.typedarrayPool.typedarrayPoolStrings.float64 = "float64".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.float64]
    
    @scala.inline
    def int16: typingsSlinky.typedarrayPool.typedarrayPoolStrings.int16 = "int16".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.int16]
    
    @scala.inline
    def int32: typingsSlinky.typedarrayPool.typedarrayPoolStrings.int32 = "int32".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.int32]
    
    @scala.inline
    def int8: typingsSlinky.typedarrayPool.typedarrayPoolStrings.int8 = "int8".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.int8]
    
    @scala.inline
    def uint16: typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint16 = "uint16".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint16]
    
    @scala.inline
    def uint32: typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint32 = "uint32".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint32]
    
    @scala.inline
    def uint8: typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8 = "uint8".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8]
    
    @scala.inline
    def uint8_clamped: typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typingsSlinky.typedarrayPool.typedarrayPoolStrings.uint8_clamped]
  }
}
