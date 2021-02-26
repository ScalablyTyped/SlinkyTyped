package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.bool
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.complex64
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.float32
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.int32
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.string
import typingsSlinky.tensorflowTfjsCore.anon.KeptDims
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.FlatVector
import typingsSlinky.tensorflowTfjsCore.distTypesMod.NumericDataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.arraysEqual")
  @js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.assert")
  @js.native
  def assert(expr: Boolean, msg: js.Function0[String]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.assertNonNegativeIntegerDimensions")
  @js.native
  def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.assertNonNull")
  @js.native
  def assertNonNull(a: TensorLike): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.bytesFromStringArray")
  @js.native
  def bytesFromStringArray(arr: js.Array[js.typedarray.Uint8Array]): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.bytesPerElement")
  @js.native
  def bytesPerElement(dtype: DataType): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: js.typedarray.Uint8Array, dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: js.typedarray.Float32Array, dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: js.typedarray.Float32Array, dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: js.typedarray.Int32Array, dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.checkConversionForErrors")
  @js.native
  def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.clamp")
  @js.native
  def clamp(min: Double, x: Double, max: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.computeStrides")
  @js.native
  def computeStrides(shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.createScalarValue")
  @js.native
  def createScalarValue(value: DataType, dtype: DataType): BackendValues = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.createShuffledIndices")
  @js.native
  def createShuffledIndices(n: Double): js.typedarray.Uint32Array = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.decodeString")
  @js.native
  def decodeString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.decodeString")
  @js.native
  def decodeString(bytes: js.typedarray.Uint8Array, encoding: String): String = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.distSquared")
  @js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.encodeString")
  @js.native
  def encodeString(s: String): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.encodeString")
  @js.native
  def encodeString(s: String, encoding: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.fetch")
  @js.native
  def fetch(path: String): js.Promise[Response] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.fetch")
  @js.native
  def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: String): js.Array[String] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: String, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[String] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: String, result: js.Array[String]): js.Array[String] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: String, result: js.Array[String], skipTypedArray: Boolean): js.Array[String] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.Promise[Double]): js.Array[js.Promise[Double]] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.Promise[Double], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[js.Promise[Double]] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.Promise[Double], result: js.Array[js.Promise[Double]]): js.Array[js.Promise[Double]] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.Promise[Double], result: js.Array[js.Promise[Double]], skipTypedArray: Boolean): js.Array[js.Promise[Double]] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Float32Array): js.Array[js.typedarray.Float32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Float32Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[js.typedarray.Float32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Float32Array, result: js.Array[js.typedarray.Float32Array]): js.Array[js.typedarray.Float32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(
    arr: js.typedarray.Float32Array,
    result: js.Array[js.typedarray.Float32Array],
    skipTypedArray: Boolean
  ): js.Array[js.typedarray.Float32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Int32Array): js.Array[js.typedarray.Int32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Int32Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[js.typedarray.Int32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Int32Array, result: js.Array[js.typedarray.Int32Array]): js.Array[js.typedarray.Int32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Int32Array, result: js.Array[js.typedarray.Int32Array], skipTypedArray: Boolean): js.Array[js.typedarray.Int32Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Uint8Array): js.Array[js.typedarray.Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Uint8Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[js.typedarray.Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Uint8Array, result: js.Array[js.typedarray.Uint8Array]): js.Array[js.typedarray.Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: js.typedarray.Uint8Array, result: js.Array[js.typedarray.Uint8Array], skipTypedArray: Boolean): js.Array[js.typedarray.Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Boolean): js.Array[Boolean] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Boolean, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Boolean] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Boolean, result: js.Array[Boolean]): js.Array[Boolean] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Boolean, result: js.Array[Boolean], skipTypedArray: Boolean): js.Array[Boolean] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Double, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Double, result: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten(arr: Double, result: js.Array[Double], skipTypedArray: Boolean): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_bool(dtype: bool, size: Double): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_complex64(dtype: complex64, size: Double): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_float32(dtype: float32, size: Double): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_int32(dtype: int32, size: Double): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getArrayFromDType")
  @js.native
  def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.getTypedArrayFromDType")
  @js.native
  def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.hasEncodingLoss")
  @js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.indexToLoc")
  @js.native
  def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.inferDtype")
  @js.native
  def inferDtype(values: TensorLike): DataType = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.inferFromImplicitShape")
  @js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isBoolean")
  @js.native
  def isBoolean(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isFunction")
  @js.native
  def isFunction(f: js.Function): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isInt")
  @js.native
  def isInt(a: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isNumber")
  @js.native
  def isNumber(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isPromise")
  @js.native
  def isPromise(`object`: js.Any): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isScalarShape")
  @js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isString")
  @js.native
  def isString(value: js.Object): /* is string */ Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isTypedArray")
  @js.native
  def isTypedArray(a: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.isValidDtype")
  @js.native
  def isValidDtype(dtype: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.locToIndex")
  @js.native
  def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_bool(shape: js.Array[Double], dtype: bool): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_complex64(shape: js.Array[Double], dtype: complex64): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_float32(shape: js.Array[Double], dtype: float32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_int32(shape: js.Array[Double], dtype: int32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_string(shape: js.Array[Double], dtype: string): Double | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.nearestDivisor")
  @js.native
  def nearestDivisor(size: Double, start: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.nearestLargerEven")
  @js.native
  def nearestLargerEven(`val`: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.parseAxisParam")
  @js.native
  def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.parseAxisParam")
  @js.native
  def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.randUniform")
  @js.native
  def randUniform(a: Double, b: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.UndefOr[scala.Nothing], maxCounter: Double): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.repeatedTry")
  @js.native
  def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.rightPad")
  @js.native
  def rightPad(a: String, size: Double): String = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.shuffle")
  @js.native
  def shuffle(array: js.Array[_]): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Float32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Int32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.shuffle")
  @js.native
  def shuffle(array: js.typedarray.Uint32Array): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.sizeFromShape")
  @js.native
  def sizeFromShape(shape: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.sizeToSquarishShape")
  @js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double]): KeptDims = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.sum")
  @js.native
  def sum(arr: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.tanh")
  @js.native
  def tanh(x: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.toNestedArray")
  @js.native
  def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "util.toTypedArray")
  @js.native
  def toTypedArray(a: TensorLike, dtype: DataType): TypedArray = js.native
}
