package typingsSlinky.tensorflowTfjsCore.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.tensorflowTfjsCore.anon.KeptDims
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.FlatVector
import typingsSlinky.tensorflowTfjsCore.distTypesMod.NumericDataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("@tensorflow/tfjs-core", "util.arraysEqual")
  @js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.assert")
  @js.native
  def assert(expr: Boolean, msg: js.Function0[String]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.assertNonNegativeIntegerDimensions")
  @js.native
  def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.assertNonNull")
  @js.native
  def assertNonNull(a: TensorLike): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.bytesFromStringArray")
  @js.native
  def bytesFromStringArray(arr: js.Array[js.typedarray.Uint8Array]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.bytesPerElement")
  @js.native
  def bytesPerElement(dtype: DataType): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: js.typedarray.Uint8Array, dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: js.typedarray.Float32Array, dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: js.typedarray.Float32Array, dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: js.typedarray.Int32Array, dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.clamp")
  @js.native
  def clamp(min: Double, x: Double, max: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.computeStrides")
  @js.native
  def computeStrides(shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.createScalarValue")
  @js.native
  def createScalarValue(value: DataType, dtype: DataType): BackendValues = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.createShuffledIndices")
  @js.native
  def createShuffledIndices(n: Double): js.typedarray.Uint32Array = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.decodeString")
  @js.native
  def decodeString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSImport("@tensorflow/tfjs-core", "util.decodeString")
  @js.native
  def decodeString(bytes: js.typedarray.Uint8Array, encoding: String): String = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.distSquared")
  @js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.encodeString")
  @js.native
  def encodeString(s: String): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.encodeString")
  @js.native
  def encodeString(s: String, encoding: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.fetch")
  @js.native
  def fetch(path: String): js.Promise[Response] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.fetch")
  @js.native
  def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_bool(dtype: bool, size: Double): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_complex64(dtype: complex64, size: Double): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_float32(dtype: float32, size: Double): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_int32(dtype: int32, size: Double): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.getTypedArrayFromDType")
  @js.native
  def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.hasEncodingLoss")
  @js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.indexToLoc")
  @js.native
  def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.inferDtype")
  @js.native
  def inferDtype(values: TensorLike): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.inferFromImplicitShape")
  @js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isBoolean")
  @js.native
  def isBoolean(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isFunction")
  @js.native
  def isFunction(f: js.Function): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isInt")
  @js.native
  def isInt(a: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isNumber")
  @js.native
  def isNumber(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isPromise")
  @js.native
  def isPromise(`object`: js.Any): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isScalarShape")
  @js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isString")
  @js.native
  def isString(value: js.Object): /* is string */ Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isTypedArray")
  @js.native
  def isTypedArray(a: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.isValidDtype")
  @js.native
  def isValidDtype(dtype: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.locToIndex")
  @js.native
  def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_bool(shape: js.Array[Double], dtype: bool): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_complex64(shape: js.Array[Double], dtype: complex64): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_float32(shape: js.Array[Double], dtype: float32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_int32(shape: js.Array[Double], dtype: int32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_string(shape: js.Array[Double], dtype: string): Double | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.nearestDivisor")
  @js.native
  def nearestDivisor(size: Double, start: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.nearestLargerEven")
  @js.native
  def nearestLargerEven(`val`: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.parseAxisParam")
  @js.native
  def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.parseAxisParam")
  @js.native
  def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.randUniform")
  @js.native
  def randUniform(a: Double, b: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.UndefOr[scala.Nothing], maxCounter: Double): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core", "util.repeatedTry")
  @js.native
  def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.rightPad")
  @js.native
  def rightPad(a: String, size: Double): String = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.shuffle")
  @js.native
  def shuffle(array: js.Array[_]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Float32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Int32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Uint32Array): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.sizeFromShape")
  @js.native
  def sizeFromShape(shape: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.sizeToSquarishShape")
  @js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double]): KeptDims = js.native
  @JSImport("@tensorflow/tfjs-core", "util.squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.sum")
  @js.native
  def sum(arr: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.tanh")
  @js.native
  def tanh(x: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.toNestedArray")
  @js.native
  def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "util.toTypedArray")
  @js.native
  def toTypedArray(a: TensorLike, dtype: DataType): TypedArray = js.native
}
