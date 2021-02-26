package typingsSlinky.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait Rank extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/types", "Rank")
  @js.native
  object Rank extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Rank with String] = js.native
    
    @js.native
    sealed trait R0 extends Rank
    /* "R0" */ val R0: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R0 with String = js.native
    
    @js.native
    sealed trait R1 extends Rank
    /* "R1" */ val R1: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1 with String = js.native
    
    @js.native
    sealed trait R2 extends Rank
    /* "R2" */ val R2: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2 with String = js.native
    
    @js.native
    sealed trait R3 extends Rank
    /* "R3" */ val R3: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3 with String = js.native
    
    @js.native
    sealed trait R4 extends Rank
    /* "R4" */ val R4: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4 with String = js.native
    
    @js.native
    sealed trait R5 extends Rank
    /* "R5" */ val R5: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R5 with String = js.native
    
    @js.native
    sealed trait R6 extends Rank
    /* "R6" */ val R6: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R6 with String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/types", "sumOutType")
  @js.native
  def sumOutType(`type`: DataType): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/types", "upcastType")
  @js.native
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  
  @js.native
  trait ArrayMap extends StObject {
    
    var R0: Double = js.native
    
    var R1: js.Array[Double] = js.native
    
    var R2: js.Array[js.Array[Double]] = js.native
    
    var R3: js.Array[js.Array[js.Array[Double]]] = js.native
    
    var R4: js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
    
    var R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]] = js.native
    
    var R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]] = js.native
  }
  object ArrayMap {
    
    @scala.inline
    def apply(
      R0: Double,
      R1: js.Array[Double],
      R2: js.Array[js.Array[Double]],
      R3: js.Array[js.Array[js.Array[Double]]],
      R4: js.Array[js.Array[js.Array[js.Array[Double]]]],
      R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]],
      R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
    ): ArrayMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayMap]
    }
    
    @scala.inline
    implicit class ArrayMapMutableBuilder[Self <: ArrayMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR0(value: Double): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value :_*))
      
      @scala.inline
      def setR2(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR2Varargs(value: js.Array[Double]*): Self = StObject.set(x, "R2", js.Array(value :_*))
      
      @scala.inline
      def setR3(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR3Varargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "R3", js.Array(value :_*))
      
      @scala.inline
      def setR4(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR4Varargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "R4", js.Array(value :_*))
      
      @scala.inline
      def setR5(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR5Varargs(value: js.Array[js.Array[js.Array[js.Array[Double]]]]*): Self = StObject.set(x, "R5", js.Array(value :_*))
      
      @scala.inline
      def setR6(value: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR6Varargs(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]*): Self = StObject.set(x, "R6", js.Array(value :_*))
    }
  }
  
  type BackendValues = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.Array[js.typedarray.Uint8Array]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
  */
  trait DataType extends StObject
  
  @js.native
  trait DataTypeMap extends StObject {
    
    var bool: js.typedarray.Uint8Array = js.native
    
    var complex64: js.typedarray.Float32Array = js.native
    
    var float32: js.typedarray.Float32Array = js.native
    
    var int32: js.typedarray.Int32Array = js.native
    
    var string: js.Array[String] = js.native
  }
  object DataTypeMap {
    
    @scala.inline
    def apply(
      bool: js.typedarray.Uint8Array,
      complex64: js.typedarray.Float32Array,
      float32: js.typedarray.Float32Array,
      int32: js.typedarray.Int32Array,
      string: js.Array[String]
    ): DataTypeMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTypeMap]
    }
    
    @scala.inline
    implicit class DataTypeMapMutableBuilder[Self <: DataTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBool(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplex64(value: js.typedarray.Float32Array): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
    }
  }
  
  /* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataType] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valueOf
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toString
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toLocaleString
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find
  */
  trait DataValues extends StObject
  object DataValues {
    
    @scala.inline
    def BYTES_PER_ELEMENT: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT = "BYTES_PER_ELEMENT".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT]
    
    @scala.inline
    def buffer: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer = "buffer".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer]
    
    @scala.inline
    def byteLength: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength = "byteLength".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength]
    
    @scala.inline
    def byteOffset: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset = "byteOffset".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset]
    
    @scala.inline
    def concat: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat = "concat".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat]
    
    @scala.inline
    def copyWithin: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin = "copyWithin".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin]
    
    @scala.inline
    def entries: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries = "entries".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries]
    
    @scala.inline
    def every: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every = "every".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every]
    
    @scala.inline
    def fill: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill = "fill".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill]
    
    @scala.inline
    def filter: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter = "filter".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter]
    
    @scala.inline
    def find: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find = "find".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find]
    
    @scala.inline
    def findIndex: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex = "findIndex".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex]
    
    @scala.inline
    def flat: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat = "flat".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat]
    
    @scala.inline
    def flatMap: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap = "flatMap".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap]
    
    @scala.inline
    def forEach: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach = "forEach".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach]
    
    @scala.inline
    def includes: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes = "includes".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes]
    
    @scala.inline
    def indexOf: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf = "indexOf".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf]
    
    @scala.inline
    def join: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join = "join".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join]
    
    @scala.inline
    def keys: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys = "keys".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys]
    
    @scala.inline
    def lastIndexOf: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf = "lastIndexOf".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf]
    
    @scala.inline
    def length: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length = "length".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length]
    
    @scala.inline
    def map: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map = "map".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map]
    
    @scala.inline
    def pop: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop = "pop".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop]
    
    @scala.inline
    def push: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push = "push".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push]
    
    @scala.inline
    def reduce: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce = "reduce".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce]
    
    @scala.inline
    def reduceRight: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight = "reduceRight".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight]
    
    @scala.inline
    def reverse: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse = "reverse".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse]
    
    @scala.inline
    def set: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set = "set".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set]
    
    @scala.inline
    def shift: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift = "shift".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift]
    
    @scala.inline
    def slice: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice = "slice".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice]
    
    @scala.inline
    def some: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some = "some".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some]
    
    @scala.inline
    def sort: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort = "sort".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort]
    
    @scala.inline
    def splice: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice = "splice".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice]
    
    @scala.inline
    def subarray: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray = "subarray".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray]
    
    @scala.inline
    def unshift: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift = "unshift".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift]
    
    @scala.inline
    def values: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values = "values".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values]
  }
  
  type FlatVector = (js.Array[Boolean | Double]) | TypedArray
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
  */
  trait NumericDataType extends StObject
  object NumericDataType {
    
    @scala.inline
    def bool: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool = "bool".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool]
    
    @scala.inline
    def complex64: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64 = "complex64".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64]
    
    @scala.inline
    def float32: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32 = "float32".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32]
    
    @scala.inline
    def int32: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32 = "int32".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32]
  }
  
  @js.native
  trait PixelData extends StObject {
    
    var data: js.typedarray.Uint8Array = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object PixelData {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): PixelData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelData]
    }
    
    @scala.inline
    implicit class PixelDataMutableBuilder[Self <: PixelData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecursiveArray[T /* <: js.Any */] extends /* index */ NumberDictionary[T | RecursiveArray[T]]
  object RecursiveArray {
    
    @scala.inline
    def apply[T /* <: js.Any */](): RecursiveArray[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursiveArray[T]]
    }
  }
  
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  
  type ScalarLike = Double | Boolean | String | js.typedarray.Uint8Array
  
  @js.native
  trait ShapeMap extends StObject {
    
    var R0: js.Array[Double] = js.native
    
    var R1: js.Array[Double] = js.native
    
    var R2: js.Tuple2[Double, Double] = js.native
    
    var R3: js.Tuple3[Double, Double, Double] = js.native
    
    var R4: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var R5: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    var R6: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
  }
  object ShapeMap {
    
    @scala.inline
    def apply(
      R0: js.Array[Double],
      R1: js.Array[Double],
      R2: js.Tuple2[Double, Double],
      R3: js.Tuple3[Double, Double, Double],
      R4: js.Tuple4[Double, Double, Double, Double],
      R5: js.Tuple5[Double, Double, Double, Double, Double],
      R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
    ): ShapeMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeMap]
    }
    
    @scala.inline
    implicit class ShapeMapMutableBuilder[Self <: ShapeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR0(value: js.Array[Double]): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR0Varargs(value: Double*): Self = StObject.set(x, "R0", js.Array(value :_*))
      
      @scala.inline
      def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value :_*))
      
      @scala.inline
      def setR2(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR3(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR4(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR5(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR6(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SingleValueMap extends StObject {
    
    var bool: Boolean = js.native
    
    var complex64: Double = js.native
    
    var float32: Double = js.native
    
    var int32: Double = js.native
    
    var string: String = js.native
  }
  object SingleValueMap {
    
    @scala.inline
    def apply(bool: Boolean, complex64: Double, float32: Double, int32: Double, string: String): SingleValueMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleValueMap]
    }
    
    @scala.inline
    implicit class SingleValueMapMutableBuilder[Self <: SingleValueMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplex64(value: Double): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat32(value: Double): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  type TensorLike = TypedArray | Double | Boolean | String | (RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]) | js.Array[js.typedarray.Uint8Array]
  
  type TensorLike1D = TypedArray | (js.Array[Boolean | Double | String | js.typedarray.Uint8Array])
  
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[Boolean | Double | String | js.typedarray.Uint8Array]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[
      js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[js.Array[(js.Array[Boolean | Double | String]) | js.typedarray.Uint8Array]]
      ]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TypedArray = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
}
