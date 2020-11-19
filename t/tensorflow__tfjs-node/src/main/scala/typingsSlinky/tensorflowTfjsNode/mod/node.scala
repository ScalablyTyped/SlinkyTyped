package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.modelTypesMod.MetaGraph
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsNode.callbacksMod.TensorBoardCallback
import typingsSlinky.tensorflowTfjsNode.callbacksMod.TensorBoardCallbackArgs
import typingsSlinky.tensorflowTfjsNode.savedModelMod.TFSavedModel
import typingsSlinky.tensorflowTfjsNode.tensorboardMod.SummaryFileWriter_
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "node")
@js.native
object node extends js.Object {
  
  def decodeBmp(contents: js.typedarray.Uint8Array): Tensor3D = js.native
  def decodeBmp(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  @JSName("decodeBmp")
  var decodeBmp_Original: js.Function2[/* contents */ js.typedarray.Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D] = js.native
  
  def decodeGif(contents: js.typedarray.Uint8Array): Tensor4D = js.native
  @JSName("decodeGif")
  var decodeGif_Original: js.Function1[/* contents */ js.typedarray.Uint8Array, Tensor4D] = js.native
  
  def decodeImage(content: js.typedarray.Uint8Array): Tensor3D | Tensor4D = js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D | Tensor4D = js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: js.UndefOr[scala.Nothing],
    dtype: String,
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: Double,
    dtype: js.UndefOr[scala.Nothing],
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  @JSName("decodeImage")
  var decodeImage_Original: js.Function4[
    /* content */ js.typedarray.Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[String], 
    /* expandAnimations */ js.UndefOr[Boolean], 
    Tensor3D | Tensor4D
  ] = js.native
  
  def decodeJpeg(
    contents: js.typedarray.Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = js.native
  @JSName("decodeJpeg")
  var decodeJpeg_Original: js.Function7[
    /* contents */ js.typedarray.Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* ratio */ js.UndefOr[Double], 
    /* fancyUpscaling */ js.UndefOr[Boolean], 
    /* tryRecoverTruncated */ js.UndefOr[Boolean], 
    /* acceptableFraction */ js.UndefOr[Double], 
    /* dctMethod */ js.UndefOr[String], 
    Tensor3D
  ] = js.native
  
  def decodePng(contents: js.typedarray.Uint8Array): Tensor3D = js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D = js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
  @JSName("decodePng")
  var decodePng_Original: js.Function3[
    /* contents */ js.typedarray.Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[String], 
    Tensor3D
  ] = js.native
  
  def encodeJpeg(
    image: Tensor3D,
    format: js.UndefOr[_empty | grayscale | rgb],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[in | cm],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("encodeJpeg")
  var encodeJpeg_Original: js.Function10[
    /* image */ Tensor3D, 
    /* format */ js.UndefOr[_empty | grayscale | rgb], 
    /* quality */ js.UndefOr[Double], 
    /* progressive */ js.UndefOr[Boolean], 
    /* optimizeSize */ js.UndefOr[Boolean], 
    /* chromaDownsampling */ js.UndefOr[Boolean], 
    /* densityUnit */ js.UndefOr[in | cm], 
    /* xDensity */ js.UndefOr[Double], 
    /* yDensity */ js.UndefOr[Double], 
    /* xmpMetadata */ js.UndefOr[String], 
    js.Promise[js.typedarray.Uint8Array]
  ] = js.native
  
  def encodePng(image: Tensor3D): js.Promise[js.typedarray.Uint8Array] = js.native
  def encodePng(image: Tensor3D, compression: Double): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("encodePng")
  var encodePng_Original: js.Function2[
    /* image */ Tensor3D, 
    /* compression */ js.UndefOr[Double], 
    js.Promise[js.typedarray.Uint8Array]
  ] = js.native
  
  def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
  @JSName("getMetaGraphsFromSavedModel")
  var getMetaGraphsFromSavedModel_Original: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]] = js.native
  
  def getNumOfSavedModels(): Double = js.native
  @JSName("getNumOfSavedModels")
  var getNumOfSavedModels_Original: js.Function0[Double] = js.native
  
  def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.UndefOr[scala.Nothing], signature: String): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
  @JSName("loadSavedModel")
  var loadSavedModel_Original: js.Function3[
    /* path */ String, 
    /* tags */ js.UndefOr[js.Array[String]], 
    /* signature */ js.UndefOr[String], 
    js.Promise[TFSavedModel]
  ] = js.native
  
  def summaryFileWriter(logdir: String): SummaryFileWriter_ = js.native
  def summaryFileWriter(
    logdir: String,
    maxQueue: js.UndefOr[scala.Nothing],
    flushMillis: js.UndefOr[scala.Nothing],
    filenameSuffix: String
  ): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: js.UndefOr[scala.Nothing], filenameSuffix: String): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
  @JSName("summaryFileWriter")
  var summaryFileWriter_Original: js.Function4[
    /* logdir */ String, 
    /* maxQueue */ js.UndefOr[Double], 
    /* flushMillis */ js.UndefOr[Double], 
    /* filenameSuffix */ js.UndefOr[String], 
    SummaryFileWriter_
  ] = js.native
  
  def tensorBoard(): TensorBoardCallback = js.native
  def tensorBoard(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  def tensorBoard(logdir: String): TensorBoardCallback = js.native
  def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  @JSName("tensorBoard")
  var tensorBoard_Original: js.Function2[
    /* logdir */ js.UndefOr[String], 
    /* args */ js.UndefOr[TensorBoardCallbackArgs], 
    TensorBoardCallback
  ] = js.native
}
